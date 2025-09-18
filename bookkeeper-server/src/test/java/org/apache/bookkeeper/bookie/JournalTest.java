package org.apache.bookkeeper.bookie;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class JournalTest {

    @TempDir
    static File tempDir;

    private static File nonExistingDir;
    private static File emptyDir;
    private static File dirWithTxt;
    private static File dirWithOneLog;
    private static Journal.JournalIdFilter dummyFilter;
    private static Journal.JournalIdFilter rollingFilter;


    @BeforeAll
    static void setupClass() throws Exception {
        dummyFilter = journalId -> journalId > 20;
        rollingFilter = createPrivateRollingFilterInstance();

        nonExistingDir = new File(tempDir, "non_existing");
        emptyDir = new File(tempDir, "empty");
        emptyDir.mkdir();

        dirWithTxt = new File(tempDir, "with_txt");
        dirWithTxt.mkdir();
        new File(dirWithTxt, "not_a_log.txt").createNewFile();

        dirWithOneLog = new File(tempDir, "with_one_log");
        dirWithOneLog.mkdir();
        new File(dirWithOneLog, "a.txn").createNewFile(); // ID = 10
    }

    private static Stream<Arguments> listJournalIdsArguments() {
        return Stream.of(
                // Filter non-relevant in these combinations because no log will be found, set to null for simplicity
                Arguments.of("Null journalDir", null, null, null, true),
                Arguments.of("Non-existing directory", nonExistingDir, null, Collections.emptyList(), false),
                Arguments.of("Empty directory", emptyDir, null, Collections.emptyList(), false),
                Arguments.of("Directory with non-log files", dirWithTxt, null, new ArrayList<>(), false),

                // Filter relevant, use of null, dummyFilter and rollingFilter
                Arguments.of("Directory with one log, null filter", dirWithOneLog, null, Arrays.asList(10L), false),
                Arguments.of("Directory with one log, not accepting filter", dirWithOneLog, dummyFilter, new ArrayList<>(), false),
                Arguments.of("Directory with one log, accepting filter", dirWithOneLog, rollingFilter, Arrays.asList(10L), false)
        );
    }


    private static Journal.JournalIdFilter createPrivateRollingFilterInstance() throws Exception {
        Class<?> innerClass = Class.forName("org.apache.bookkeeper.bookie.Journal$JournalRollingFilter");
        Class<?> lastMarkClass = Class.forName("org.apache.bookkeeper.bookie.Journal$LastLogMark");

        // Find the constructor that takes a LastLogMark argument
        Constructor<?> constructor = innerClass.getDeclaredConstructor(lastMarkClass);
        constructor.setAccessible(true);

        Journal.LastLogMark mockLastMark = (Journal.LastLogMark) Mockito.mock(lastMarkClass);
        LogMark mockLogMark = Mockito.mock(LogMark.class);

        // "Program" the mocks' behavior using Mockito's when-thenReturn pattern to prevent NullPointerException
        Mockito.when(mockLastMark.getCurMark()).thenReturn(mockLogMark);
        Mockito.when(mockLogMark.getLogFileId()).thenReturn(11L);

        // Instantiate the filter by passing the fully configured mock object.
        return (Journal.JournalIdFilter) constructor.newInstance(mockLastMark);
    }

    @ParameterizedTest(name = "{index}: {0}")
    @MethodSource("listJournalIdsArguments")
    void testListJournalIds(String testName, File journalDir, Journal.JournalIdFilter filter, List<Long> expectedIds, boolean expectException) {
        if (expectException) {
            assertThrows(NullPointerException.class, () -> Journal.listJournalIds(journalDir, filter));
        } else {
            List<Long> actualIds = Journal.listJournalIds(journalDir, filter);
            assertEquals(expectedIds, actualIds);
        }
    }

    // Test added after first PIT report (mutant "Collections.sort(logs)" survived)
    @Test
    void testListJournalIds_TwoLogs(@TempDir File tempDir) throws IOException {
        File dirWithTwoLogs = new File(tempDir, "with_two_logs");
        dirWithTwoLogs.mkdir();

        File logHexF = new File(dirWithTwoLogs, "f.txn"); // ID = 15
        File logHexA = new File(dirWithTwoLogs, "a.txn"); // ID = 10

        logHexF.createNewFile();
        logHexA.createNewFile();

        // Use a Mockito spy to intercept the call to `listFiles()`.
        // This allows us to control the order in which the files are "discovered" ensuring the test is deterministic and doesn't depend on the filesystem's behavior.
        File spyDir = Mockito.spy(dirWithTwoLogs);

        // We instruct the spy to return the files in a non-numerical order (15, then 10)
        Mockito.doReturn(new File[]{logHexF, logHexA}).when(spyDir).listFiles();

        // null filter to accept all journals
        List<Long> actualIds = Journal.listJournalIds(spyDir, null);

        // We expect the returned list to be numerically sorted ([10, 15]), regardless of the order they were read in.
        // This assertion will fail if the `Collections.sort(logs)` line is mutated (removed)
        List<Long> expectedSortedIds = Arrays.asList(10L, 15L);
        assertEquals(expectedSortedIds, actualIds, "The journal IDs must be returned in sorted order.");
    }

}