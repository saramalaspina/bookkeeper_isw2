package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.io.IOException;
import java.lang.reflect.Field;
import java.nio.channels.FileChannel;
import java.util.function.Consumer;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@DisplayName("Tests for the BufferedChannel Constructor")
class BufferedChannelConstructorTest {

    // Mocks for external dependencies, prepared once for all tests
    private static FileChannel validFileChannel;
    private static FileChannel closedFileChannel;
    private static ByteBufAllocator failingAllocator;

    // Mock added after first PIT report (mutant "this.writeBufferStartPosition.set(position)" survived)
    private static FileChannel validFileChannelPosNoZero;

    @BeforeAll
    static void setupMocks() throws IOException {
        // Mock a VALID and working FileChannel
        validFileChannel = mock(FileChannel.class);
        // When the constructor asks for the position, return 0 (file at the beginning)
        when(validFileChannel.position()).thenReturn(0L);

        // Mock a CLOSED FileChannel
        closedFileChannel = mock(FileChannel.class);
        // When trying to use it, it throws the correct exception
        when(closedFileChannel.position()).thenThrow(new java.nio.channels.ClosedChannelException());

        // Mock a FAILING ByteBufAllocator
        failingAllocator = mock(ByteBufAllocator.class);
        // When trying to allocate a buffer, it throws a critical error
        when(failingAllocator.directBuffer(anyInt())).thenThrow(new OutOfMemoryError("Memory exhausted"));

        // Mock a VALID and working FileChannel with position > zero
        validFileChannelPosNoZero = mock(FileChannel.class);
        // When the constructor asks for the position, return 1024
        when(validFileChannelPosNoZero.position()).thenReturn(1024L);
    }


    private static Stream<Arguments> provideConstructorArguments() {
        return Stream.of(
                // Robustness tests (one-at-a-time approach)
                Arguments.of("Error: Null Allocator", null, validFileChannel, 1, 0L, NullPointerException.class, false, 0L),
                Arguments.of("Error: Failing Allocator", failingAllocator, validFileChannel, 1, 0L, OutOfMemoryError.class, false, 0L),
                Arguments.of("Error: Null FileChannel", ByteBufAllocator.DEFAULT, null, 1, 0L, NullPointerException.class, false, 0L),
                Arguments.of("Error: Closed FileChannel", ByteBufAllocator.DEFAULT, closedFileChannel, 1, 0L, IOException.class, false, 0L),
                Arguments.of("Error: Negative writeCapacity", ByteBufAllocator.DEFAULT, validFileChannel, -1, 0L, IllegalArgumentException.class, false, 0L),

                // Correctness tests (multi-dimensional cases)
                Arguments.of("Success: wc=0, uBB=0", ByteBufAllocator.DEFAULT, validFileChannel, 0, 0L, null, false, 0L),
                Arguments.of("Success: wc=1, uBB=0", ByteBufAllocator.DEFAULT, validFileChannel, 1, 0L, null, false, 0L),
                Arguments.of("Success: wc=1, uBB=1", ByteBufAllocator.DEFAULT, validFileChannel, 1, 1L, null, true, 0L),
                Arguments.of("Success: wc=1, uBB=2", ByteBufAllocator.DEFAULT, validFileChannel, 1, 2L, null, true, 0L),
                Arguments.of("Success: wc=1, uBB=-1", ByteBufAllocator.DEFAULT, validFileChannel, 1, -1L, null, false, 0L),
                Arguments.of("Success: wc=1024, uBB=1023", ByteBufAllocator.DEFAULT, validFileChannel, 1024, 1023L, null, true, 0L),
                Arguments.of("Success: wc=1024, uBB=1024", ByteBufAllocator.DEFAULT, validFileChannel, 1024, 1024L, null, true, 0L),
                Arguments.of("Success: wc=1024, uBB=1025", ByteBufAllocator.DEFAULT, validFileChannel, 1024, 1025L, null, true, 0L),
                Arguments.of("Success: wc=1024, uBB=512", ByteBufAllocator.DEFAULT, validFileChannel, 1024, 512L, null, true, 0L),

                // Test added after first PIT report (mutant "this.writeBufferStartPosition.set(position)" survived)
                Arguments.of("Success: Non Zero Position", ByteBufAllocator.DEFAULT, validFileChannelPosNoZero, 1024, 512L, null, true, 1024L),

                // Test added to create a trusted configuration for write() method tests, that isolates the buffer capacity flush mechanism by disabling the unpersistedBytesBound safety policy
                Arguments.of("Success: wc=1024, uBB=0", ByteBufAllocator.DEFAULT, validFileChannel, 1024, 0L, null, false, 0L)
        );
    }

    @ParameterizedTest(name = "{index}: {0}")
    @MethodSource("provideConstructorArguments")
    void testConstructor(String testName, ByteBufAllocator allocator, FileChannel fc, int writeCapacity, long uBB,
                         Class<? extends Throwable> expectedException, boolean expectedDoRegularFlushes, long expectedPosition) {

        final int READ_CAPACITY_FIXED = 1024; // Fixed value, as per the testing strategy

        if (expectedException != null) {
            // Failure scenario: we verify that the expected exception is thrown
            assertThrows(expectedException, () -> {
                new BufferedChannel(allocator, fc, writeCapacity, READ_CAPACITY_FIXED, uBB);
            }, "An exception of type " + expectedException.getSimpleName() + " was expected.");
        } else {
            // Success scenario: we verify that the object is created correctly
            BufferedChannel channel = null;
            try {
                channel = new BufferedChannel(allocator, fc, writeCapacity, READ_CAPACITY_FIXED, uBB);

                // Perform a complete state verification for every successful creation
                final BufferedChannel finalChannel = channel;
                assertAll("Full state verification for: " + testName,
                        () -> assertEquals(writeCapacity, finalChannel.writeBuffer.capacity(), "writeCapacity should match"),
                        () -> assertEquals(finalChannel.position(), finalChannel.getFileChannelPosition(), "writeBufferStartPosition should be initialized to the file's position."),
                        () -> assertEquals(expectedPosition, finalChannel.position(), "position should be initialized correctly"),
                        () -> assertEquals(uBB, finalChannel.unpersistedBytesBound, "unpersistedBytesBound should match"),
                        () -> assertEquals(expectedDoRegularFlushes, getDoRegularFlushes(finalChannel), "doRegularFlushes logic should be correct"),
                        () -> assertEquals(0, finalChannel.getUnpersistedBytes(), "unpersistedBytes should start at 0"),
                        () -> assertFalse(getIsClosed(finalChannel), "A new channel should not be closed")
                );

            } catch (IOException e) {
                fail("Channel creation should not have thrown an exception", e);
            } finally {
                if (channel != null && channel.writeBuffer != null) {
                    channel.writeBuffer.release();
                }
            }
        }
    }

    // Helper method to access the private field 'doRegularFlushes' via reflection.
    private static boolean getDoRegularFlushes(BufferedChannel channel) {
        try {
            Field field = BufferedChannel.class.getDeclaredField("doRegularFlushes");
            field.setAccessible(true);
            return (boolean) field.get(channel);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            fail("Could not access private field 'doRegularFlushes' for testing.", e);
            return false; // will never be reached
        }
    }

    //Helper method to access the private field 'closed' via reflection.
    private static boolean getIsClosed(BufferedChannel channel) {
        try {
            Field field = BufferedChannel.class.getDeclaredField("closed");
            field.setAccessible(true);
            return (boolean) field.get(channel);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            fail("Could not access private field 'closed' for testing.", e);
            return false;
        }
    }
}