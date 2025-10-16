package org.apache.bookkeeper.bookie;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.Mockito;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyLong;

/**
 * Comprehensive JUnit 5 tests for the static method {@link Journal#listJournalIds(File, Journal.JournalIdFilter)}.
 */
class LLMJournalTest {

    @TempDir
    Path tempDir;

    /**
     * Helper method to create a .txn file with a given hexadecimal name.
     * For example, a name "a" will create a file "a.txn".
     */
    private void createTxnFile(File dir, String hexName) throws IOException {
        File file = new File(dir, hexName + ".txn");
        if (!file.createNewFile()) {
            throw new IOException("Failed to create test file: " + file.getAbsolutePath());
        }
    }

    /**
     * Helper method to create a file with an arbitrary name.
     */
    private void createOtherFile(File dir, String name) throws IOException {
        File file = new File(dir, name);
        if (!file.createNewFile()) {
            throw new IOException("Failed to create test file: " + file.getAbsolutePath());
        }
    }

    @Test
    @DisplayName("Test with a directory that does not exist")
    void listJournalIds_whenDirectoryDoesNotExist_shouldReturnEmptyList() {
        File nonExistentDir = new File(tempDir.toFile(), "nonexistent");
        List<Long> journalIds = Journal.listJournalIds(nonExistentDir, null);
        assertTrue(journalIds.isEmpty(), "Should return an empty list for a non-existent directory");
    }

    @Test
    @DisplayName("Test with a path that is a file, not a directory")
    void listJournalIds_whenPathIsAFile_shouldReturnEmptyList() throws IOException {
        File fileAsDir = tempDir.resolve("a_file.txt").toFile();
        assertTrue(fileAsDir.createNewFile(), "Test file should be created");

        List<Long> journalIds = Journal.listJournalIds(fileAsDir, null);
        assertTrue(journalIds.isEmpty(), "Should return an empty list when the path is a file");
    }

    @Test
    @DisplayName("Test with an empty journal directory")
    void listJournalIds_whenDirectoryIsEmpty_shouldReturnEmptyList() {
        File journalDir = tempDir.toFile();
        List<Long> journalIds = Journal.listJournalIds(journalDir, null);
        assertTrue(journalIds.isEmpty(), "Should return an empty list for an empty directory");
    }

    @Test
    @DisplayName("Test with a null journal directory should throw NullPointerException")
    void listJournalIds_whenDirectoryIsNull_shouldThrowNullPointerException() {
        assertThrows(NullPointerException.class, () -> Journal.listJournalIds(null, null),
                "Should throw NullPointerException when journalDir is null");
    }

    @Test
    @DisplayName("Test with a directory containing no .txn files")
    void listJournalIds_whenDirectoryHasNoTxnFiles_shouldReturnEmptyList() throws IOException {
        File journalDir = tempDir.toFile();
        createOtherFile(journalDir, "1.log");
        createOtherFile(journalDir, "some_file.txt");
        createOtherFile(journalDir, "journal.tx"); // Suffix is not .txn

        List<Long> journalIds = Journal.listJournalIds(journalDir, null);
        assertTrue(journalIds.isEmpty(), "Should return an empty list if no .txn files are present");
    }

    @Test
    @DisplayName("Test with valid .txn files and no filter, ensuring sorted output")
    void listJournalIds_withValidTxnFilesAndNoFilter_shouldReturnSortedIds() throws IOException {
        File journalDir = tempDir.toFile();
        // Create files in a non-sorted order to test sorting
        createTxnFile(journalDir, "10"); // 16
        createTxnFile(journalDir, "1");  // 1
        createTxnFile(journalDir, "a");  // 10

        List<Long> journalIds = Journal.listJournalIds(journalDir, null);
        List<Long> expectedIds = Arrays.asList(1L, 10L, 16L);

        assertIterableEquals(expectedIds, journalIds, "Should return a numerically sorted list of all journal IDs");
    }

    @Test
    @DisplayName("Test with a mix of .txn and other files")
    void listJournalIds_withMixedFiles_shouldReturnOnlyTxnIdsSorted() throws IOException {
        File journalDir = tempDir.toFile();
        createTxnFile(journalDir, "ff"); // 255
        createOtherFile(journalDir, "ff.log");
        createTxnFile(journalDir, "1a"); // 26
        createOtherFile(journalDir, "config.conf");

        List<Long> journalIds = Journal.listJournalIds(journalDir, null);
        List<Long> expectedIds = Arrays.asList(26L, 255L);

        assertIterableEquals(expectedIds, journalIds, "Should ignore non-.txn files and return sorted IDs");
    }

    @Test
    @DisplayName("Test with a .txn filename containing multiple dots")
    void listJournalIds_withFileNameHavingMultipleDots_shouldParseCorrectly() throws IOException {
        File journalDir = tempDir.toFile();
        // The SUT splits on "." and takes the first part. `1a.2b.txn` becomes `1a`.
        createOtherFile(journalDir, "1a.2b.txn");

        List<Long> journalIds = Journal.listJournalIds(journalDir, null);
        // "1a" in hex is 26
        List<Long> expectedIds = Collections.singletonList(26L);

        assertIterableEquals(expectedIds, journalIds, "Should parse the ID from the string before the first dot");
    }

    @DisplayName("Test with invalid hex journal filenames")
    @ParameterizedTest(name = "Filename: {0}.txn")
    @ValueSource(strings = {
            "g",          // Contains non-hex character
            "not-a-hex",  // Contains non-hex characters
            "-",          // Contains only a sign
            ""            // Empty string before .txn
    })
    void listJournalIds_withInvalidHexInFileName_shouldThrowNumberFormatException(String invalidHexName) throws IOException {
        File journalDir = tempDir.toFile();
        // create a file with name like "g.txn", "-.txn", etc.
        createOtherFile(journalDir, invalidHexName + ".txn");

        assertThrows(NumberFormatException.class, () -> Journal.listJournalIds(journalDir, null),
                "Should throw NumberFormatException for invalid hex name: " + invalidHexName);
    }

    @Test
    @DisplayName("Test with a negative hex ID, ensuring it is parsed and sorted correctly")
    void listJournalIds_withNegativeHexId_shouldParseAndSortCorrectly() throws IOException {
        File journalDir = tempDir.toFile();
        // Long.parseLong("-a", 16) results in -10L. The parser handles negative numbers.
        createTxnFile(journalDir, "-a"); // -10
        createTxnFile(journalDir, "5");  // 5

        List<Long> journalIds = Journal.listJournalIds(journalDir, null);
        List<Long> expectedIds = Arrays.asList(-10L, 5L);

        assertIterableEquals(expectedIds, journalIds, "Should correctly parse and sort negative journal IDs");
    }

    @Test
    @DisplayName("Test with a filter that accepts all journals")
    void listJournalIds_withFilterAcceptingAll_shouldReturnAllIdsSorted() throws IOException {
        File journalDir = tempDir.toFile();
        createTxnFile(journalDir, "5");
        createTxnFile(journalDir, "f");

        Journal.JournalIdFilter acceptAllFilter = id -> true;
        List<Long> journalIds = Journal.listJournalIds(journalDir, acceptAllFilter);
        List<Long> expectedIds = Arrays.asList(5L, 15L);

        assertIterableEquals(expectedIds, journalIds, "Should return all journal IDs when filter accepts all");
    }

    @Test
    @DisplayName("Test with a filter that rejects all journals")
    void listJournalIds_withFilterRejectingAll_shouldReturnEmptyList() throws IOException {
        File journalDir = tempDir.toFile();
        createTxnFile(journalDir, "5");
        createTxnFile(journalDir, "f");

        Journal.JournalIdFilter rejectAllFilter = id -> false;
        List<Long> journalIds = Journal.listJournalIds(journalDir, rejectAllFilter);

        assertTrue(journalIds.isEmpty(), "Should return an empty list when filter rejects all");
    }

    @Test
    @DisplayName("Test with a filter that accepts a subset of journals")
    void listJournalIds_withFilterAcceptingSubset_shouldReturnSubsetSorted() throws IOException {
        File journalDir = tempDir.toFile();
        createTxnFile(journalDir, "1"); // odd
        createTxnFile(journalDir, "a"); // even (10)
        createTxnFile(journalDir, "b"); // odd (11)
        createTxnFile(journalDir, "10"); // even (16)

        // Using a Mockito mock for the filter to demonstrate dependency mocking
        Journal.JournalIdFilter evenIdFilter = Mockito.mock(Journal.JournalIdFilter.class);
        Mockito.when(evenIdFilter.accept(anyLong())).thenAnswer(invocation -> {
            long id = invocation.getArgument(0);
            return id % 2 == 0;
        });

        List<Long> journalIds = Journal.listJournalIds(journalDir, evenIdFilter);
        List<Long> expectedIds = Arrays.asList(10L, 16L);

        assertIterableEquals(expectedIds, journalIds, "Should return only the journal IDs accepted by the filter");

        // Verify that the filter was called for every .txn file
        Mockito.verify(evenIdFilter).accept(1L);
        Mockito.verify(evenIdFilter).accept(10L);
        Mockito.verify(evenIdFilter).accept(11L);
        Mockito.verify(evenIdFilter).accept(16L);
        Mockito.verifyNoMoreInteractions(evenIdFilter);
    }

    @Test
    @DisplayName("Test with a filter that throws an exception")
    void listJournalIds_whenFilterThrowsException_shouldPropagateException() throws IOException {
        File journalDir = tempDir.toFile();
        createTxnFile(journalDir, "1");

        Journal.JournalIdFilter throwingFilter = id -> {
            throw new IllegalStateException("Filter error!");
        };

        assertThrows(IllegalStateException.class, () -> Journal.listJournalIds(journalDir, throwingFilter),
                "Should propagate the exception thrown by the filter");
    }
}