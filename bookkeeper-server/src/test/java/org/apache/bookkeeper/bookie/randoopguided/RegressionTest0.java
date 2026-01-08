package org.apache.bookkeeper.bookie.randoopguided;

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
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (short) -1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList3 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.listFiles()\" because \"journalDir\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(journalIdFilter2);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.io.File file0 = null;
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList3 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.listFiles()\" because \"journalDir\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(journalIdFilter2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 10, true);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"not-a-hex-number\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 10, true);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList4 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"not-a-hex-number\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 10, 0, (int) (short) 100);
        bufferedChannel3.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 100, false);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.close();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.write(byteBuf6);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.flush();
        bufferedChannel3.close();
        io.netty.buffer.ByteBuf byteBuf6 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.write(byteBuf6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (short) -1, true);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"not-a-hex-number\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (short) -1, true);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"not-a-hex-number\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) ' ', (int) (short) 100);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 10, true);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"not-a-hex-number\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.flush();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel3.write(byteBuf6);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel11.flush();
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel11.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel11.write(byteBuf17);
        bufferedChannel3.write(byteBuf17);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter1 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 100);
        org.junit.Assert.assertNotNull(journalIdFilter1);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (short) 100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (short) -1, true);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"not-a-hex-number\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 100, 1, 0);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 10, true);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"not-a-hex-number\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 10, (int) (byte) 0, 0);
        bufferedChannel3.flush();
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) '#', false);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(100, (int) '#', 100);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) (byte) -1, (int) (byte) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel12.flush();
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel12.write(byteBuf15);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel12.write(byteBuf18);
        bufferedChannel8.write(byteBuf18);
        bufferedChannel3.write(byteBuf18);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.write(byteBuf23);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf23);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.flush();
        bufferedChannel3.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 1, (int) (byte) 100, 1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(10, true);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"not-a-hex-number\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 1, 1, (int) (byte) 1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) '4', (int) 'a');
        bufferedChannel3.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, true);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"not-a-hex-number\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(100, true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, (int) ' ', (int) (byte) 100);
        bufferedChannel3.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (short) 0, false);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) -1, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(100);
        java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (short) 0);
        java.util.List<java.lang.Long> longList8 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter7);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
        org.junit.Assert.assertNotNull(longList5);
        org.junit.Assert.assertNotNull(journalIdFilter7);
        org.junit.Assert.assertNotNull(longList8);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) '#', true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter1 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (short) 10);
        org.junit.Assert.assertNotNull(journalIdFilter1);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) '4', (int) 'a');
        bufferedChannel3.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel8.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel13.flush();
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel13.write(byteBuf16);
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel13.write(byteBuf19);
        bufferedChannel8.write(byteBuf19);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '#');
        bufferedChannel8.write(byteBuf23);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.write(byteBuf23);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf23);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter1 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(10);
        org.junit.Assert.assertNotNull(journalIdFilter1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 10, (int) (short) 1, (int) '#');
        bufferedChannel3.flush();
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (byte) 1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 1, (-1), (int) (byte) 10);
        bufferedChannel3.flush();
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) -1, (int) (byte) -1, (int) ' ');
        bufferedChannel3.flush();
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter1 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (short) 1);
        org.junit.Assert.assertNotNull(journalIdFilter1);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) 'a', false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(1);
        java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
        org.junit.Assert.assertNotNull(longList5);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 10, false);
        java.io.File file5 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) -1, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(100);
        java.util.List<java.lang.Long> longList8 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file5, journalIdFilter7);
        java.io.File file11 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter13 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 10);
        java.util.List<java.lang.Long> longList14 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file11, journalIdFilter13);
        java.util.List<java.lang.Long> longList15 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file5, journalIdFilter13);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter17 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(0);
        java.util.List<java.lang.Long> longList18 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file5, journalIdFilter17);
        java.util.List<java.lang.Long> longList19 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter17);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file5.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter7);
        org.junit.Assert.assertNotNull(longList8);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file11.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter13);
        org.junit.Assert.assertNotNull(longList14);
        org.junit.Assert.assertNotNull(longList15);
        org.junit.Assert.assertNotNull(journalIdFilter17);
        org.junit.Assert.assertNotNull(longList18);
        org.junit.Assert.assertNotNull(longList19);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) -1, (int) 'a', (int) (short) 1);
        bufferedChannel3.flush();
        bufferedChannel3.flush();
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) (byte) -1, (int) (byte) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel12.flush();
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel12.write(byteBuf15);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel12.write(byteBuf18);
        bufferedChannel8.write(byteBuf18);
        bufferedChannel3.write(byteBuf18);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.write(byteBuf23);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf23);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) ' ', true);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList4 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter3);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"not-a-hex-number\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 0, false);
        java.io.File file5 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, true);
        java.io.File file8 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter10 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 0);
        java.util.List<java.lang.Long> longList11 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file8, journalIdFilter10);
        java.util.List<java.lang.Long> longList12 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file5, journalIdFilter10);
        java.util.List<java.lang.Long> longList13 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter10);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file5.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file8.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter10);
        org.junit.Assert.assertNotNull(longList11);
        org.junit.Assert.assertNotNull(longList12);
        org.junit.Assert.assertNotNull(longList13);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, (int) ' ', (int) (byte) 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) '#', (int) (short) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel11.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel16.flush();
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel16.write(byteBuf19);
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel16.write(byteBuf22);
        bufferedChannel11.write(byteBuf22);
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '#');
        bufferedChannel11.write(byteBuf26);
        bufferedChannel7.write(byteBuf26);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel32 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel36 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel36.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel41 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel41.flush();
        io.netty.buffer.ByteBuf byteBuf44 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel41.write(byteBuf44);
        io.netty.buffer.ByteBuf byteBuf47 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel41.write(byteBuf47);
        bufferedChannel36.write(byteBuf47);
        bufferedChannel32.write(byteBuf47);
        bufferedChannel7.write(byteBuf47);
        bufferedChannel3.write(byteBuf47);
        bufferedChannel3.flush();
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf26);
        org.junit.Assert.assertNotNull(bufferedChannel32);
        org.junit.Assert.assertNotNull(bufferedChannel36);
        org.junit.Assert.assertNotNull(bufferedChannel41);
        org.junit.Assert.assertNotNull(byteBuf44);
        org.junit.Assert.assertNotNull(byteBuf47);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.flush();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel3.write(byteBuf6);
        bufferedChannel3.flush();
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel3.write(byteBuf10);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) -1, (int) (short) 1, 0);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) ' ', false);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.flush();
        bufferedChannel3.close();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel3.write(byteBuf7);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) '4', (int) (byte) 0);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) (byte) -1, (int) (byte) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel12.flush();
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel12.write(byteBuf15);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel12.write(byteBuf18);
        bufferedChannel8.write(byteBuf18);
        bufferedChannel3.write(byteBuf18);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 10, 0, (int) (short) 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) '#', (int) (short) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel11.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel16.flush();
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel16.write(byteBuf19);
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel16.write(byteBuf22);
        bufferedChannel11.write(byteBuf22);
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '#');
        bufferedChannel11.write(byteBuf26);
        bufferedChannel7.write(byteBuf26);
        bufferedChannel3.write(byteBuf26);
        bufferedChannel3.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf26);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((-1));
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(1, true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) -1, (int) 'a', (int) (short) 1);
        bufferedChannel3.close();
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel8.flush();
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel8.write(byteBuf11);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel8.write(byteBuf14);
        bufferedChannel3.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '#');
        bufferedChannel3.write(byteBuf18);
        bufferedChannel3.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) (byte) -1, (int) (byte) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel28.flush();
        io.netty.buffer.ByteBuf byteBuf31 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel28.write(byteBuf31);
        io.netty.buffer.ByteBuf byteBuf34 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel28.write(byteBuf34);
        bufferedChannel24.write(byteBuf34);
        bufferedChannel3.write(byteBuf34);
        bufferedChannel3.close();
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuf31);
        org.junit.Assert.assertNotNull(byteBuf34);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (short) 100, true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.io.File file0 = null;
        java.io.File file3 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) -1, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter5 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(100);
        java.util.List<java.lang.Long> longList6 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file3, journalIdFilter5);
        java.io.File file9 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter11 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 10);
        java.util.List<java.lang.Long> longList12 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file9, journalIdFilter11);
        java.util.List<java.lang.Long> longList13 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file3, journalIdFilter11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList14 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.listFiles()\" because \"journalDir\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file3.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter5);
        org.junit.Assert.assertNotNull(longList6);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file9.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter11);
        org.junit.Assert.assertNotNull(longList12);
        org.junit.Assert.assertNotNull(longList13);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel8.flush();
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel8.write(byteBuf11);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel8.write(byteBuf14);
        bufferedChannel3.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '#');
        bufferedChannel3.write(byteBuf18);
        bufferedChannel3.close();
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel3.write(byteBuf22);
        bufferedChannel3.close();
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf22);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 10, 0, (int) (short) 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) '#', (int) (short) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel11.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel16.flush();
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel16.write(byteBuf19);
        io.netty.buffer.ByteBuf byteBuf22 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel16.write(byteBuf22);
        bufferedChannel11.write(byteBuf22);
        io.netty.buffer.ByteBuf byteBuf26 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '#');
        bufferedChannel11.write(byteBuf26);
        bufferedChannel7.write(byteBuf26);
        bufferedChannel3.write(byteBuf26);
        bufferedChannel3.close();
        bufferedChannel3.close();
        bufferedChannel3.close();
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf19);
        org.junit.Assert.assertNotNull(byteBuf22);
        org.junit.Assert.assertNotNull(byteBuf26);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 0);
        java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 10);
        java.util.List<java.lang.Long> longList8 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter7);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
        org.junit.Assert.assertNotNull(longList5);
        org.junit.Assert.assertNotNull(journalIdFilter7);
        org.junit.Assert.assertNotNull(longList8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, (int) (byte) 0, (int) (byte) 1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) 'a', (int) (byte) 0);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 10, 0, (int) (short) 100);
        bufferedChannel3.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) '#', (int) (short) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel12.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel17 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel17.flush();
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel17.write(byteBuf20);
        io.netty.buffer.ByteBuf byteBuf23 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel17.write(byteBuf23);
        bufferedChannel12.write(byteBuf23);
        io.netty.buffer.ByteBuf byteBuf27 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '#');
        bufferedChannel12.write(byteBuf27);
        bufferedChannel8.write(byteBuf27);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.write(byteBuf27);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(bufferedChannel17);
        org.junit.Assert.assertNotNull(byteBuf20);
        org.junit.Assert.assertNotNull(byteBuf23);
        org.junit.Assert.assertNotNull(byteBuf27);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.File file0 = null;
        java.io.File file3 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) -1, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter5 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(100);
        java.util.List<java.lang.Long> longList6 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file3, journalIdFilter5);
        java.io.File file9 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter11 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 10);
        java.util.List<java.lang.Long> longList12 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file9, journalIdFilter11);
        java.util.List<java.lang.Long> longList13 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file3, journalIdFilter11);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter15 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(0);
        java.util.List<java.lang.Long> longList16 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file3, journalIdFilter15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList17 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file0, journalIdFilter15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.io.File.listFiles()\" because \"journalDir\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file3);
        org.junit.Assert.assertEquals(file3.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file3.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter5);
        org.junit.Assert.assertNotNull(longList6);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertEquals(file9.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file9.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter11);
        org.junit.Assert.assertNotNull(longList12);
        org.junit.Assert.assertNotNull(longList13);
        org.junit.Assert.assertNotNull(journalIdFilter15);
        org.junit.Assert.assertNotNull(longList16);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(10, false);
        java.io.File file5 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) -1, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(100);
        java.util.List<java.lang.Long> longList8 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file5, journalIdFilter7);
        java.io.File file11 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter13 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 10);
        java.util.List<java.lang.Long> longList14 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file11, journalIdFilter13);
        java.util.List<java.lang.Long> longList15 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file5, journalIdFilter13);
        java.util.List<java.lang.Long> longList16 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter13);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file5.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter7);
        org.junit.Assert.assertNotNull(longList8);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file11.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter13);
        org.junit.Assert.assertNotNull(longList14);
        org.junit.Assert.assertNotNull(longList15);
        org.junit.Assert.assertNotNull(longList16);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) (short) -1, (int) (short) 100);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) -1, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(100);
        java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
        java.io.File file8 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter10 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 10);
        java.util.List<java.lang.Long> longList11 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file8, journalIdFilter10);
        java.util.List<java.lang.Long> longList12 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter10);
        java.io.File file15 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter17 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 10);
        java.util.List<java.lang.Long> longList18 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file15, journalIdFilter17);
        java.util.List<java.lang.Long> longList19 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter17);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
        org.junit.Assert.assertNotNull(longList5);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file8.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter10);
        org.junit.Assert.assertNotNull(longList11);
        org.junit.Assert.assertNotNull(longList12);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertEquals(file15.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file15.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter17);
        org.junit.Assert.assertNotNull(longList18);
        org.junit.Assert.assertNotNull(longList19);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, (int) '4', (int) ' ');
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 0, true);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((-1));
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"not-a-hex-number\" under radix 16");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 100, (int) (short) 100, (int) (short) -1);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 100, true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 1, true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.flush();
        bufferedChannel3.close();
        bufferedChannel3.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, (int) (short) 10, (int) (short) 10);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) -1, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(100);
        java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
        java.io.File file8 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter10 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 10);
        java.util.List<java.lang.Long> longList11 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file8, journalIdFilter10);
        java.util.List<java.lang.Long> longList12 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter10);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter14 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(0);
        java.util.List<java.lang.Long> longList15 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter14);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter17 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(100);
        java.util.List<java.lang.Long> longList18 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter17);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
        org.junit.Assert.assertNotNull(longList5);
        org.junit.Assert.assertNotNull(file8);
        org.junit.Assert.assertEquals(file8.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file8.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter10);
        org.junit.Assert.assertNotNull(longList11);
        org.junit.Assert.assertNotNull(longList12);
        org.junit.Assert.assertNotNull(journalIdFilter14);
        org.junit.Assert.assertNotNull(longList15);
        org.junit.Assert.assertNotNull(journalIdFilter17);
        org.junit.Assert.assertNotNull(longList18);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) '4', (int) 'a');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel7.flush();
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel7.write(byteBuf10);
        bufferedChannel7.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel16.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel21 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel21.flush();
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel21.write(byteBuf24);
        io.netty.buffer.ByteBuf byteBuf27 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel21.write(byteBuf27);
        bufferedChannel16.write(byteBuf27);
        bufferedChannel7.write(byteBuf27);
        bufferedChannel3.write(byteBuf27);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(bufferedChannel21);
        org.junit.Assert.assertNotNull(byteBuf24);
        org.junit.Assert.assertNotNull(byteBuf27);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(10, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) '#');
        java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
        org.junit.Assert.assertNotNull(longList5);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, true);
        java.io.File file5 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 0);
        java.util.List<java.lang.Long> longList8 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file5, journalIdFilter7);
        java.util.List<java.lang.Long> longList9 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter7);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter11 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) 'a');
        java.util.List<java.lang.Long> longList12 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter11);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file5.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter7);
        org.junit.Assert.assertNotNull(longList8);
        org.junit.Assert.assertNotNull(longList9);
        org.junit.Assert.assertNotNull(journalIdFilter11);
        org.junit.Assert.assertNotNull(longList12);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 10, 0, (int) (short) 100);
        bufferedChannel3.close();
        bufferedChannel3.close();
        bufferedChannel3.close();
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) -1, (int) 'a', (int) (short) 1);
        bufferedChannel3.flush();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '4');
        bufferedChannel3.write(byteBuf6);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel11 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) (byte) -1, (int) (byte) 1);
        bufferedChannel11.flush();
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (short) 1);
        bufferedChannel11.write(byteBuf14);
        bufferedChannel3.write(byteBuf14);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel11);
        org.junit.Assert.assertNotNull(byteBuf14);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) '4', false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) '4');
        java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
        org.junit.Assert.assertNotNull(longList5);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 0, true);
        java.io.File file5 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) -1, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter(100);
        java.util.List<java.lang.Long> longList8 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file5, journalIdFilter7);
        java.io.File file11 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter13 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (byte) 10);
        java.util.List<java.lang.Long> longList14 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file11, journalIdFilter13);
        java.util.List<java.lang.Long> longList15 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file5, journalIdFilter13);
        java.util.List<java.lang.Long> longList16 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter13);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(file5);
        org.junit.Assert.assertEquals(file5.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file5.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter7);
        org.junit.Assert.assertNotNull(longList8);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertEquals(file11.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file11.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter13);
        org.junit.Assert.assertNotNull(longList14);
        org.junit.Assert.assertNotNull(longList15);
        org.junit.Assert.assertNotNull(longList16);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 0, (int) (byte) 10, (-1));
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel7.flush();
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel7.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel7.write(byteBuf13);
        bufferedChannel3.write(byteBuf13);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 1, (int) (byte) 10, (int) (short) 0);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 1, 1, (int) (byte) -1);
        bufferedChannel3.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel8.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel13.flush();
        io.netty.buffer.ByteBuf byteBuf16 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel13.write(byteBuf16);
        io.netty.buffer.ByteBuf byteBuf19 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel13.write(byteBuf19);
        bufferedChannel8.write(byteBuf19);
        bufferedChannel3.write(byteBuf19);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuf16);
        org.junit.Assert.assertNotNull(byteBuf19);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter3 = null;
        java.util.List<java.lang.Long> longList4 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter3);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(longList4);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.close();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (short) 0);
        bufferedChannel3.write(byteBuf6);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) -1, (-1), (int) (byte) 0);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) '4', (int) 'a');
        bufferedChannel3.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) (byte) -1, (int) (byte) 1);
        bufferedChannel8.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel13.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel18.flush();
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel18.write(byteBuf21);
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel18.write(byteBuf24);
        bufferedChannel13.write(byteBuf24);
        bufferedChannel8.write(byteBuf24);
        bufferedChannel3.write(byteBuf24);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(byteBuf21);
        org.junit.Assert.assertNotNull(byteBuf24);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter4 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) ' ');
        java.util.List<java.lang.Long> longList5 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter4);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(journalIdFilter4);
        org.junit.Assert.assertNotNull(longList5);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 100, (int) (short) 100, (int) (short) 100);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) (short) 100, (int) (byte) 1);
        bufferedChannel3.flush();
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) (byte) -1, (int) (byte) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel7.flush();
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel7.write(byteBuf10);
        io.netty.buffer.ByteBuf byteBuf13 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel7.write(byteBuf13);
        bufferedChannel3.write(byteBuf13);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) -1, (int) 'a', (int) (short) 1);
        bufferedChannel19.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel24 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 10, (int) (short) 1, (int) '#');
        bufferedChannel24.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel29.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel34 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) (byte) -1, (int) (byte) 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel38 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel38.flush();
        io.netty.buffer.ByteBuf byteBuf41 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        bufferedChannel38.write(byteBuf41);
        io.netty.buffer.ByteBuf byteBuf44 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        bufferedChannel38.write(byteBuf44);
        bufferedChannel34.write(byteBuf44);
        bufferedChannel29.write(byteBuf44);
        bufferedChannel24.write(byteBuf44);
        bufferedChannel19.write(byteBuf44);
        bufferedChannel3.write(byteBuf44);
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf10);
        org.junit.Assert.assertNotNull(byteBuf13);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(bufferedChannel24);
        org.junit.Assert.assertNotNull(bufferedChannel29);
        org.junit.Assert.assertNotNull(bufferedChannel34);
        org.junit.Assert.assertNotNull(bufferedChannel38);
        org.junit.Assert.assertNotNull(byteBuf41);
        org.junit.Assert.assertNotNull(byteBuf44);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter1 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomFilter((int) (short) -1);
        org.junit.Assert.assertNotNull(journalIdFilter1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) '#', (int) (byte) 10, (int) '#');
        bufferedChannel3.flush();
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(1, false);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 10, 0, (int) (short) 100);
        bufferedChannel3.flush();
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 1, 0);
        bufferedChannel3.flush();
        bufferedChannel3.close();
        bufferedChannel3.close();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(1);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel3.write(byteBuf8);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel3);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel3 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) (byte) -1, 100);
        org.junit.Assert.assertNotNull(bufferedChannel3);
    }
}

