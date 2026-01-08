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
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((-1), true);
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
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) (short) -1);
        bufferedChannel2.close();
        bufferedChannel2.close();
        io.netty.buffer.ByteBuf byteBuf6 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel2.write(byteBuf6);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf6);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) 'a');
        bufferedChannel2.close();
        io.netty.buffer.ByteBuf byteBuf4 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel2.write(byteBuf4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 1, (int) (byte) 100);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (byte) 10);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) (short) -1);
        bufferedChannel2.close();
        bufferedChannel2.close();
        bufferedChannel2.close();
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel2.write(byteBuf7);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf7);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(10, (int) (short) 10);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(10, true);
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
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, true);
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
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) ' ');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter3 = null;
        java.util.List<java.lang.Long> longList4 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter3);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter5 = null;
        java.util.List<java.lang.Long> longList6 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter5);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(longList4);
        org.junit.Assert.assertNotNull(longList6);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(1, true);
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
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(100, (int) (short) 0);
        bufferedChannel2.flush();
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (byte) 1);
        bufferedChannel2.write(byteBuf5);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        bufferedChannel2.flush();
        bufferedChannel2.flush();
        bufferedChannel2.close();
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(100, (int) (short) 0);
        bufferedChannel2.flush();
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '4');
        bufferedChannel2.write(byteBuf5);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (byte) 0);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(100, true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (short) 0, false);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 1, true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(100, (int) '#');
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(100, (int) (byte) 10);
        bufferedChannel2.close();
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) (byte) -1);
        bufferedChannel2.flush();
        bufferedChannel2.flush();
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) '#', (int) (short) 100);
        bufferedChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel2.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) '4', (int) (short) 0);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((-1));
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) 'a');
        bufferedChannel2.close();
        bufferedChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel7.flush();
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel7.write(byteBuf10);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel2.write(byteBuf10);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 10, false);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel2.flush();
        bufferedChannel2.flush();
        bufferedChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel2.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (byte) -1);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 1, (int) (byte) 10);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '#');
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) 'a');
        bufferedChannel2.close();
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel2.write(byteBuf5);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(10, false);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel2.write(byteBuf4);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel8 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel8.flush();
        bufferedChannel8.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel13 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel13.write(byteBuf15);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel13.write(byteBuf18);
        bufferedChannel8.write(byteBuf18);
        bufferedChannel2.write(byteBuf18);
        bufferedChannel2.close();
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel8);
        org.junit.Assert.assertNotNull(bufferedChannel13);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(byteBuf18);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) (short) -1);
        bufferedChannel2.flush();
        bufferedChannel2.close();
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) (byte) 0);
        bufferedChannel2.flush();
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '4');
        bufferedChannel2.write(byteBuf5);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 100, false);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) 'a');
        bufferedChannel2.close();
        io.netty.buffer.ByteBuf byteBuf5 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel2.write(byteBuf5);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf5);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel2.flush();
        bufferedChannel2.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel7.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel7.write(byteBuf12);
        bufferedChannel2.write(byteBuf12);
        bufferedChannel2.flush();
        bufferedChannel2.close();
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) '4', (int) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel5.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel5.write(byteBuf10);
        bufferedChannel2.write(byteBuf10);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) (byte) 100);
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) '4');
        bufferedChannel2.write(byteBuf4);
        bufferedChannel2.flush();
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 100, (int) (byte) 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel5.flush();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel5.write(byteBuf8);
        bufferedChannel2.write(byteBuf8);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 100, 0);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel2.flush();
        bufferedChannel2.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel7.write(byteBuf9);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel7.write(byteBuf12);
        bufferedChannel2.write(byteBuf12);
        bufferedChannel2.flush();
        bufferedChannel2.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel19 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf24 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel22.write(byteBuf24);
        bufferedChannel19.write(byteBuf24);
        bufferedChannel2.write(byteBuf24);
        bufferedChannel2.flush();
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(byteBuf9);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(bufferedChannel19);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(byteBuf24);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (short) -1, true);
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
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 10, 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(100, (int) (short) 0);
        bufferedChannel5.flush();
        bufferedChannel5.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel10.flush();
        bufferedChannel10.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel15.write(byteBuf17);
        io.netty.buffer.ByteBuf byteBuf20 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel15.write(byteBuf20);
        bufferedChannel10.write(byteBuf20);
        bufferedChannel5.write(byteBuf20);
        bufferedChannel2.write(byteBuf20);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(byteBuf20);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel2.flush();
        bufferedChannel2.close();
        io.netty.buffer.ByteBuf byteBuf5 = null;
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel2.write(byteBuf5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"io.netty.buffer.ByteBuf.readableBytes()\" because \"src\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(100, 100);
        bufferedChannel2.flush();
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (short) 1, true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig(100, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter3 = null;
        java.util.List<java.lang.Long> longList4 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter3);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(longList4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) ' ', true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) '4', (int) (short) 100);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) (byte) -1);
        bufferedChannel2.flush();
        bufferedChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel2.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) (byte) 0);
        bufferedChannel2.close();
        bufferedChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel2.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) 'a', false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter3 = null;
        java.util.List<java.lang.Long> longList4 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter3);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter5 = null;
        java.util.List<java.lang.Long> longList6 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter5);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(longList4);
        org.junit.Assert.assertNotNull(longList6);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 100, (int) (byte) 0);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(100, (int) (short) 0);
        bufferedChannel2.flush();
        bufferedChannel2.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel7.flush();
        bufferedChannel7.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel12.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel12.write(byteBuf17);
        bufferedChannel7.write(byteBuf17);
        bufferedChannel2.write(byteBuf17);
        bufferedChannel2.flush();
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) ' ', false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter3 = null;
        java.util.List<java.lang.Long> longList4 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter3);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter5 = null;
        java.util.List<java.lang.Long> longList6 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter5);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(longList4);
        org.junit.Assert.assertNotNull(longList6);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) '#', true);
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
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) (byte) 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel5.flush();
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel5.write(byteBuf8);
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (short) 10);
        bufferedChannel5.write(byteBuf11);
        bufferedChannel2.write(byteBuf11);
        bufferedChannel2.flush();
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf8);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) (short) 1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel2.flush();
        bufferedChannel2.close();
        bufferedChannel2.close();
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) (byte) 100);
        bufferedChannel2.close();
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 1, 1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        bufferedChannel2.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf8 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel6.write(byteBuf8);
        bufferedChannel2.write(byteBuf8);
        bufferedChannel2.close();
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf8);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) (byte) -1);
        bufferedChannel2.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel6.flush();
        io.netty.buffer.ByteBuf byteBuf9 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel6.write(byteBuf9);
        bufferedChannel2.write(byteBuf9);
        bufferedChannel2.close();
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(byteBuf9);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, 0);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) ' ');
        bufferedChannel2.close();
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (short) 100, false);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 10, (int) (short) 1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', 100);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (short) 100, true);
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
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 100, (int) 'a');
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 0, (int) '4');
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 100, (-1));
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 100, (int) (byte) 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel5.write(byteBuf7);
        io.netty.buffer.ByteBuf byteBuf10 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel5.write(byteBuf10);
        bufferedChannel2.write(byteBuf10);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(byteBuf10);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) (byte) 1);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 10, 1);
        bufferedChannel2.flush();
        bufferedChannel2.close();
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) 'a', true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) ' ');
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel2.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel9.write(byteBuf11);
        bufferedChannel6.write(byteBuf11);
        bufferedChannel2.write(byteBuf11);
        bufferedChannel2.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel18 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(100, (int) (short) 0);
        bufferedChannel18.flush();
        bufferedChannel18.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel23.flush();
        bufferedChannel23.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel28 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf30 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel28.write(byteBuf30);
        io.netty.buffer.ByteBuf byteBuf33 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel28.write(byteBuf33);
        bufferedChannel23.write(byteBuf33);
        bufferedChannel18.write(byteBuf33);
        bufferedChannel2.write(byteBuf33);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(byteBuf11);
        org.junit.Assert.assertNotNull(bufferedChannel18);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(bufferedChannel28);
        org.junit.Assert.assertNotNull(byteBuf30);
        org.junit.Assert.assertNotNull(byteBuf33);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 10, 1);
        bufferedChannel2.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', 10);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 100, (int) (short) -1);
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (short) 100);
        bufferedChannel9.write(byteBuf11);
        bufferedChannel6.write(byteBuf11);
        bufferedChannel2.write(byteBuf11);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) 0, (int) (short) 100);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (byte) -1, (-1));
        io.netty.buffer.ByteBuf byteBuf4 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (short) -1);
        bufferedChannel2.write(byteBuf4);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(byteBuf4);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(100, (int) (short) 0);
        bufferedChannel2.flush();
        bufferedChannel2.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel7 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel7.flush();
        bufferedChannel7.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf14 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel12.write(byteBuf14);
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel12.write(byteBuf17);
        bufferedChannel7.write(byteBuf17);
        bufferedChannel2.write(byteBuf17);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel23 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel23.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel27 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel30 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf32 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel30.write(byteBuf32);
        bufferedChannel27.write(byteBuf32);
        bufferedChannel23.write(byteBuf32);
        bufferedChannel2.write(byteBuf32);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel7);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(byteBuf14);
        org.junit.Assert.assertNotNull(byteBuf17);
        org.junit.Assert.assertNotNull(bufferedChannel23);
        org.junit.Assert.assertNotNull(bufferedChannel27);
        org.junit.Assert.assertNotNull(bufferedChannel30);
        org.junit.Assert.assertNotNull(byteBuf32);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(100, (int) (short) 0);
        bufferedChannel2.close();
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, (int) (byte) -1);
        bufferedChannel2.flush();
        bufferedChannel2.close();
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (short) 10, true);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) 0, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter3 = null;
        java.util.List<java.lang.Long> longList4 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter3);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(longList4);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) (byte) -1, false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter3 = null;
        java.util.List<java.lang.Long> longList4 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter3);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter5 = null;
        java.util.List<java.lang.Long> longList6 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter5);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter7 = null;
        java.util.List<java.lang.Long> longList8 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter7);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(longList4);
        org.junit.Assert.assertNotNull(longList6);
        org.junit.Assert.assertNotNull(longList8);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        io.netty.buffer.ByteBuf byteBuf1 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (byte) 100);
        org.junit.Assert.assertNotNull(byteBuf1);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 0);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((-1), (int) (short) 100);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf7 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel5.write(byteBuf7);
        bufferedChannel2.write(byteBuf7);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel15 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf17 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel15.write(byteBuf17);
        bufferedChannel12.write(byteBuf17);
        bufferedChannel2.write(byteBuf17);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(byteBuf7);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(bufferedChannel15);
        org.junit.Assert.assertNotNull(byteBuf17);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', 0);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) (short) 10);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(0, (int) (byte) 100);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel5 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel5.flush();
        bufferedChannel5.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel10 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf12 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel10.write(byteBuf12);
        io.netty.buffer.ByteBuf byteBuf15 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel10.write(byteBuf15);
        bufferedChannel5.write(byteBuf15);
        bufferedChannel2.write(byteBuf15);
        bufferedChannel2.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel22 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel22.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel26 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel29 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf31 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel29.write(byteBuf31);
        bufferedChannel26.write(byteBuf31);
        bufferedChannel22.write(byteBuf31);
        bufferedChannel2.write(byteBuf31);
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel5);
        org.junit.Assert.assertNotNull(bufferedChannel10);
        org.junit.Assert.assertNotNull(byteBuf12);
        org.junit.Assert.assertNotNull(byteBuf15);
        org.junit.Assert.assertNotNull(bufferedChannel22);
        org.junit.Assert.assertNotNull(bufferedChannel26);
        org.junit.Assert.assertNotNull(bufferedChannel29);
        org.junit.Assert.assertNotNull(byteBuf31);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) '4', (int) (byte) 0);
        bufferedChannel2.close();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) ' ', (int) ' ');
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel12 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 10, 1);
        bufferedChannel12.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel16 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf18 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel16.write(byteBuf18);
        io.netty.buffer.ByteBuf byteBuf21 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData((int) (short) 10);
        bufferedChannel16.write(byteBuf21);
        bufferedChannel12.write(byteBuf21);
        bufferedChannel9.write(byteBuf21);
        bufferedChannel6.write(byteBuf21);
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel2.write(byteBuf21);
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(bufferedChannel12);
        org.junit.Assert.assertNotNull(bufferedChannel16);
        org.junit.Assert.assertNotNull(byteBuf18);
        org.junit.Assert.assertNotNull(byteBuf21);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 0, 0);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) -1, 0);
        bufferedChannel2.flush();
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel6 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) 'a', (int) (byte) 0);
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel9 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel(1, 1);
        io.netty.buffer.ByteBuf byteBuf11 = org.apache.bookkeeper.bookie.RandoopSetup.createRandomData(100);
        bufferedChannel9.write(byteBuf11);
        bufferedChannel6.write(byteBuf11);
        bufferedChannel2.write(byteBuf11);
        bufferedChannel2.flush();
        bufferedChannel2.close();
        // The following exception was thrown during execution in test generation
        try {
            bufferedChannel2.flush();
            org.junit.Assert.fail("Expected exception of type io.netty.util.IllegalReferenceCountException; message: refCnt: 0");
        } catch (io.netty.util.IllegalReferenceCountException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(bufferedChannel2);
        org.junit.Assert.assertNotNull(bufferedChannel6);
        org.junit.Assert.assertNotNull(bufferedChannel9);
        org.junit.Assert.assertNotNull(byteBuf11);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        org.apache.bookkeeper.bookie.BufferedChannel bufferedChannel2 = org.apache.bookkeeper.bookie.RandoopSetup.createCustomBufferedChannel((int) (short) 10, 0);
        org.junit.Assert.assertNotNull(bufferedChannel2);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        java.io.File file2 = org.apache.bookkeeper.bookie.RandoopSetup.createJournalDirWithConfig((int) '4', false);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter3 = null;
        java.util.List<java.lang.Long> longList4 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter3);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter5 = null;
        java.util.List<java.lang.Long> longList6 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter5);
        org.apache.bookkeeper.bookie.Journal.JournalIdFilter journalIdFilter7 = null;
        java.util.List<java.lang.Long> longList8 = org.apache.bookkeeper.bookie.Journal.listJournalIds(file2, journalIdFilter7);
        org.junit.Assert.assertNotNull(file2);
        org.junit.Assert.assertEquals(file2.getParent(), "target/randoop-io");
        org.junit.Assert.assertEquals(file2.toString(), "target/randoop-io/randoop-journal");
        org.junit.Assert.assertNotNull(longList4);
        org.junit.Assert.assertNotNull(longList6);
        org.junit.Assert.assertNotNull(longList8);
    }
}

