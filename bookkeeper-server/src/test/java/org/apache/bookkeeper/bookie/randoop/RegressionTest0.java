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
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        bufferedChannel0.close();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        bufferedChannel0.close();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf6);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf9);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf9);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf8);
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf10);
        bufferedChannel6.write(byteBuf10);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf10);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
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
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf15);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf15);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        bufferedChannel0.close();
        bufferedChannel0.close();
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf8);
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf16);
        bufferedChannel12.write(byteBuf16);
        bufferedChannel7.write(byteBuf16);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf16);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf6);
        bufferedChannel0.write(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf9 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf16);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf18);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel21.write(byteBuf22);
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel21.write(byteBuf24);
        bufferedChannel20.write(byteBuf24);
        bufferedChannel15.write(byteBuf24);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf24);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf24);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf15);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf18);
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf20);
        bufferedChannel14.write(byteBuf20);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf20);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf5);
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf7);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf11);
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf13);
        bufferedChannel9.write(byteBuf13);
        bufferedChannel4.write(byteBuf13);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf13);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf11);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf11);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        bufferedChannel0.close();
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf14);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf16);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf19);
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf21);
        bufferedChannel15.write(byteBuf21);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf21);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf11);
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf13);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf13);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf3);
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf5);
        bufferedChannel1.write(byteBuf5);
        bufferedChannel0.write(byteBuf5);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf14);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf9);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel8.write(byteBuf14);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf14);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf5);
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf11);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf11);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf8);
        bufferedChannel4.write(byteBuf8);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf8);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        bufferedChannel0.close();
        bufferedChannel0.close();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf7);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf17);
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf19);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf19);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf12);
        bufferedChannel0.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf15 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf3);
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf5);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf11);
        bufferedChannel7.write(byteBuf11);
        bufferedChannel2.write(byteBuf11);
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf15);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf15);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf13);
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf15);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf19);
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf21);
        bufferedChannel17.write(byteBuf21);
        bufferedChannel12.write(byteBuf21);
        io.netty.buffer.ByteBuf byteBuf25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf25);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf25);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf6);
        bufferedChannel0.write(byteBuf6);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel10.write(byteBuf14);
        bufferedChannel9.write(byteBuf14);
        bufferedChannel0.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf19 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf11);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf16);
        bufferedChannel10.write(byteBuf16);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel21.write(byteBuf22);
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel21.write(byteBuf24);
        bufferedChannel20.write(byteBuf24);
        bufferedChannel19.write(byteBuf24);
        bufferedChannel10.write(byteBuf24);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf24);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf24);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf3);
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf5);
        bufferedChannel1.write(byteBuf5);
        bufferedChannel0.write(byteBuf5);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf17);
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf19);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel22.write(byteBuf23);
        io.netty.buffer.ByteBuf byteBuf25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel22.write(byteBuf25);
        bufferedChannel21.write(byteBuf25);
        bufferedChannel16.write(byteBuf25);
        bufferedChannel11.write(byteBuf25);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel30.write(byteBuf31);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel33.write(byteBuf34);
        io.netty.buffer.ByteBuf byteBuf36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel33.write(byteBuf36);
        bufferedChannel30.write(byteBuf36);
        bufferedChannel11.write(byteBuf36);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf36);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(bufferedChannel33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(byteBuf36);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf5);
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf9);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf9);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf11);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf15);
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf17);
        bufferedChannel13.write(byteBuf17);
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf20);
        bufferedChannel8.write(byteBuf20);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf20);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf13);
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf15);
        bufferedChannel11.write(byteBuf15);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf18);
        bufferedChannel6.write(byteBuf18);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf18);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf16);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf18);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf21);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf23);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf27);
        io.netty.buffer.ByteBuf byteBuf29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf29);
        bufferedChannel25.write(byteBuf29);
        bufferedChannel20.write(byteBuf29);
        bufferedChannel15.write(byteBuf29);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf29);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf11);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf16);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel19.write(byteBuf20);
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel19.write(byteBuf22);
        bufferedChannel18.write(byteBuf22);
        bufferedChannel13.write(byteBuf22);
        bufferedChannel8.write(byteBuf22);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf28);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel30.write(byteBuf31);
        io.netty.buffer.ByteBuf byteBuf33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel30.write(byteBuf33);
        bufferedChannel27.write(byteBuf33);
        bufferedChannel8.write(byteBuf33);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf33);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf33);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf13);
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf15);
        bufferedChannel11.write(byteBuf15);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf18);
        bufferedChannel6.write(byteBuf18);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel24.write(byteBuf25);
        io.netty.buffer.ByteBuf byteBuf27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel24.write(byteBuf27);
        bufferedChannel23.write(byteBuf27);
        bufferedChannel22.write(byteBuf27);
        bufferedChannel21.write(byteBuf27);
        bufferedChannel6.write(byteBuf27);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf27);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(byteBuf27);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf8);
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf12);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf12);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf8);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf8);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf5);
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf9);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf9);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.io.File file0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidJournalDir();
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter1 = null;
        java.util.List<java.lang.Long> longList2 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter1);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter3 = null;
        java.util.List<java.lang.Long> longList4 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter3);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter5 = null;
        java.util.List<java.lang.Long> longList6 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter5);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter7 = null;
        java.util.List<java.lang.Long> longList8 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter7);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter9 = null;
        java.util.List<java.lang.Long> longList10 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter9);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter11 = null;
        java.util.List<java.lang.Long> longList12 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter11);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter13 = null;
        java.util.List<java.lang.Long> longList14 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter13);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter15 = null;
        java.util.List<java.lang.Long> longList16 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter15);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter17 = null;
        java.util.List<java.lang.Long> longList18 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter17);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter19 = null;
        java.util.List<java.lang.Long> longList20 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter19);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter21 = null;
        java.util.List<java.lang.Long> longList22 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter21);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter23 = null;
        java.util.List<java.lang.Long> longList24 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter23);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter25 = null;
        java.util.List<java.lang.Long> longList26 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter25);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter27 = null;
        java.util.List<java.lang.Long> longList28 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter27);
        org.junit.Assert.assertNotNull(file0);
        org.junit.Assert.assertNotNull(longList2);
        org.junit.Assert.assertNotNull(longList4);
        org.junit.Assert.assertNotNull(longList6);
        org.junit.Assert.assertNotNull(longList8);
        org.junit.Assert.assertNotNull(longList10);
        org.junit.Assert.assertNotNull(longList12);
        org.junit.Assert.assertNotNull(longList14);
        org.junit.Assert.assertNotNull(longList16);
        org.junit.Assert.assertNotNull(longList18);
        org.junit.Assert.assertNotNull(longList20);
        org.junit.Assert.assertNotNull(longList22);
        org.junit.Assert.assertNotNull(longList24);
        org.junit.Assert.assertNotNull(longList26);
        org.junit.Assert.assertNotNull(longList28);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf6);
        bufferedChannel2.write(byteBuf6);
        bufferedChannel1.write(byteBuf6);
        bufferedChannel0.write(byteBuf6);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf16);
        bufferedChannel12.write(byteBuf16);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf16);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf8);
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf10);
        bufferedChannel6.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf13);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf13);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf7);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf13);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf16);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf19);
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf21);
        bufferedChannel15.write(byteBuf21);
        bufferedChannel12.write(byteBuf21);
        bufferedChannel11.write(byteBuf21);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf21);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf8);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel10.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf17);
        bufferedChannel5.write(byteBuf17);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf24);
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf26);
        bufferedChannel22.write(byteBuf26);
        bufferedChannel21.write(byteBuf26);
        bufferedChannel20.write(byteBuf26);
        bufferedChannel5.write(byteBuf26);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf26);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf26);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf5);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf9);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel8.write(byteBuf14);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf14);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf12);
        bufferedChannel0.write(byteBuf12);
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf5);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf9);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel8.write(byteBuf14);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel19.write(byteBuf20);
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel19.write(byteBuf22);
        bufferedChannel18.write(byteBuf22);
        bufferedChannel17.write(byteBuf22);
        bufferedChannel8.write(byteBuf22);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf22);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf3);
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf5);
        bufferedChannel1.write(byteBuf5);
        bufferedChannel0.write(byteBuf5);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel9.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel9.write(byteBuf12);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf16);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf18);
        bufferedChannel14.write(byteBuf18);
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf21);
        bufferedChannel9.write(byteBuf21);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf28);
        io.netty.buffer.ByteBuf byteBuf30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf30);
        bufferedChannel26.write(byteBuf30);
        bufferedChannel25.write(byteBuf30);
        bufferedChannel24.write(byteBuf30);
        bufferedChannel9.write(byteBuf30);
        bufferedChannel0.write(byteBuf30);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf30);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel9.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel9.write(byteBuf12);
        bufferedChannel6.write(byteBuf12);
        bufferedChannel3.write(byteBuf12);
        bufferedChannel2.write(byteBuf12);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf12);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf5);
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf7);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel9.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel9.write(byteBuf12);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf16);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf18);
        bufferedChannel14.write(byteBuf18);
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf21);
        bufferedChannel9.write(byteBuf21);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf28);
        io.netty.buffer.ByteBuf byteBuf30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf30);
        bufferedChannel26.write(byteBuf30);
        bufferedChannel25.write(byteBuf30);
        bufferedChannel24.write(byteBuf30);
        bufferedChannel9.write(byteBuf30);
        bufferedChannel4.write(byteBuf30);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf38 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel37.write(byteBuf38);
        io.netty.buffer.ByteBuf byteBuf40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel37.write(byteBuf40);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf43 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel42.write(byteBuf43);
        io.netty.buffer.ByteBuf byteBuf45 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel42.write(byteBuf45);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf49 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel48.write(byteBuf49);
        io.netty.buffer.ByteBuf byteBuf51 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel48.write(byteBuf51);
        bufferedChannel47.write(byteBuf51);
        bufferedChannel42.write(byteBuf51);
        bufferedChannel37.write(byteBuf51);
        bufferedChannel4.write(byteBuf51);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel57 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf58 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel57.write(byteBuf58);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel60 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf61 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel60.write(byteBuf61);
        io.netty.buffer.ByteBuf byteBuf63 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel60.write(byteBuf63);
        bufferedChannel57.write(byteBuf63);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel66 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel67 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel68 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf69 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel68.write(byteBuf69);
        io.netty.buffer.ByteBuf byteBuf71 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel68.write(byteBuf71);
        bufferedChannel67.write(byteBuf71);
        bufferedChannel66.write(byteBuf71);
        bufferedChannel57.write(byteBuf71);
        bufferedChannel4.write(byteBuf71);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf71);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(bufferedChannel37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(bufferedChannel42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(bufferedChannel47);
        org.junit.Assert.assertNotNull(bufferedChannel48);
        org.junit.Assert.assertNotNull(byteBuf49);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(bufferedChannel57);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertNotNull(bufferedChannel60);
        org.junit.Assert.assertNotNull(byteBuf61);
        org.junit.Assert.assertNotNull(byteBuf63);
        org.junit.Assert.assertNotNull(bufferedChannel66);
        org.junit.Assert.assertNotNull(bufferedChannel67);
        org.junit.Assert.assertNotNull(bufferedChannel68);
        org.junit.Assert.assertNotNull(byteBuf69);
        org.junit.Assert.assertNotNull(byteBuf71);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf8);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel10.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf17);
        bufferedChannel5.write(byteBuf17);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf24);
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf26);
        bufferedChannel22.write(byteBuf26);
        bufferedChannel21.write(byteBuf26);
        bufferedChannel20.write(byteBuf26);
        bufferedChannel5.write(byteBuf26);
        bufferedChannel0.write(byteBuf26);
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf26);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf8);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf11);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf16);
        bufferedChannel10.write(byteBuf16);
        bufferedChannel7.write(byteBuf16);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf16);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf8);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel10.write(byteBuf14);
        bufferedChannel5.write(byteBuf14);
        bufferedChannel0.write(byteBuf14);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf21);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf23);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel25.write(byteBuf26);
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel25.write(byteBuf28);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf32 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel31.write(byteBuf32);
        io.netty.buffer.ByteBuf byteBuf34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel31.write(byteBuf34);
        bufferedChannel30.write(byteBuf34);
        io.netty.buffer.ByteBuf byteBuf37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel30.write(byteBuf37);
        bufferedChannel25.write(byteBuf37);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel43 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf44 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel43.write(byteBuf44);
        io.netty.buffer.ByteBuf byteBuf46 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel43.write(byteBuf46);
        bufferedChannel42.write(byteBuf46);
        bufferedChannel41.write(byteBuf46);
        bufferedChannel40.write(byteBuf46);
        bufferedChannel25.write(byteBuf46);
        bufferedChannel20.write(byteBuf46);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel53 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf54 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel53.write(byteBuf54);
        io.netty.buffer.ByteBuf byteBuf56 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel53.write(byteBuf56);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel58 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf59 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel58.write(byteBuf59);
        io.netty.buffer.ByteBuf byteBuf61 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel58.write(byteBuf61);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel63 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel64 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf65 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel64.write(byteBuf65);
        io.netty.buffer.ByteBuf byteBuf67 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel64.write(byteBuf67);
        bufferedChannel63.write(byteBuf67);
        bufferedChannel58.write(byteBuf67);
        bufferedChannel53.write(byteBuf67);
        bufferedChannel20.write(byteBuf67);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf67);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(bufferedChannel31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(bufferedChannel40);
        org.junit.Assert.assertNotNull(bufferedChannel41);
        org.junit.Assert.assertNotNull(bufferedChannel42);
        org.junit.Assert.assertNotNull(bufferedChannel43);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf46);
        org.junit.Assert.assertNotNull(bufferedChannel53);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertNotNull(byteBuf56);
        org.junit.Assert.assertNotNull(bufferedChannel58);
        org.junit.Assert.assertNotNull(byteBuf59);
        org.junit.Assert.assertNotNull(byteBuf61);
        org.junit.Assert.assertNotNull(bufferedChannel63);
        org.junit.Assert.assertNotNull(bufferedChannel64);
        org.junit.Assert.assertNotNull(byteBuf65);
        org.junit.Assert.assertNotNull(byteBuf67);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf6);
        bufferedChannel2.write(byteBuf6);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel9.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel9.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel9.write(byteBuf14);
        bufferedChannel2.write(byteBuf14);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf14);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf8);
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf12);
        bufferedChannel0.write(byteBuf12);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf18);
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf20);
        bufferedChannel16.write(byteBuf20);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf23);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf23);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf23);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf8);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel10.write(byteBuf14);
        bufferedChannel5.write(byteBuf14);
        bufferedChannel0.write(byteBuf14);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel19.write(byteBuf20);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel22.write(byteBuf23);
        io.netty.buffer.ByteBuf byteBuf25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel22.write(byteBuf25);
        bufferedChannel19.write(byteBuf25);
        bufferedChannel0.write(byteBuf25);
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf25);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf6);
        bufferedChannel0.write(byteBuf6);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf11);
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf13);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf17);
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf19);
        bufferedChannel15.write(byteBuf19);
        bufferedChannel10.write(byteBuf19);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf23);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel25.write(byteBuf26);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel28.write(byteBuf29);
        io.netty.buffer.ByteBuf byteBuf31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel28.write(byteBuf31);
        bufferedChannel25.write(byteBuf31);
        bufferedChannel10.write(byteBuf31);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf31);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf31);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf6);
        bufferedChannel0.write(byteBuf6);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel9.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel9.write(byteBuf12);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf16);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf18);
        bufferedChannel14.write(byteBuf18);
        bufferedChannel9.write(byteBuf18);
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel9.write(byteBuf22);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel24.write(byteBuf25);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf28);
        io.netty.buffer.ByteBuf byteBuf30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf30);
        bufferedChannel24.write(byteBuf30);
        bufferedChannel9.write(byteBuf30);
        bufferedChannel0.write(byteBuf30);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel36.write(byteBuf37);
        io.netty.buffer.ByteBuf byteBuf39 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel36.write(byteBuf39);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf43 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel42.write(byteBuf43);
        io.netty.buffer.ByteBuf byteBuf45 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel42.write(byteBuf45);
        bufferedChannel41.write(byteBuf45);
        bufferedChannel36.write(byteBuf45);
        io.netty.buffer.ByteBuf byteBuf49 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel36.write(byteBuf49);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf49);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(bufferedChannel41);
        org.junit.Assert.assertNotNull(bufferedChannel42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf49);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf7);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf13);
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf15);
        bufferedChannel11.write(byteBuf15);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf19);
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf21);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf23);
        bufferedChannel11.write(byteBuf23);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf27);
        bufferedChannel11.write(byteBuf27);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf27);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(byteBuf27);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf12);
        bufferedChannel0.write(byteBuf12);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf19);
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf21);
        bufferedChannel17.write(byteBuf21);
        bufferedChannel16.write(byteBuf21);
        bufferedChannel15.write(byteBuf21);
        bufferedChannel0.write(byteBuf21);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf14);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf14);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf8);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel10.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf17);
        bufferedChannel5.write(byteBuf17);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf24);
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf26);
        bufferedChannel22.write(byteBuf26);
        bufferedChannel21.write(byteBuf26);
        bufferedChannel20.write(byteBuf26);
        bufferedChannel5.write(byteBuf26);
        bufferedChannel0.write(byteBuf26);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel33.write(byteBuf34);
        io.netty.buffer.ByteBuf byteBuf36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel33.write(byteBuf36);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf39 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel38.write(byteBuf39);
        io.netty.buffer.ByteBuf byteBuf41 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel38.write(byteBuf41);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel43 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf45 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel44.write(byteBuf45);
        io.netty.buffer.ByteBuf byteBuf47 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel44.write(byteBuf47);
        bufferedChannel43.write(byteBuf47);
        bufferedChannel38.write(byteBuf47);
        bufferedChannel33.write(byteBuf47);
        bufferedChannel0.write(byteBuf47);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel53 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf54 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel53.write(byteBuf54);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel56 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf57 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel56.write(byteBuf57);
        io.netty.buffer.ByteBuf byteBuf59 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel56.write(byteBuf59);
        bufferedChannel53.write(byteBuf59);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel62 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel63 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel64 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf65 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel64.write(byteBuf65);
        io.netty.buffer.ByteBuf byteBuf67 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel64.write(byteBuf67);
        bufferedChannel63.write(byteBuf67);
        bufferedChannel62.write(byteBuf67);
        bufferedChannel53.write(byteBuf67);
        bufferedChannel0.write(byteBuf67);
        io.netty.buffer.ByteBuf byteBuf73 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf73);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(bufferedChannel33);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(byteBuf36);
        org.junit.Assert.assertNotNull(bufferedChannel38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(bufferedChannel43);
        org.junit.Assert.assertNotNull(bufferedChannel44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf47);
        org.junit.Assert.assertNotNull(bufferedChannel53);
        org.junit.Assert.assertNotNull(byteBuf54);
        org.junit.Assert.assertNotNull(bufferedChannel56);
        org.junit.Assert.assertNotNull(byteBuf57);
        org.junit.Assert.assertNotNull(byteBuf59);
        org.junit.Assert.assertNotNull(bufferedChannel62);
        org.junit.Assert.assertNotNull(bufferedChannel63);
        org.junit.Assert.assertNotNull(bufferedChannel64);
        org.junit.Assert.assertNotNull(byteBuf65);
        org.junit.Assert.assertNotNull(byteBuf67);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf6);
        bufferedChannel0.write(byteBuf6);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf13);
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf15);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf18);
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf20);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf24);
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf26);
        bufferedChannel22.write(byteBuf26);
        bufferedChannel17.write(byteBuf26);
        bufferedChannel12.write(byteBuf26);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf32 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel31.write(byteBuf32);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel34.write(byteBuf35);
        io.netty.buffer.ByteBuf byteBuf37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel34.write(byteBuf37);
        bufferedChannel31.write(byteBuf37);
        bufferedChannel12.write(byteBuf37);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf37);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(bufferedChannel31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf37);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf11);
        bufferedChannel7.write(byteBuf11);
        bufferedChannel6.write(byteBuf11);
        bufferedChannel5.write(byteBuf11);
        bufferedChannel0.write(byteBuf11);
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf8);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel10.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf17);
        bufferedChannel5.write(byteBuf17);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf24);
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf26);
        bufferedChannel22.write(byteBuf26);
        bufferedChannel21.write(byteBuf26);
        bufferedChannel20.write(byteBuf26);
        bufferedChannel5.write(byteBuf26);
        bufferedChannel0.write(byteBuf26);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel34.write(byteBuf35);
        io.netty.buffer.ByteBuf byteBuf37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel34.write(byteBuf37);
        bufferedChannel33.write(byteBuf37);
        io.netty.buffer.ByteBuf byteBuf40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel33.write(byteBuf40);
        bufferedChannel0.write(byteBuf40);
        io.netty.buffer.ByteBuf byteBuf43 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf43);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(bufferedChannel33);
        org.junit.Assert.assertNotNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf40);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf6);
        bufferedChannel0.write(byteBuf6);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf16);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf18);
        bufferedChannel14.write(byteBuf18);
        bufferedChannel13.write(byteBuf18);
        bufferedChannel12.write(byteBuf18);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf18);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf3);
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf5);
        bufferedChannel1.write(byteBuf5);
        bufferedChannel0.write(byteBuf5);
        bufferedChannel0.close();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf8);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel10.write(byteBuf14);
        bufferedChannel5.write(byteBuf14);
        bufferedChannel0.write(byteBuf14);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf21);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf24);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf27);
        io.netty.buffer.ByteBuf byteBuf29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf29);
        bufferedChannel23.write(byteBuf29);
        bufferedChannel20.write(byteBuf29);
        bufferedChannel19.write(byteBuf29);
        io.netty.buffer.ByteBuf byteBuf34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel19.write(byteBuf34);
        bufferedChannel0.write(byteBuf34);
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf34);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf11);
        bufferedChannel7.write(byteBuf11);
        bufferedChannel6.write(byteBuf11);
        bufferedChannel5.write(byteBuf11);
        bufferedChannel0.write(byteBuf11);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf18);
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf20);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel22.write(byteBuf23);
        io.netty.buffer.ByteBuf byteBuf25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel22.write(byteBuf25);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel28.write(byteBuf29);
        io.netty.buffer.ByteBuf byteBuf31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel28.write(byteBuf31);
        bufferedChannel27.write(byteBuf31);
        io.netty.buffer.ByteBuf byteBuf34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf34);
        bufferedChannel22.write(byteBuf34);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel39 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf41 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel40.write(byteBuf41);
        io.netty.buffer.ByteBuf byteBuf43 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel40.write(byteBuf43);
        bufferedChannel39.write(byteBuf43);
        bufferedChannel38.write(byteBuf43);
        bufferedChannel37.write(byteBuf43);
        bufferedChannel22.write(byteBuf43);
        bufferedChannel17.write(byteBuf43);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel50 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf51 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel50.write(byteBuf51);
        io.netty.buffer.ByteBuf byteBuf53 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel50.write(byteBuf53);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel55 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf56 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel55.write(byteBuf56);
        io.netty.buffer.ByteBuf byteBuf58 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel55.write(byteBuf58);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel60 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel61 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf62 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel61.write(byteBuf62);
        io.netty.buffer.ByteBuf byteBuf64 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel61.write(byteBuf64);
        bufferedChannel60.write(byteBuf64);
        bufferedChannel55.write(byteBuf64);
        bufferedChannel50.write(byteBuf64);
        bufferedChannel17.write(byteBuf64);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel70 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf71 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel70.write(byteBuf71);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel73 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf74 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel73.write(byteBuf74);
        io.netty.buffer.ByteBuf byteBuf76 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel73.write(byteBuf76);
        bufferedChannel70.write(byteBuf76);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel79 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel80 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel81 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf82 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel81.write(byteBuf82);
        io.netty.buffer.ByteBuf byteBuf84 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel81.write(byteBuf84);
        bufferedChannel80.write(byteBuf84);
        bufferedChannel79.write(byteBuf84);
        bufferedChannel70.write(byteBuf84);
        bufferedChannel17.write(byteBuf84);
        bufferedChannel0.write(byteBuf84);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(bufferedChannel37);
        org.junit.Assert.assertNotNull(bufferedChannel38);
        org.junit.Assert.assertNotNull(bufferedChannel39);
        org.junit.Assert.assertNotNull(bufferedChannel40);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(bufferedChannel50);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertNotNull(bufferedChannel55);
        org.junit.Assert.assertNotNull(byteBuf56);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertNotNull(bufferedChannel60);
        org.junit.Assert.assertNotNull(bufferedChannel61);
        org.junit.Assert.assertNotNull(byteBuf62);
        org.junit.Assert.assertNotNull(byteBuf64);
        org.junit.Assert.assertNotNull(bufferedChannel70);
        org.junit.Assert.assertNotNull(byteBuf71);
        org.junit.Assert.assertNotNull(bufferedChannel73);
        org.junit.Assert.assertNotNull(byteBuf74);
        org.junit.Assert.assertNotNull(byteBuf76);
        org.junit.Assert.assertNotNull(bufferedChannel79);
        org.junit.Assert.assertNotNull(bufferedChannel80);
        org.junit.Assert.assertNotNull(bufferedChannel81);
        org.junit.Assert.assertNotNull(byteBuf82);
        org.junit.Assert.assertNotNull(byteBuf84);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf14);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf18);
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf20);
        bufferedChannel16.write(byteBuf20);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf24);
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf26);
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf28);
        bufferedChannel16.write(byteBuf28);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf32 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel31.write(byteBuf32);
        bufferedChannel16.write(byteBuf32);
        bufferedChannel13.write(byteBuf32);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel36.write(byteBuf37);
        io.netty.buffer.ByteBuf byteBuf39 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel36.write(byteBuf39);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel43 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf45 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel44.write(byteBuf45);
        io.netty.buffer.ByteBuf byteBuf47 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel44.write(byteBuf47);
        bufferedChannel43.write(byteBuf47);
        bufferedChannel42.write(byteBuf47);
        bufferedChannel41.write(byteBuf47);
        bufferedChannel36.write(byteBuf47);
        bufferedChannel13.write(byteBuf47);
        bufferedChannel0.write(byteBuf47);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(bufferedChannel31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(bufferedChannel41);
        org.junit.Assert.assertNotNull(bufferedChannel42);
        org.junit.Assert.assertNotNull(bufferedChannel43);
        org.junit.Assert.assertNotNull(bufferedChannel44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf47);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf6);
        bufferedChannel2.write(byteBuf6);
        bufferedChannel1.write(byteBuf6);
        bufferedChannel0.write(byteBuf6);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf15);
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf17);
        bufferedChannel13.write(byteBuf17);
        bufferedChannel12.write(byteBuf17);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf17);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf5);
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf7);
        bufferedChannel3.write(byteBuf7);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf11);
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf13);
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf15);
        bufferedChannel3.write(byteBuf15);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf19);
        bufferedChannel3.write(byteBuf19);
        bufferedChannel0.write(byteBuf19);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf24);
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf26);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf32 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel31.write(byteBuf32);
        io.netty.buffer.ByteBuf byteBuf34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel31.write(byteBuf34);
        bufferedChannel30.write(byteBuf34);
        bufferedChannel29.write(byteBuf34);
        bufferedChannel28.write(byteBuf34);
        bufferedChannel23.write(byteBuf34);
        bufferedChannel0.write(byteBuf34);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf42 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel41.write(byteBuf42);
        io.netty.buffer.ByteBuf byteBuf44 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel41.write(byteBuf44);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel46 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf47 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel46.write(byteBuf47);
        io.netty.buffer.ByteBuf byteBuf49 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel46.write(byteBuf49);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel51 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel52 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf53 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel52.write(byteBuf53);
        io.netty.buffer.ByteBuf byteBuf55 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel52.write(byteBuf55);
        bufferedChannel51.write(byteBuf55);
        io.netty.buffer.ByteBuf byteBuf58 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel51.write(byteBuf58);
        bufferedChannel46.write(byteBuf58);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel61 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel62 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel63 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel64 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf65 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel64.write(byteBuf65);
        io.netty.buffer.ByteBuf byteBuf67 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel64.write(byteBuf67);
        bufferedChannel63.write(byteBuf67);
        bufferedChannel62.write(byteBuf67);
        bufferedChannel61.write(byteBuf67);
        bufferedChannel46.write(byteBuf67);
        bufferedChannel41.write(byteBuf67);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel74 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel75 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf76 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel75.write(byteBuf76);
        io.netty.buffer.ByteBuf byteBuf78 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel75.write(byteBuf78);
        bufferedChannel74.write(byteBuf78);
        io.netty.buffer.ByteBuf byteBuf81 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel74.write(byteBuf81);
        bufferedChannel41.write(byteBuf81);
        bufferedChannel0.write(byteBuf81);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(bufferedChannel29);
        org.junit.Assert.assertNotNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(bufferedChannel31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(bufferedChannel41);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(bufferedChannel46);
        org.junit.Assert.assertNotNull(byteBuf47);
        org.junit.Assert.assertNotNull(byteBuf49);
        org.junit.Assert.assertNotNull(bufferedChannel51);
        org.junit.Assert.assertNotNull(bufferedChannel52);
        org.junit.Assert.assertNotNull(byteBuf53);
        org.junit.Assert.assertNotNull(byteBuf55);
        org.junit.Assert.assertNotNull(byteBuf58);
        org.junit.Assert.assertNotNull(bufferedChannel61);
        org.junit.Assert.assertNotNull(bufferedChannel62);
        org.junit.Assert.assertNotNull(bufferedChannel63);
        org.junit.Assert.assertNotNull(bufferedChannel64);
        org.junit.Assert.assertNotNull(byteBuf65);
        org.junit.Assert.assertNotNull(byteBuf67);
        org.junit.Assert.assertNotNull(bufferedChannel74);
        org.junit.Assert.assertNotNull(bufferedChannel75);
        org.junit.Assert.assertNotNull(byteBuf76);
        org.junit.Assert.assertNotNull(byteBuf78);
        org.junit.Assert.assertNotNull(byteBuf81);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf6);
        bufferedChannel0.write(byteBuf6);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf11);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf14);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf17);
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf19);
        bufferedChannel13.write(byteBuf19);
        bufferedChannel10.write(byteBuf19);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel24.write(byteBuf25);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf28);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel30.write(byteBuf31);
        io.netty.buffer.ByteBuf byteBuf33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel30.write(byteBuf33);
        bufferedChannel27.write(byteBuf33);
        bufferedChannel24.write(byteBuf33);
        bufferedChannel23.write(byteBuf33);
        io.netty.buffer.ByteBuf byteBuf38 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf38);
        bufferedChannel10.write(byteBuf38);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf38);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(byteBuf38);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel3.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf15);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf18);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf21);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf23);
        bufferedChannel17.write(byteBuf23);
        bufferedChannel14.write(byteBuf23);
        bufferedChannel13.write(byteBuf23);
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf28);
        bufferedChannel0.write(byteBuf28);
        io.netty.buffer.ByteBuf byteBuf31 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf5);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf17);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf21);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf23);
        bufferedChannel19.write(byteBuf23);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf27);
        io.netty.buffer.ByteBuf byteBuf29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf29);
        io.netty.buffer.ByteBuf byteBuf31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf31);
        bufferedChannel19.write(byteBuf31);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel34.write(byteBuf35);
        bufferedChannel19.write(byteBuf35);
        bufferedChannel16.write(byteBuf35);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel39 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel39.write(byteBuf40);
        io.netty.buffer.ByteBuf byteBuf42 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel39.write(byteBuf42);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel45 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel46 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf48 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel47.write(byteBuf48);
        io.netty.buffer.ByteBuf byteBuf50 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel47.write(byteBuf50);
        bufferedChannel46.write(byteBuf50);
        bufferedChannel45.write(byteBuf50);
        bufferedChannel44.write(byteBuf50);
        bufferedChannel39.write(byteBuf50);
        bufferedChannel16.write(byteBuf50);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf50);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(bufferedChannel39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(bufferedChannel44);
        org.junit.Assert.assertNotNull(bufferedChannel45);
        org.junit.Assert.assertNotNull(bufferedChannel46);
        org.junit.Assert.assertNotNull(bufferedChannel47);
        org.junit.Assert.assertNotNull(byteBuf48);
        org.junit.Assert.assertNotNull(byteBuf50);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf11);
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf13);
        bufferedChannel9.write(byteBuf13);
        bufferedChannel8.write(byteBuf13);
        bufferedChannel7.write(byteBuf13);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf13);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf13);
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel12.write(byteBuf15);
        bufferedChannel11.write(byteBuf15);
        bufferedChannel6.write(byteBuf15);
        bufferedChannel1.write(byteBuf15);
        bufferedChannel0.write(byteBuf15);
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf15);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf18);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf21);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf23);
        bufferedChannel17.write(byteBuf23);
        bufferedChannel14.write(byteBuf23);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel28.write(byteBuf29);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf32 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel31.write(byteBuf32);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel34.write(byteBuf35);
        io.netty.buffer.ByteBuf byteBuf37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel34.write(byteBuf37);
        bufferedChannel31.write(byteBuf37);
        bufferedChannel28.write(byteBuf37);
        bufferedChannel27.write(byteBuf37);
        io.netty.buffer.ByteBuf byteBuf42 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf42);
        bufferedChannel14.write(byteBuf42);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf42);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(bufferedChannel31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf42);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf11);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf14);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf17);
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf19);
        bufferedChannel13.write(byteBuf19);
        bufferedChannel10.write(byteBuf19);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf19);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf7 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel10.write(byteBuf14);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf18);
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf20);
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf22);
        bufferedChannel10.write(byteBuf22);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf22);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf5);
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf7);
        bufferedChannel3.write(byteBuf7);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf11);
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf13);
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf15);
        bufferedChannel3.write(byteBuf15);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf19);
        bufferedChannel3.write(byteBuf19);
        bufferedChannel0.write(byteBuf19);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf24);
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf26);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel28.write(byteBuf29);
        io.netty.buffer.ByteBuf byteBuf31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel28.write(byteBuf31);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel34.write(byteBuf35);
        io.netty.buffer.ByteBuf byteBuf37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel34.write(byteBuf37);
        bufferedChannel33.write(byteBuf37);
        bufferedChannel28.write(byteBuf37);
        bufferedChannel23.write(byteBuf37);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel43 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf44 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel43.write(byteBuf44);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel46 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf47 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel46.write(byteBuf47);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf50 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel49.write(byteBuf50);
        io.netty.buffer.ByteBuf byteBuf52 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel49.write(byteBuf52);
        bufferedChannel46.write(byteBuf52);
        bufferedChannel43.write(byteBuf52);
        bufferedChannel42.write(byteBuf52);
        io.netty.buffer.ByteBuf byteBuf57 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel42.write(byteBuf57);
        bufferedChannel23.write(byteBuf57);
        bufferedChannel0.write(byteBuf57);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(bufferedChannel33);
        org.junit.Assert.assertNotNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(byteBuf35);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(bufferedChannel42);
        org.junit.Assert.assertNotNull(bufferedChannel43);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(bufferedChannel46);
        org.junit.Assert.assertNotNull(byteBuf47);
        org.junit.Assert.assertNotNull(bufferedChannel49);
        org.junit.Assert.assertNotNull(byteBuf50);
        org.junit.Assert.assertNotNull(byteBuf52);
        org.junit.Assert.assertNotNull(byteBuf57);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf15);
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf17);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel19.write(byteBuf20);
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel19.write(byteBuf22);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel25.write(byteBuf26);
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel25.write(byteBuf28);
        bufferedChannel24.write(byteBuf28);
        bufferedChannel19.write(byteBuf28);
        bufferedChannel14.write(byteBuf28);
        bufferedChannel13.write(byteBuf28);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf28);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf5);
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf7);
        bufferedChannel3.write(byteBuf7);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf11);
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf13);
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel10.write(byteBuf15);
        bufferedChannel3.write(byteBuf15);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf19);
        bufferedChannel3.write(byteBuf19);
        bufferedChannel0.write(byteBuf19);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf24);
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf26);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf32 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel31.write(byteBuf32);
        io.netty.buffer.ByteBuf byteBuf34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel31.write(byteBuf34);
        bufferedChannel30.write(byteBuf34);
        bufferedChannel29.write(byteBuf34);
        bufferedChannel28.write(byteBuf34);
        bufferedChannel23.write(byteBuf34);
        bufferedChannel0.write(byteBuf34);
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(bufferedChannel29);
        org.junit.Assert.assertNotNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(bufferedChannel31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf34);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf8);
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf12);
        bufferedChannel0.write(byteBuf12);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf18);
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf20);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel22.write(byteBuf23);
        io.netty.buffer.ByteBuf byteBuf25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel22.write(byteBuf25);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel28.write(byteBuf29);
        io.netty.buffer.ByteBuf byteBuf31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel28.write(byteBuf31);
        bufferedChannel27.write(byteBuf31);
        bufferedChannel22.write(byteBuf31);
        bufferedChannel17.write(byteBuf31);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf31);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf31);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf3);
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf5);
        bufferedChannel1.write(byteBuf5);
        bufferedChannel0.write(byteBuf5);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf15);
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf17);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel19.write(byteBuf20);
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel19.write(byteBuf22);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel25.write(byteBuf26);
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel25.write(byteBuf28);
        bufferedChannel24.write(byteBuf28);
        io.netty.buffer.ByteBuf byteBuf31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel24.write(byteBuf31);
        bufferedChannel19.write(byteBuf31);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf38 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel37.write(byteBuf38);
        io.netty.buffer.ByteBuf byteBuf40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel37.write(byteBuf40);
        bufferedChannel36.write(byteBuf40);
        bufferedChannel35.write(byteBuf40);
        bufferedChannel34.write(byteBuf40);
        bufferedChannel19.write(byteBuf40);
        bufferedChannel14.write(byteBuf40);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel47 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf49 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel48.write(byteBuf49);
        io.netty.buffer.ByteBuf byteBuf51 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel48.write(byteBuf51);
        bufferedChannel47.write(byteBuf51);
        io.netty.buffer.ByteBuf byteBuf54 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel47.write(byteBuf54);
        bufferedChannel14.write(byteBuf54);
        bufferedChannel11.write(byteBuf54);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf54);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(bufferedChannel35);
        org.junit.Assert.assertNotNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(bufferedChannel37);
        org.junit.Assert.assertNotNull(byteBuf38);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(bufferedChannel47);
        org.junit.Assert.assertNotNull(bufferedChannel48);
        org.junit.Assert.assertNotNull(byteBuf49);
        org.junit.Assert.assertNotNull(byteBuf51);
        org.junit.Assert.assertNotNull(byteBuf54);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf8);
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf12);
        bufferedChannel0.write(byteBuf12);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf17);
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf19);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel21.write(byteBuf22);
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel21.write(byteBuf24);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf28);
        io.netty.buffer.ByteBuf byteBuf30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf30);
        bufferedChannel26.write(byteBuf30);
        bufferedChannel21.write(byteBuf30);
        bufferedChannel16.write(byteBuf30);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel36.write(byteBuf37);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel39 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel39.write(byteBuf40);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel42 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf43 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel42.write(byteBuf43);
        io.netty.buffer.ByteBuf byteBuf45 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel42.write(byteBuf45);
        bufferedChannel39.write(byteBuf45);
        bufferedChannel36.write(byteBuf45);
        bufferedChannel35.write(byteBuf45);
        io.netty.buffer.ByteBuf byteBuf50 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel35.write(byteBuf50);
        bufferedChannel16.write(byteBuf50);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf50);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(bufferedChannel35);
        org.junit.Assert.assertNotNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(bufferedChannel39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(bufferedChannel42);
        org.junit.Assert.assertNotNull(byteBuf43);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf50);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel5.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf13);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf16);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf19);
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel18.write(byteBuf21);
        bufferedChannel15.write(byteBuf21);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf27);
        io.netty.buffer.ByteBuf byteBuf29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf29);
        bufferedChannel25.write(byteBuf29);
        bufferedChannel24.write(byteBuf29);
        bufferedChannel15.write(byteBuf29);
        bufferedChannel0.write(byteBuf29);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf29);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel3.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf3);
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf5);
        bufferedChannel1.write(byteBuf5);
        bufferedChannel0.write(byteBuf5);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel2.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf6);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel8.write(byteBuf11);
        bufferedChannel5.write(byteBuf11);
        bufferedChannel2.write(byteBuf11);
        bufferedChannel1.write(byteBuf11);
        bufferedChannel0.write(byteBuf11);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf18);
        bufferedChannel0.write(byteBuf18);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf6);
        bufferedChannel2.write(byteBuf6);
        bufferedChannel1.write(byteBuf6);
        bufferedChannel0.write(byteBuf6);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf17);
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf19);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel21.write(byteBuf22);
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel21.write(byteBuf24);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf28);
        io.netty.buffer.ByteBuf byteBuf30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf30);
        bufferedChannel26.write(byteBuf30);
        bufferedChannel21.write(byteBuf30);
        bufferedChannel16.write(byteBuf30);
        bufferedChannel11.write(byteBuf30);
        bufferedChannel0.write(byteBuf30);
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf30);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf8);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel10.write(byteBuf14);
        bufferedChannel5.write(byteBuf14);
        bufferedChannel0.write(byteBuf14);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel19.write(byteBuf20);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel22.write(byteBuf23);
        io.netty.buffer.ByteBuf byteBuf25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel22.write(byteBuf25);
        bufferedChannel19.write(byteBuf25);
        bufferedChannel0.write(byteBuf25);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel30.write(byteBuf31);
        io.netty.buffer.ByteBuf byteBuf33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel30.write(byteBuf33);
        bufferedChannel29.write(byteBuf33);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel36.write(byteBuf37);
        io.netty.buffer.ByteBuf byteBuf39 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel36.write(byteBuf39);
        io.netty.buffer.ByteBuf byteBuf41 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel36.write(byteBuf41);
        bufferedChannel29.write(byteBuf41);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf45 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel44.write(byteBuf45);
        bufferedChannel29.write(byteBuf45);
        bufferedChannel0.write(byteBuf45);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(bufferedChannel29);
        org.junit.Assert.assertNotNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(byteBuf37);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(bufferedChannel44);
        org.junit.Assert.assertNotNull(byteBuf45);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel3.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel14.write(byteBuf15);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel17.write(byteBuf18);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf21);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf23);
        bufferedChannel17.write(byteBuf23);
        bufferedChannel14.write(byteBuf23);
        bufferedChannel13.write(byteBuf23);
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel13.write(byteBuf28);
        bufferedChannel0.write(byteBuf28);
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(bufferedChannel14);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf28);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel4.write(byteBuf5);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf8);
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf10);
        bufferedChannel4.write(byteBuf10);
        bufferedChannel1.write(byteBuf10);
        bufferedChannel0.write(byteBuf10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf16);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf18);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf21);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf23);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf27);
        io.netty.buffer.ByteBuf byteBuf29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf29);
        bufferedChannel25.write(byteBuf29);
        io.netty.buffer.ByteBuf byteBuf32 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel25.write(byteBuf32);
        bufferedChannel20.write(byteBuf32);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel35 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf39 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel38.write(byteBuf39);
        io.netty.buffer.ByteBuf byteBuf41 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel38.write(byteBuf41);
        bufferedChannel37.write(byteBuf41);
        bufferedChannel36.write(byteBuf41);
        bufferedChannel35.write(byteBuf41);
        bufferedChannel20.write(byteBuf41);
        bufferedChannel15.write(byteBuf41);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel48 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel49 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf50 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel49.write(byteBuf50);
        io.netty.buffer.ByteBuf byteBuf52 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel49.write(byteBuf52);
        bufferedChannel48.write(byteBuf52);
        io.netty.buffer.ByteBuf byteBuf55 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel48.write(byteBuf55);
        bufferedChannel15.write(byteBuf55);
        bufferedChannel0.write(byteBuf55);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(bufferedChannel4);
        org.junit.Assert.assertNotNull(byteBuf5);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(bufferedChannel25);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(bufferedChannel35);
        org.junit.Assert.assertNotNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(bufferedChannel37);
        org.junit.Assert.assertNotNull(bufferedChannel38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(bufferedChannel48);
        org.junit.Assert.assertNotNull(bufferedChannel49);
        org.junit.Assert.assertNotNull(byteBuf50);
        org.junit.Assert.assertNotNull(byteBuf52);
        org.junit.Assert.assertNotNull(byteBuf55);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf8);
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf12);
        bufferedChannel0.write(byteBuf12);
        bufferedChannel0.close();
        bufferedChannel0.close();
        io.netty.buffer.ByteBuf byteBuf17 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf8);
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf12);
        bufferedChannel0.write(byteBuf12);
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf17);
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf19);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel21.write(byteBuf22);
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel21.write(byteBuf24);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf28 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf28);
        io.netty.buffer.ByteBuf byteBuf30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel27.write(byteBuf30);
        bufferedChannel26.write(byteBuf30);
        io.netty.buffer.ByteBuf byteBuf33 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf33);
        bufferedChannel21.write(byteBuf33);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel39 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf40 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel39.write(byteBuf40);
        io.netty.buffer.ByteBuf byteBuf42 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel39.write(byteBuf42);
        bufferedChannel38.write(byteBuf42);
        bufferedChannel37.write(byteBuf42);
        bufferedChannel36.write(byteBuf42);
        bufferedChannel21.write(byteBuf42);
        bufferedChannel16.write(byteBuf42);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf42);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(byteBuf28);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf33);
        org.junit.Assert.assertNotNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(bufferedChannel37);
        org.junit.Assert.assertNotNull(bufferedChannel38);
        org.junit.Assert.assertNotNull(bufferedChannel39);
        org.junit.Assert.assertNotNull(byteBuf40);
        org.junit.Assert.assertNotNull(byteBuf42);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel6.write(byteBuf9);
        bufferedChannel3.write(byteBuf9);
        bufferedChannel0.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf13 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        io.netty.buffer.ByteBuf byteBuf3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf3);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf6);
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel5.write(byteBuf8);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        bufferedChannel10.write(byteBuf14);
        bufferedChannel5.write(byteBuf14);
        bufferedChannel0.write(byteBuf14);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel20 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel20.write(byteBuf21);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel23.write(byteBuf24);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf27 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf27);
        io.netty.buffer.ByteBuf byteBuf29 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel26.write(byteBuf29);
        bufferedChannel23.write(byteBuf29);
        bufferedChannel20.write(byteBuf29);
        bufferedChannel19.write(byteBuf29);
        io.netty.buffer.ByteBuf byteBuf34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel19.write(byteBuf34);
        bufferedChannel0.write(byteBuf34);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel37 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf39 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel38.write(byteBuf39);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf42 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel41.write(byteBuf42);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel44 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf45 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel44.write(byteBuf45);
        io.netty.buffer.ByteBuf byteBuf47 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel44.write(byteBuf47);
        bufferedChannel41.write(byteBuf47);
        bufferedChannel38.write(byteBuf47);
        bufferedChannel37.write(byteBuf47);
        bufferedChannel0.write(byteBuf47);
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(byteBuf3);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(bufferedChannel20);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(byteBuf27);
        org.junit.Assert.assertNotNull(byteBuf29);
        org.junit.Assert.assertNotNull(byteBuf34);
        org.junit.Assert.assertNotNull(bufferedChannel37);
        org.junit.Assert.assertNotNull(bufferedChannel38);
        org.junit.Assert.assertNotNull(byteBuf39);
        org.junit.Assert.assertNotNull(bufferedChannel41);
        org.junit.Assert.assertNotNull(byteBuf42);
        org.junit.Assert.assertNotNull(bufferedChannel44);
        org.junit.Assert.assertNotNull(byteBuf45);
        org.junit.Assert.assertNotNull(byteBuf47);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf8);
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel7.write(byteBuf12);
        bufferedChannel0.write(byteBuf12);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel15.write(byteBuf16);
        bufferedChannel0.write(byteBuf16);
        bufferedChannel0.close();
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteBuf16);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf2 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf2);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel1.write(byteBuf4);
        bufferedChannel0.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf7);
        bufferedChannel0.close();
        io.netty.buffer.ByteBuf byteBuf10 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(bufferedChannel1);
        org.junit.Assert.assertNotNull(byteBuf2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel0 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel0.write(byteBuf1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf4);
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel3.write(byteBuf6);
        bufferedChannel0.write(byteBuf6);
        bufferedChannel0.close();
        bufferedChannel0.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel11.write(byteBuf14);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf17);
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel16.write(byteBuf19);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel22.write(byteBuf23);
        io.netty.buffer.ByteBuf byteBuf25 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel22.write(byteBuf25);
        bufferedChannel21.write(byteBuf25);
        bufferedChannel16.write(byteBuf25);
        bufferedChannel11.write(byteBuf25);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel31 = org.apache.bookkeeper.bookie.RandoopSetup.createValidBufferedChannel();
        io.netty.buffer.ByteBuf byteBuf32 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel31.write(byteBuf32);
        io.netty.buffer.ByteBuf byteBuf34 = org.apache.bookkeeper.bookie.RandoopSetup.createValidData();
        bufferedChannel31.write(byteBuf34);
        bufferedChannel30.write(byteBuf34);
        bufferedChannel11.write(byteBuf34);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel0.write(byteBuf34);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel0);
        org.junit.Assert.assertNotNull(byteBuf1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf25);
        org.junit.Assert.assertNotNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(bufferedChannel31);
        org.junit.Assert.assertNotNull(byteBuf32);
        org.junit.Assert.assertNotNull(byteBuf34);
    }
}

