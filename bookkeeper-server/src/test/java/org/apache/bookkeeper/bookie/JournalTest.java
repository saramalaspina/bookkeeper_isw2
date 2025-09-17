package org.apache.bookkeeper.bookie;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mockito;

import java.io.File;
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

}