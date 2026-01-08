package org.apache.bookkeeper.bookie;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.buffer.UnpooledByteBufAllocator;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Random;

/**
 * Helper class for Randoop test generation (Parameterized Factory).
 */
public class RandoopSetup {

    private static final String BASE_PATH = "target" + File.separator + "randoop-io";

    public static BufferedChannel createCustomBufferedChannel(int writeCapacity, int readCapacity, int unpersistedBytesBound) {
        if (writeCapacity <= 0) writeCapacity = 1;
        if (writeCapacity > 65536) writeCapacity = 65536;

        if (readCapacity <= 0) readCapacity = 1;
        if (readCapacity > 65536) readCapacity = 65536;

        if (unpersistedBytesBound < 0) unpersistedBytesBound = 0;
        if (unpersistedBytesBound > 100000) unpersistedBytesBound = 100000;

        try {
            File baseDir = new File(BASE_PATH);
            if (!baseDir.exists()) {
                baseDir.mkdirs();
            }

            File temp = new File(baseDir, "randoop-channel.dat");
            FileOutputStream fos = new FileOutputStream(temp);
            FileChannel fc = fos.getChannel();

            return new BufferedChannel(UnpooledByteBufAllocator.DEFAULT, fc, writeCapacity, readCapacity, unpersistedBytesBound);
        } catch (Exception e) {
            return null;
        }
    }

    public static ByteBuf createRandomData(int length) {
        if (length < 0) length = 0;
        if (length > 8192) length = 8192;

        byte[] data = new byte[length];
        new Random().nextBytes(data);
        return Unpooled.wrappedBuffer(data);
    }

    public static File createJournalDirWithConfig(int numTxnFiles, boolean addGarbage) {
        try {
            File baseDir = new File(BASE_PATH);
            if (!baseDir.exists()) {
                baseDir.mkdirs();
            }

            File dir = new File(baseDir, "randoop-journal");
            if (!dir.exists()) {
                dir.mkdirs();
            }

            File[] files = dir.listFiles();
            if (files != null) {
                for (File f : files) {
                    f.delete();
                }
            }

            int safeNum = Math.min(Math.max(0, numTxnFiles), 20);
            for (int i = 0; i < safeNum; i++) {
                new File(dir, Integer.toHexString(i) + ".txn").createNewFile();
            }
            if (addGarbage) {
                new File(dir, "invalid-log.log").createNewFile();
                new File(dir, "not-a-hex-number.txn").createNewFile();
            }

            dir.deleteOnExit();
            return dir;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Journal.JournalIdFilter createCustomFilter(int mode) {
        return new Journal.JournalIdFilter() {
            @Override
            public boolean accept(long journalId) {
                if (mode == 0) return true;
                if (mode == 1) return false;
                return (journalId % 2 == 0);
            }
        };
    }
}