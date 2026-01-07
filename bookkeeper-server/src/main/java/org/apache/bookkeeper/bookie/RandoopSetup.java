package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 * Helper class for Randoop test generation.
 *
 * This class provides static factory methods to create complex objects
 * (like BufferedChannel) and valid filesystem states (files and directories)
 * required to test the Journal and BufferedChannel classes without mocking.
 *
 * We use fixed file paths instead of random temporary files to ensure
 * determinism. This prevents Randoop from generating "Flaky Tests" where
 * assertions fail because file paths change between generation and execution time.
 */
public class RandoopSetup {

    public static BufferedChannel createValidBufferedChannel() {
        try {
            // Use a fixed filename in the temp directory to ensure deterministic behavior
            File temp = new File(System.getProperty("java.io.tmpdir"), "randoop-channel-fixed.dat");

            // Clean up previous runs to ensure a fresh start
            if (temp.exists()) {
                temp.delete();
            }
            temp.createNewFile();
            temp.deleteOnExit();

            // Create a FileChannel from the file
            FileOutputStream fos = new FileOutputStream(temp);
            FileChannel fc = fos.getChannel();

            // Create the BufferedChannel with a capacity of 1024 bytes
            return new BufferedChannel(UnpooledByteBufAllocator.DEFAULT, fc, 1024);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }


    public static ByteBuf createValidData() {
        return Unpooled.wrappedBuffer("DataForTestString".getBytes());
    }


    public static File createValidJournalDir() {
        try {
            // Use a fixed directory name to prevent regression test failures
            File dir = new File(System.getProperty("java.io.tmpdir"), "randoop-journal-fixed");

            if (!dir.exists()) {
                dir.mkdirs();
                dir.deleteOnExit();
            }

            // Create a valid journal file (Hexadecimal ID + .txn extension)
            // '100' is a valid hex number.
            File validFile = new File(dir, "100.txn");
            if (!validFile.exists()) {
                validFile.createNewFile();
                validFile.deleteOnExit();
            }

            // Create a garbage file that should be ignored by the filter
            File garbageFile = new File(dir, "invalid-log-file.log");
            if (!garbageFile.exists()) {
                garbageFile.createNewFile();
                garbageFile.deleteOnExit();
            }

            return dir;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}