package org.apache.bookkeeper.bookie;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * JUnit 5 test suite for the static method {@link Journal#listJournalIds(File, Journal.JournalIdFilter)}.
 *
 * This class uses a combination of standard tests for edge cases and a parameterized test
 * to cover various partitions of file existence and filter application.
 *
 * The tests are designed to be robust and clean, using {@link TempDir} for file system
 * operations to ensure no side effects.
 */
class LLMJournalTest {

    // JUnit 5 will create and clean up this temporary directory for us.
    @TempDir
    Path tempDir;

    //================================================================================
    // Edge Case and Boundary Tests for the 'journalDir' parameter
    //================================================================================

    @Test
    @DisplayName("Test with a null directory should throw NullPointerException")
    void listJournalIds_whenDirectoryIsNull_shouldThrowNPE() {
        assertThrows(NullPointerException.class,
                () -> Journal.listJournalIds(null, null),
                "Calling with a null directory should result in a NullPointerException."
        );
    }

    @Test
    @DisplayName("Test with a non-existent directory should return an empty list")
    void listJournalIds_whenDirectoryDoesNotExist_shouldReturnEmptyList() {
        File nonExistentDir = new File(tempDir.toFile(), "non-existent-subdir");
        List<Long> journalIds = Journal.listJournalIds(nonExistentDir, null);
        assertTrue(journalIds.isEmpty(), "A non-existent directory should yield an empty list of IDs.");
    }

    @Test
    @DisplayName("Test with an empty directory should return an empty list")
    void listJournalIds_whenDirectoryIsEmpty_shouldReturnEmptyList() {
        List<Long> journalIds = Journal.listJournalIds(tempDir.toFile(), null);
        assertTrue(journalIds.isEmpty(), "An empty directory should yield an empty list of IDs.");
    }

    @Test
    @DisplayName("Test with a directory containing no journal (.txn) files")
    void listJournalIds_whenDirectoryHasNoJournalFiles_shouldReturnEmptyList() throws IOException {
        createFile("lastMark");
        createFile("some-other-file.log");
        createFile("1234.txt");

        List<Long> journalIds = Journal.listJournalIds(tempDir.toFile(), null);
        assertTrue(journalIds.isEmpty(), "A directory with no '.txn' files should yield an empty list.");
    }

    //================================================================================
    // Parameterized Tests for File and Filter Combinations
    //================================================================================

    @ParameterizedTest(name = "[{index}] {0}")
    @MethodSource("journalFileAndFilterScenarios")
    @DisplayName("Test various file and filter combinations")
    void listJournalIds_withFileAndFilterScenarios(
            String testCaseName,
            List<String> filesToCreate,
            Journal.JournalIdFilter filter,
            List<Long> expectedIds
    ) throws IOException {

        // Setup: Create the specified files in the temporary directory
        for (String fileName : filesToCreate) {
            createFile(fileName);
        }

        // Action: Call the method under test
        List<Long> actualIds = Journal.listJournalIds(tempDir.toFile(), filter);

        // Assertion: Verify the result is as expected
        assertEquals(expectedIds, actualIds, "The list of journal IDs should match the expected output.");
    }

    /**
     * Provides a stream of arguments for the parameterized test.
     * Each argument set represents a distinct test scenario.
     *
     * @return A Stream of Arguments for the test.
     */
    private static Stream<Arguments> journalFileAndFilterScenarios() {
        // This is our custom "dummyFilter" as requested in the analysis.
        // It accepts only journal IDs that are even numbers.
        Journal.JournalIdFilter evenIdFilter = new DummyEvenIdFilter();

        // This filter simulates the behavior of JournalRollingFilter by accepting IDs less than a boundary.
        // We use this as a stand-in since JournalRollingFilter is a private inner class.
        Journal.JournalIdFilter idsLessThan16Filter = new AcceptsIdsLessThan(16L);

        return Stream.of(
                // --- SCENARIO 1: Basic case with journal files and no filter ---
                Arguments.of(
                        "Directory with journal files, no filter",
                        Arrays.asList("a.txn", "1.txn", "10.txn", "some-other-file.log"),
                        null, // No filter
                        Arrays.asList(1L, 10L, 16L) // Expect all valid hex IDs, sorted
                ),
                // --- SCENARIO 2: Boundary - single .txn file, no filter ---
                Arguments.of(
                        "Directory with a single journal file, no filter",
                        Arrays.asList("f.txn"),
                        null, // No filter
                        Arrays.asList(15L) // Expect the single ID
                ),
                // --- SCENARIO 3: Filter that accepts a subset of files ---
                Arguments.of(
                        "Directory with journal files, using an 'even ID' filter",
                        Arrays.asList("1.txn", "a.txn", "10.txn", "11.txn"), // IDs: 1, 10, 16, 17
                        evenIdFilter,
                        Arrays.asList(10L, 16L) // Expect only even IDs (a=10, 10=16), sorted
                ),
                // --- SCENARIO 4: Filter that accepts no files ---
                Arguments.of(
                        "Directory with journal files, using a filter that matches nothing",
                        Arrays.asList("1.txn", "3.txn", "d.txn"), // IDs: 1, 3, 13 (all odd)
                        evenIdFilter,
                        Collections.emptyList() // Expect an empty list
                ),
                // --- SCENARIO 5: Filter that simulates a boundary condition ---
                Arguments.of(
                        "Directory with journal files, using a filter for IDs less than 16",
                        Arrays.asList("1.txn", "a.txn", "10.txn", "11.txn"), // IDs: 1, 10, 16, 17
                        idsLessThan16Filter,
                        Arrays.asList(1L, 10L) // Expect IDs < 16 (1 and 10), sorted
                )
        );
    }

    //================================================================================
    // Helper Methods and Custom Filter Implementations
    //================================================================================

    /**
     * A helper method to create an empty file within the temporary directory.
     *
     * @param fileName The name of the file to create.
     * @throws IOException if file creation fails.
     */
    private void createFile(String fileName) throws IOException {
        File newFile = new File(tempDir.toFile(), fileName);
        if (!newFile.createNewFile()) {
            throw new IOException("Failed to create temporary file: " + newFile.getAbsolutePath());
        }
    }

    /**
     * A custom implementation of {@link Journal.JournalIdFilter} for testing purposes.
     * This filter accepts only journal IDs that are even.
     */
    private static class DummyEvenIdFilter implements Journal.JournalIdFilter {
        @Override
        public boolean accept(long journalId) {
            return journalId % 2 == 0;
        }
    }

    /**
     * A custom implementation of {@link Journal.JournalIdFilter} that simulates boundary logic.
     * This filter accepts journal IDs strictly less than a given maximum value.
     */
    private static class AcceptsIdsLessThan implements Journal.JournalIdFilter {
        private final long maxIdToAccept;

        public AcceptsIdsLessThan(long maxIdToAccept) {
            this.maxIdToAccept = maxIdToAccept;
        }

        @Override
        public boolean accept(long journalId) {
            return journalId < maxIdToAccept;
        }
    }
}