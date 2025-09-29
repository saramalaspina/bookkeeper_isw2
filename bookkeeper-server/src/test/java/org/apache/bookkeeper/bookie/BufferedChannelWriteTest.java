package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.buffer.Unpooled;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
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
}