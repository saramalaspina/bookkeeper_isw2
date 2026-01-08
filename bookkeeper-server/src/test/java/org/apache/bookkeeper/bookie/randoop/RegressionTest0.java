package org.apache.bookkeeper.bookie.randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test01");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList2 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.listFiles()\" because \"journalDir\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test02");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test03");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test04");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test05");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test06");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test07");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test08");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test09");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test10");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test11");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: initialCapacity : -1 (expected: >= 0)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test12");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test13");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test14");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test15");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test16");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test17");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test18");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test19");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test20");
        io.netty.buffer.ByteBufAllocator byteBufAllocator0 = null;
        java.nio.channels.FileChannel fileChannel1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = new org.apache.bookkeeper.bookie.BufferedChannel(byteBufAllocator0, fileChannel1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.nio.channels.FileChannel.position()\" because \"fc\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }
}

