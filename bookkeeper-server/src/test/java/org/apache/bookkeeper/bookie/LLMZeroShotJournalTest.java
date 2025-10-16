package org.apache.bookkeeper.bookie;
import org.apache.bookkeeper.bookie.Journal;
import org.apache.bookkeeper.bookie.Journal.JournalIdFilter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Comprehensive JUnit 5 test suite for the {@link Journal#listJournalIds(File, JournalIdFilter)} method.
 */
class LLMZeroShotJournalTest {

    // Using @TempDir to create a temporary directory for each test, ensuring test isolation.
    @TempDir
    Path tempDirPath;

    /**
     * Helper method to create a dummy file within the temporary directory.
     *
     * @param fileName The name of the file to create.
     * @throws IOException if an I/O error occurs.
     */
    private void createDummyFile(String fileName) throws IOException {
        File file = new File(tempDirPath.toFile(), fileName);
        assertTrue(file.createNewFile(), "Failed to create dummy file: " + fileName);
    }

    @Test
    @DisplayName("Test with a non-existent directory should return an empty list")
    void testListJournalIdsWithNonExistentDirectory() {
        File nonExistentDir = new File(tempDirPath.toFile(), "nonexistent");
        List<Long> journalIds = Journal.listJournalIds(nonExistentDir, null);
        assertEquals(Collections.emptyList(), journalIds, "Should return an empty list for a non-existent directory");
    }

    @Test
    @DisplayName("Test with a file path instead of a directory path should return an empty list")
    void testListJournalIdsWithFileAsDirectory() throws IOException {
        createDummyFile("a.txn");
        File file = new File(tempDirPath.toFile(), "a.txn");
        List<Long> journalIds = Journal.listJournalIds(file, null);
        assertEquals(Collections.emptyList(), journalIds, "Should return an empty list when a file is passed instead of a directory");
    }

    @Test
    @DisplayName("Test with an empty directory should return an empty list")
    void testListJournalIdsWithEmptyDirectory() {
        List<Long> journalIds = Journal.listJournalIds(tempDirPath.toFile(), null);
        assertEquals(Collections.emptyList(), journalIds, "Should return an empty list for an empty directory");
    }

    @Test
    @DisplayName("Test with a directory containing no .txn files should return an empty list")
    void testListJournalIdsWithNoTxnFiles() throws IOException {
        createDummyFile("1.log");
        createDummyFile("anotherfile");
        File subDir = new File(tempDirPath.toFile(), "subdir");
        assertTrue(subDir.mkdir());
        List<Long> journalIds = Journal.listJournalIds(tempDirPath.toFile(), null);
        assertEquals(Collections.emptyList(), journalIds, "Should return an empty list when no .txn files are present");
    }

    @Test
    @DisplayName("Test with valid .txn files and a null filter should return a sorted list of all IDs")
    void testListJournalIdsWithValidFilesAndNullFilter() throws IOException {
        createDummyFile("a.txn");   // 10
        createDummyFile("1f.txn");  // 31
        createDummyFile("100.txn"); // 256
        createDummyFile("ignored.log"); // should be ignored

        List<Long> journalIds = Journal.listJournalIds(tempDirPath.toFile(), null);

        assertNotNull(journalIds);
        List<Long> expectedIds = Arrays.asList(10L, 31L, 256L);
        assertEquals(expectedIds, journalIds, "Should return a sorted list of all journal IDs");
    }

    @Test
    @DisplayName("Test to confirm the returned list is always sorted")
    void testListJournalIdsReturnsSortedList() throws IOException {
        // Create files in a non-sequential hex order to test sorting
        createDummyFile("1f.txn");  // 31
        createDummyFile("a.txn");   // 10
        createDummyFile("100.txn"); // 256

        List<Long> journalIds = Journal.listJournalIds(tempDirPath.toFile(), null);
        List<Long> expectedIds = Arrays.asList(10L, 31L, 256L);
        assertEquals(expectedIds, journalIds, "The list of journal IDs must be sorted in ascending order");
    }

    @Test
    @DisplayName("Test with a filter that accepts all journal IDs")
    void testListJournalIdsWithFilterAcceptingAll() throws IOException {
        createDummyFile("a.txn");   // 10
        createDummyFile("1f.txn");  // 31
        createDummyFile("100.txn"); // 256

        JournalIdFilter filter = (journalId) -> true;
        List<Long> journalIds = Journal.listJournalIds(tempDirPath.toFile(), filter);

        List<Long> expectedIds = Arrays.asList(10L, 31L, 256L);
        assertEquals(expectedIds, journalIds, "Should return all IDs when filter accepts all");
    }

    @Test
    @DisplayName("Test with a filter that accepts no journal IDs")
    void testListJournalIdsWithFilterAcceptingNone() throws IOException {
        createDummyFile("a.txn");
        createDummyFile("1f.txn");

        JournalIdFilter filter = (journalId) -> false;
        List<Long> journalIds = Journal.listJournalIds(tempDirPath.toFile(), filter);

        assertEquals(Collections.emptyList(), journalIds, "Should return an empty list when filter rejects all IDs");
    }

    @Test
    @DisplayName("Test with a filter that accepts a subset of journal IDs")
    void testListJournalIdsWithFilterAcceptingSubset() throws IOException {
        createDummyFile("a.txn");   // 10
        createDummyFile("1f.txn");  // 31
        createDummyFile("100.txn"); // 256
        createDummyFile("200.txn"); // 512

        // Filter that accepts IDs greater than 100
        JournalIdFilter filter = (journalId) -> journalId > 100;
        List<Long> journalIds = Journal.listJournalIds(tempDirPath.toFile(), filter);

        List<Long> expectedIds = Arrays.asList(256L, 512L);
        assertEquals(expectedIds, journalIds, "Should return only the subset of IDs accepted by the filter");
    }

    @Test
    @DisplayName("Test with a malformed hexadecimal filename should throw NumberFormatException")
    void testListJournalIdsWithMalformedHexFilename() throws IOException {
        createDummyFile("g.txn"); // 'g' is not a valid hex character

        assertThrows(NumberFormatException.class, () -> {
            Journal.listJournalIds(tempDirPath.toFile(), null);
        }, "Should throw NumberFormatException for invalid hex filename");
    }

    @Test
    @DisplayName("Test with complex filenames containing multiple dots")
    void testListJournalIdsWithComplexFilename() throws IOException {
        createDummyFile("1a.something.txn");

        List<Long> journalIds = Journal.listJournalIds(tempDirPath.toFile(), null);

        List<Long> expectedIds = Arrays.asList(26L); // 1a in hex is 26 in decimal
        assertEquals(expectedIds, journalIds, "Should correctly parse filenames with multiple dots");
    }
}