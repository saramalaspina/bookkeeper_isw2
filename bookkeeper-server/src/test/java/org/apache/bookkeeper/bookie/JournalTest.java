package org.apache.bookkeeper.bookie;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.nio.file.Path;
import java.util.List;

/**
 * Initial unit tests for the static methods of the Journal class.
 */
class JournalTest {

    @TempDir
    Path tempDirectory;

    /**
     * Tests that an empty list is returned when the journal directory is empty.
     */
    @Test
    void listJournalIds_whenDirectoryIsEmpty_shouldReturnEmptyList() {
        File journalDir = tempDirectory.toFile();

        List<Long> journalIds = Journal.listJournalIds(journalDir, null);

        assertNotNull(journalIds, "The returned list should never be null.");
        assertTrue(journalIds.isEmpty(), "The list should be empty if the directory contains no files.");
    }
}