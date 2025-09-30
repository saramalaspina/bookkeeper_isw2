package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@DisplayName("Tests for the BufferedChannel.write() method")
class BufferedChannelWriteTest {

    private FileChannel mockFc;
    private ByteBufAllocator allocator;

    @BeforeEach
    void setup() throws IOException {
        mockFc = mock(FileChannel.class);
        final AtomicLong currentPosition = new AtomicLong(0L);

        // When position() is called, return the current value of our position counter.
        when(mockFc.position()).thenAnswer(invocation -> currentPosition.get());

        // When write() is called, simulate what a real FileChannel does:
        // - Consume the buffer's bytes.
        // - Advance the internal position by the number of bytes written.
        // - Return the number of bytes written.
        when(mockFc.write(any(ByteBuffer.class))).thenAnswer(invocation -> {
            ByteBuffer buffer = invocation.getArgument(0);
            int bytesWritten = buffer.remaining();
            currentPosition.addAndGet(bytesWritten);
            buffer.position(buffer.limit());
            return bytesWritten;
        });

        allocator = ByteBufAllocator.DEFAULT;
    }

    /**
     * Helper context class for assertions.
     */
    private static class TestContext {
        final BufferedChannel channel;
        final FileChannel mockFc;
        TestContext(BufferedChannel channel, FileChannel mockFc) {
            this.channel = channel;
            this.mockFc = mockFc;
        }
    }


    private static Stream<Arguments> provideWriteArguments() {
        return Stream.of(
                // --- Test Case 1: Null src ---
                Arguments.of("Null src", null, 1024, 512, 0, NullPointerException.class, null),

                // --- Test Case 2: Failing src mock ---
                Arguments.of("Failing src mock", "FAILING_MOCK", 1024, 512, 0, IllegalStateException.class, null),

                // --- Test Case 3: Empty src ---
                Arguments.of("Empty src", 0, 1024, 512, 0, null,
                        (Consumer<TestContext>) ctx -> {
                            assertAll("State should remain unchanged for empty write",
                                    () -> assertEquals(0, ctx.channel.position()),
                                    () -> assertEquals(0, ctx.channel.getUnpersistedBytes()),
                                    () -> assertEquals(0, ctx.channel.getNumOfBytesInWriteBuffer())
                            );
                            try { verify(ctx.mockFc, never()).write((ByteBuffer) any()); } catch (IOException e) { fail(e); }
                        }),

                // --- Test Case 4: Single byte write (buffering) ---
                Arguments.of("Single byte write (buffering)", 1, 1024, 512, 0, null,
                        (Consumer<TestContext>) ctx -> {
                            assertAll("State after a single byte write",
                                    () -> assertEquals(1, ctx.channel.position()),
                                    () -> assertEquals(1, ctx.channel.getUnpersistedBytes()),
                                    () -> assertEquals(1, ctx.channel.getNumOfBytesInWriteBuffer())
                            );
                            try { verify(ctx.mockFc, never()).write((ByteBuffer) any()); } catch (IOException e) { fail(e); }
                        }),

                // --- Test Case 5: Write up to capacity boundary ---
                Arguments.of("Write up to capacity boundary", 1023, 1024, 0, 0, null,
                        (Consumer<TestContext>) ctx -> {
                            assertAll("State after writing up to boundary",
                                    () -> assertEquals(1023, ctx.channel.position()),
                                    () -> assertEquals(0, ctx.channel.getUnpersistedBytes()),
                                    () -> assertEquals(1023, ctx.channel.getNumOfBytesInWriteBuffer())
                            );
                            try { verify(ctx.mockFc, never()).write((ByteBuffer) any()); } catch (IOException e) { fail(e); }
                        }),

                // --- Test Case 6: Write at capacity boundary (wc) ---
                Arguments.of("Write at capacity boundary", 1024, 1024, 0, 0, null,
                        (Consumer<TestContext>) ctx -> {
                            assertAll("State after flush on capacity",
                                    () -> assertEquals(1024, ctx.channel.position()),
                                    () -> assertEquals(0, ctx.channel.getUnpersistedBytes()),
                                    () -> assertEquals(0, ctx.channel.getNumOfBytesInWriteBuffer())
                            );
                            try {
                                verify(ctx.mockFc, times(1)).write((ByteBuffer) any());
                                verify(ctx.mockFc, never()).force(anyBoolean());
                            } catch (IOException e) { fail(e); }
                        }),

                // --- Test Case 7: Write over capacity boundary ---
                Arguments.of("Write over capacity boundary", 1025, 1024, 0, 0, null,
                        (Consumer<TestContext>) ctx -> {
                            assertAll("State after flush on overflow",
                                    () -> assertEquals(1025, ctx.channel.position()),
                                    () -> assertEquals(0, ctx.channel.getUnpersistedBytes()),
                                    () -> assertEquals(1, ctx.channel.getNumOfBytesInWriteBuffer())
                            );
                            try {
                                verify(ctx.mockFc, atLeast(1)).write((ByteBuffer) any());
                                verify(ctx.mockFc, never()).force(anyBoolean());
                            } catch (IOException e) { fail(e); }
                        }),

                // --- Test Case 8: Write that crosses safety threshold ---
                Arguments.of("Write that crosses safety threshold", 1, 1024, 512, 511, null,
                        (Consumer<TestContext>) ctx -> {
                            assertAll("State after flush on threshold",
                                    () -> assertEquals(512, ctx.channel.position()),
                                    () -> assertEquals(0, ctx.channel.getUnpersistedBytes()), // Resets after forceWrite
                                    () -> assertEquals(0, ctx.channel.getNumOfBytesInWriteBuffer())
                            );
                            try {
                                verify(ctx.mockFc, times(1)).write((ByteBuffer) any());
                                verify(ctx.mockFc, times(1)).force(false);
                            } catch (IOException e) { fail(e); }
                        })
        );
    }

    @ParameterizedTest(name = "{index}: {0}")
    @MethodSource("provideWriteArguments")
    void testWriteBehavior(String testName, Object srcSpec, int writeCapacity, long uBB, long initialUnpersistedBytes,
                           Class<? extends Throwable> expectedException, Consumer<TestContext> asserter) {

        ByteBuf src = null;
        BufferedChannel channel = null;

        try {
            channel = new BufferedChannel(allocator, mockFc, writeCapacity, 1024, uBB);

            if (initialUnpersistedBytes > 0) {
                ByteBuf preLoadData = Unpooled.buffer((int) initialUnpersistedBytes).writerIndex((int) initialUnpersistedBytes);
                channel.write(preLoadData);
                preLoadData.release();
            }

            if (srcSpec == null) {
                src = null;
            } else if (srcSpec.equals("FAILING_MOCK")) {
                src = mock(ByteBuf.class);
                when(src.readableBytes()).thenThrow(new IllegalStateException("Mock src failed"));
            } else if (srcSpec instanceof Integer) {
                int size = (Integer) srcSpec;
                src = Unpooled.buffer(size).writerIndex(size);
            }

            if (expectedException != null) {
                BufferedChannel finalChannel = channel;
                ByteBuf finalSrc = src;
                assertThrows(expectedException, () -> finalChannel.write(finalSrc));
            } else {
                channel.write(src);
                asserter.accept(new TestContext(channel, mockFc));
            }

        } catch (IOException e) {
            fail("Test setup or execution failed with an unexpected IOException", e);
        } finally {
            if (src != null && src.refCnt() > 0) {
                src.release();
            }
            if (channel != null && channel.writeBuffer != null && channel.writeBuffer.refCnt() > 0) {
                channel.writeBuffer.release();
            }
        }
    }


    @Test
    @DisplayName("BUG: Write on a zero-capacity channel causes an infinite loop")
    @Tag("hanging")
    void testWrite_onZeroCapacityChannel() {
        // This test case verifies the critical bug where a writeCapacity of 0
        // causes an infinite loop in the write() method. The @Timeout annotation
        // will cause the test to fail if it doesn't complete within 1 second,
        // which proves the existence of the bug

        BufferedChannel channel = null;
        ByteBuf data = Unpooled.buffer(1).writerIndex(1);
        try {
            channel = new BufferedChannel(allocator, mockFc, 0, 1024, 0);

            BufferedChannel finalChannel = channel;
            assertTimeoutPreemptively(Duration.ofSeconds(1), () -> {
                finalChannel.write(data);
            }, "The write() method did not complete within the timeout, indicating an infinite loop.");

            fail("Expected a timeout, but the method completed. The infinite loop bug may be fixed.");
        } catch (IOException e) {
            fail("Expected a timeout, but an IOException was thrown.", e);
        } finally {
            data.release();
            if (channel != null && channel.writeBuffer != null && channel.writeBuffer.refCnt() > 0) {
                channel.writeBuffer.release();
            }
        }
    }

    @Test
    @DisplayName("Write that triggers a flush on a closed channel should throw IOException")
    void testWrite_onClosedChannel() {
        // This test verifies that the write() method behaves correctly if the underlying
        // FileChannel is closed after the BufferedChannel has been instantiated but
        // before a flush-triggering write occurs

        BufferedChannel channel = null;
        // We need enough data to force a flush to actually interact with the closed channel
        ByteBuf dataToForceFlush = Unpooled.buffer(1024).writerIndex(1024);
        try {
            channel = new BufferedChannel(allocator, mockFc, 1024, 1024, 0);

            // We simulate the FileChannel being closed
            when(mockFc.write(any(ByteBuffer.class)))
                    .thenThrow(new java.nio.channels.ClosedChannelException());

            BufferedChannel finalChannel = channel;
            assertThrows(IOException.class, () -> {
                finalChannel.write(dataToForceFlush);
            }, "An IOException should be thrown when flushing to a closed channel.");

        } catch (IOException e) {
            fail("Test setup failed with an unexpected IOException", e);
        } finally {
            dataToForceFlush.release();
            if (channel != null && channel.writeBuffer != null && channel.writeBuffer.refCnt() > 0) {
                channel.writeBuffer.release();
            }
        }
    }

    // Test added after first JaCoCo report (toWrite.hasRemaining() never true)
    @Test
    @DisplayName("flush() should handle partial writes correctly by looping")
    void testFlush_whenPartialWriteOccurs() throws IOException {
        // This test covers the do-while loop in the flush() method. It verifies that
        // BufferedChannel can handle cases where the underlying FileChannel doesn't
        // write the entire buffer in a single call, preventing data loss.

        BufferedChannel channel = null;
        // Data that will exactly fill the buffer to trigger the flush.
        ByteBuf dataToFlush = Unpooled.buffer(1024).writerIndex(1024);

        try {
            channel = new BufferedChannel(allocator, mockFc, 1024, 1024, 0);

            // Configure the mock FileChannel to simulate a partial write.
            // The FIRST call to write() will only write half of the buffer.
            // The SECOND call will write the remaining half.
            when(mockFc.write(any(ByteBuffer.class)))
                    .thenAnswer(invocation -> {
                        ByteBuffer buffer = invocation.getArgument(0);
                        int bytesToWrite = buffer.remaining() / 2; // Write half
                        buffer.position(buffer.position() + bytesToWrite);
                        return bytesToWrite;
                    })
                    .thenAnswer(invocation -> {
                        ByteBuffer buffer = invocation.getArgument(0);
                        int bytesToWrite = buffer.remaining(); // Write the rest
                        buffer.position(buffer.position() + bytesToWrite);
                        return bytesToWrite;
                    });


            channel.write(dataToFlush);

            // The primary assertion: verify that fileChannel.write() was called exactly
            // two times. This proves that the do-while loop executed correctly to
            // handle the partial write.
            verify(mockFc, times(2)).write(any(ByteBuffer.class));

            // Secondary assertions to ensure the final state is correct.
            BufferedChannel finalChannel = channel;
            assertAll("Final state after a partial flush",
                    () -> assertEquals(1024, finalChannel.position(), "Position should be fully advanced"),
                    () -> assertEquals(0, finalChannel.getUnpersistedBytes()),
                    () -> assertEquals(0, finalChannel.getNumOfBytesInWriteBuffer(), "Write buffer should be empty after a full flush")
            );

        } finally {
            dataToFlush.release();
            if (channel != null && channel.writeBuffer != null && channel.writeBuffer.refCnt() > 0) {
                channel.writeBuffer.release();
            }
        }
    }
}