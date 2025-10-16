package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.junit.jupiter.MockitoExtension;
import org.mockito.junit.jupiter.MockitoSettings;
import org.mockito.quality.Strictness;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Comprehensive JUnit 5 tests for the constructor and write method of org.apache.bookkeeper.bookie.BufferedChannel.
 */
@ExtendWith(MockitoExtension.class)
@MockitoSettings(strictness = Strictness.LENIENT) // Use lenient setting to avoid UnnecessaryStubbingException for shared mock setup
@DisplayName("BufferedChannel Tests")
class LLMBufferedChannelTest {

    private static final int WRITE_CAPACITY = 1024;
    private static final int READ_CAPACITY = 1024;
    private final ByteBufAllocator allocator = UnpooledByteBufAllocator.DEFAULT;

    @TempDir
    Path tempDir;
    private File testFile;
    private FileChannel realFileChannel;

    @BeforeEach
    void setUp() throws IOException {
        testFile = tempDir.resolve("test.log").toFile();
        // "rw" mode creates the file if it doesn't exist
        realFileChannel = new RandomAccessFile(testFile, "rw").getChannel();
    }

    @AfterEach
    void tearDown() throws IOException {
        if (realFileChannel != null && realFileChannel.isOpen()) {
            realFileChannel.close();
        }
    }

    /**
     * Creates a stateful mock of FileChannel that tracks its position.
     * This is crucial for verifying interactions without a real file system.
     */
    private FileChannel createStatefulMockFileChannel(long initialPosition) throws IOException {
        FileChannel mockFc = mock(FileChannel.class);
        final AtomicLong position = new AtomicLong(initialPosition);

        when(mockFc.position()).thenAnswer(inv -> position.get());

        // Mock write(ByteBuffer) to update position
        when(mockFc.write(any(ByteBuffer.class))).thenAnswer(invocation -> {
            ByteBuffer buffer = invocation.getArgument(0);
            int bytesWritten = buffer.remaining();
            position.addAndGet(bytesWritten);
            buffer.position(buffer.limit()); // Consume the buffer
            return bytesWritten;
        });

        // Mock the void force() method using doNothing()
        doNothing().when(mockFc).force(anyBoolean());

        return mockFc;
    }

    @Nested
    @DisplayName("Constructor Tests")
    class ConstructorTests {

        @Test
        @DisplayName("Constructor with Valid Parameters Initializes Correctly")
        void testConstructor_withValidParameters_initializesCorrectly() throws IOException {
            long unpersistedBytesBound = 512;
            try (BufferedChannel channel = new BufferedChannel(allocator, realFileChannel, WRITE_CAPACITY, READ_CAPACITY, unpersistedBytesBound)) {
                assertEquals(0, channel.position(), "Initial position should be 0");
                assertEquals(0, channel.getFileChannelPosition(), "Initial file channel position should be 0");
                assertEquals(0, channel.getNumOfBytesInWriteBuffer(), "Write buffer should be initially empty");
                assertEquals(0, channel.getUnpersistedBytes(), "Unpersisted bytes should be initially 0");
            }
        }

        @Test
        @DisplayName("Constructor with Non-Zero Initial File Position")
        void testConstructor_withNonZeroInitialFilePosition() throws IOException {
            realFileChannel.position(100);
            try (BufferedChannel channel = new BufferedChannel(allocator, realFileChannel, WRITE_CAPACITY, READ_CAPACITY, 0)) {
                assertEquals(100, channel.position(), "Position should match initial file position");
                assertEquals(100, channel.getFileChannelPosition(), "File channel position should match initial file position");
            }
        }

        @ParameterizedTest
        @ValueSource(longs = {0, -1, -100})
        @DisplayName("Constructor with Zero or Negative UnpersistedBytesBound Disables Regular Flushes")
        void testConstructor_withZeroOrNegativeBound_disablesRegularFlushes(long bound) throws IOException {
            FileChannel mockFc = createStatefulMockFileChannel(0);
            try (BufferedChannel channel = new BufferedChannel(allocator, mockFc, 128, 128, bound)) {
                // Write enough data to exceed the write capacity twice, forcing two buffer flushes, but not a forceWrite.
                ByteBuf data = Unpooled.wrappedBuffer(new byte[256]);
                channel.write(data);
                data.release();
            }
            // A flush (fc.write) should happen twice due to buffer being filled twice, but force should not.
            verify(mockFc, times(2)).write(any(ByteBuffer.class));
            verify(mockFc, never()).force(anyBoolean());
        }

        @Test
        @DisplayName("Constructor when FileChannel.position() Throws IOException")
        void testConstructor_whenFileChannelPositionThrows_propagatesException() throws IOException {
            FileChannel mockFc = mock(FileChannel.class);
            when(mockFc.position()).thenThrow(new IOException("Disk error"));

            assertThrows(IOException.class,
                    () -> new BufferedChannel(allocator, mockFc, WRITE_CAPACITY, READ_CAPACITY, 0),
                    "Constructor should propagate IOException from FileChannel.position()");
        }

        @Test
        @DisplayName("Constructor with Negative Write Capacity Throws Exception")
        void testConstructor_withNegativeWriteCapacity_throwsException() {
            assertThrows(IllegalArgumentException.class,
                    () -> new BufferedChannel(allocator, realFileChannel, -1, READ_CAPACITY, 0),
                    "Constructor should throw IllegalArgumentException for negative write capacity");
        }
    }

    @Nested
    @DisplayName("Write Method Tests")
    class WriteMethodTests {

        @Test
        @DisplayName("write() an empty buffer should not change state")
        void testWrite_emptyBuffer() throws IOException {
            try (BufferedChannel channel = new BufferedChannel(allocator, realFileChannel, WRITE_CAPACITY, READ_CAPACITY, 0)) {
                ByteBuf emptyBuf = Unpooled.EMPTY_BUFFER;
                channel.write(emptyBuf);

                assertEquals(0, channel.position());
                assertEquals(0, channel.getNumOfBytesInWriteBuffer());
                assertEquals(0, channel.getUnpersistedBytes());
                assertEquals(0, realFileChannel.position());
            }
        }

        @Test
        @DisplayName("write() a small buffer that does not fill the write buffer")
        void testWrite_smallWriteDoesNotFillBuffer() throws IOException {
            try (BufferedChannel channel = new BufferedChannel(allocator, realFileChannel, WRITE_CAPACITY, READ_CAPACITY, 0)) {
                ByteBuf data = Unpooled.wrappedBuffer(new byte[100]);
                channel.write(data);
                data.release();

                assertEquals(100, channel.position(), "Position should advance by write size");
                assertEquals(100, channel.getNumOfBytesInWriteBuffer(), "Data should be in the write buffer");
                assertEquals(0, realFileChannel.position(), "FileChannel should not be written to yet");
            }
        }

        @Test
        @DisplayName("write() that exactly fills the buffer triggers a flush")
        void testWrite_fillsBufferExactlyTriggersFlush() throws IOException {
            FileChannel mockFc = createStatefulMockFileChannel(0);
            try (BufferedChannel channel = new BufferedChannel(allocator, mockFc, WRITE_CAPACITY, READ_CAPACITY, 0)) {
                ByteBuf data = Unpooled.wrappedBuffer(new byte[WRITE_CAPACITY]);
                channel.write(data);
                data.release();

                assertEquals(WRITE_CAPACITY, channel.position(), "Position should advance by write size");
                assertEquals(0, channel.getNumOfBytesInWriteBuffer(), "Write buffer should be empty after flush");
                assertEquals(WRITE_CAPACITY, mockFc.position(), "FileChannel should be written to");
                verify(mockFc, times(1)).write(any(ByteBuffer.class));
            }
        }

        @Test
        @DisplayName("write() that overfills the buffer triggers a flush and buffers the rest")
        void testWrite_overfillsBufferTriggersFlush() throws IOException {
            FileChannel mockFc = createStatefulMockFileChannel(0);
            int writeSize = WRITE_CAPACITY + 100;
            try (BufferedChannel channel = new BufferedChannel(allocator, mockFc, WRITE_CAPACITY, READ_CAPACITY, 0)) {
                ByteBuf data = Unpooled.wrappedBuffer(new byte[writeSize]);
                channel.write(data);
                data.release();

                assertEquals(writeSize, channel.position(), "Position should advance by full write size");
                assertEquals(100, channel.getNumOfBytesInWriteBuffer(), "Remainder should be in the write buffer");
                assertEquals(WRITE_CAPACITY, mockFc.position(), "FileChannel should be written to with full buffer");
                verify(mockFc, times(1)).write(any(ByteBuffer.class));
            }
        }

        @Test
        @DisplayName("Multiple small writes that overfill the buffer trigger a flush")
        void testWrite_multipleWritesOverfillBuffer() throws IOException {
            FileChannel mockFc = createStatefulMockFileChannel(0);
            try (BufferedChannel channel = new BufferedChannel(allocator, mockFc, WRITE_CAPACITY, READ_CAPACITY, 0)) {
                ByteBuf data1 = Unpooled.wrappedBuffer(new byte[WRITE_CAPACITY - 100]);
                ByteBuf data2 = Unpooled.wrappedBuffer(new byte[200]);

                channel.write(data1);
                assertEquals(WRITE_CAPACITY - 100, channel.getNumOfBytesInWriteBuffer());
                verify(mockFc, never()).write(any(ByteBuffer.class));

                channel.write(data2);
                assertEquals(WRITE_CAPACITY + 100, channel.position());
                // The buffer flushed WRITE_CAPACITY bytes, leaving 100 bytes from the second write
                assertEquals(100, channel.getNumOfBytesInWriteBuffer());
                assertEquals(WRITE_CAPACITY, mockFc.position());
                verify(mockFc, times(1)).write(any(ByteBuffer.class));

                data1.release();
                data2.release();
            }
        }
    }

    @Nested
    @DisplayName("Write Method with UnpersistedBytesBound")
    class WriteMethodWithBoundTests {
        private final long unpersistedBytesBound = 512;

        @Test
        @DisplayName("write() below bound does not trigger force write")
        void testWrite_belowBound_noForceWrite() throws IOException {
            FileChannel mockFc = createStatefulMockFileChannel(0);
            try (BufferedChannel channel = new BufferedChannel(allocator, mockFc, WRITE_CAPACITY, READ_CAPACITY, unpersistedBytesBound)) {
                ByteBuf data = Unpooled.wrappedBuffer(new byte[(int) unpersistedBytesBound - 1]);
                channel.write(data);
                data.release();

                assertEquals(unpersistedBytesBound - 1, channel.getUnpersistedBytes());
                // No flush or force should occur as neither buffer is full nor bound is reached
                verify(mockFc, never()).write(any(ByteBuffer.class));
                verify(mockFc, never()).force(anyBoolean());
            }
        }

        @Test
        @DisplayName("write() that reaches bound exactly triggers flush and force write")
        void testWrite_reachesBoundExactly_triggersFlushAndForce() throws IOException {
            FileChannel mockFc = createStatefulMockFileChannel(0);
            try (BufferedChannel channel = new BufferedChannel(allocator, mockFc, WRITE_CAPACITY, READ_CAPACITY, unpersistedBytesBound)) {
                ByteBuf data = Unpooled.wrappedBuffer(new byte[(int) unpersistedBytesBound]);
                channel.write(data);
                data.release();

                assertEquals(0, channel.getNumOfBytesInWriteBuffer(), "Buffer should be empty after flush triggered by bound");
                assertEquals(0, channel.getUnpersistedBytes(), "Unpersisted bytes should be reset to buffer size (0) after force");
                verify(mockFc, times(1)).write(any(ByteBuffer.class));
                verify(mockFc, times(1)).force(false);
            }
        }

        @Test
        @DisplayName("write() that exceeds bound triggers flush and force write")
        void testWrite_exceedsBound_triggersFlushAndForce() throws IOException {
            FileChannel mockFc = createStatefulMockFileChannel(0);
            try (BufferedChannel channel = new BufferedChannel(allocator, mockFc, WRITE_CAPACITY, READ_CAPACITY, unpersistedBytesBound)) {
                ByteBuf data = Unpooled.wrappedBuffer(new byte[(int) unpersistedBytesBound + 100]);
                channel.write(data);
                data.release();

                assertEquals(0, channel.getNumOfBytesInWriteBuffer(), "Buffer should be empty after flush triggered by bound");
                assertEquals(0, channel.getUnpersistedBytes(), "Unpersisted bytes should be reset to buffer size (0) after force");
                verify(mockFc, times(1)).write(any(ByteBuffer.class));
                verify(mockFc, times(1)).force(false);
            }
        }

        @Test
        @DisplayName("Accumulated writes exceeding bound trigger flush and force write")
        void testWrite_accumulatedWritesExceedBound() throws IOException {
            FileChannel mockFc = createStatefulMockFileChannel(0);
            try (BufferedChannel channel = new BufferedChannel(allocator, mockFc, WRITE_CAPACITY, READ_CAPACITY, unpersistedBytesBound)) {
                ByteBuf data1 = Unpooled.wrappedBuffer(new byte[300]);
                channel.write(data1);

                verify(mockFc, never()).write(any(ByteBuffer.class));
                verify(mockFc, never()).force(anyBoolean());
                assertEquals(300, channel.getUnpersistedBytes());

                ByteBuf data2 = Unpooled.wrappedBuffer(new byte[300]);
                channel.write(data2); // Total 600 bytes, exceeds 512 bound

                verify(mockFc, times(1)).write(any(ByteBuffer.class));
                verify(mockFc, times(1)).force(false);
                assertEquals(0, channel.getNumOfBytesInWriteBuffer(), "Buffer should be empty after flush triggered by bound");
                assertEquals(0, channel.getUnpersistedBytes(), "Unpersisted bytes should be reset to buffer size (0) after force");

                data1.release();
                data2.release();
            }
        }
    }

    @Nested
    @DisplayName("Write Method Exception Handling")
    class WriteMethodExceptionHandlingTests {

        @Test
        @DisplayName("write() propagates IOException when FileChannel.write fails")
        void testWrite_flushThrowsIOException() throws IOException {
            FileChannel mockFc = createStatefulMockFileChannel(0);
            doThrow(new IOException("Disk is full")).when(mockFc).write(any(ByteBuffer.class));

            try (BufferedChannel channel = new BufferedChannel(allocator, mockFc, WRITE_CAPACITY, READ_CAPACITY, 0)) {
                ByteBuf data = Unpooled.wrappedBuffer(new byte[WRITE_CAPACITY]); // This will trigger a flush
                assertThrows(IOException.class, () -> channel.write(data), "IOException from FileChannel.write should be propagated");
                data.release();
            }
        }

        @Test
        @DisplayName("write() propagates IOException when FileChannel.force fails")
        void testWrite_forceWriteThrowsIOException() throws IOException {
            FileChannel mockFc = createStatefulMockFileChannel(0);
            doThrow(new IOException("Force failed")).when(mockFc).force(false);

            long bound = 512;
            try (BufferedChannel channel = new BufferedChannel(allocator, mockFc, WRITE_CAPACITY, READ_CAPACITY, bound)) {
                ByteBuf data = Unpooled.wrappedBuffer(new byte[(int) bound]); // This will trigger a force write
                assertThrows(IOException.class, () -> channel.write(data), "IOException from FileChannel.force should be propagated");
                data.release();
            }
        }
    }
}