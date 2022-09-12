package com.kodilla.patterns2.adapter.bookClassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianAdapterTestSuite {
    @Test
    void publicationYearMedianTest() {
        // Given
        MedianAdapter medianAdapter = new MedianAdapter();
        Set<Book> testBookSet = new HashSet<>();
        Book book1 = new Book("H.Sienkiewicz", "Potop", 1886, "Syg1");
        Book book2 = new Book("A.Mickiewicz", "Pan Tadeusz", 1834, "Syg2");
        Book book3 = new Book("Z.Herbert", "Pan Cogito", 1974, "Syg3");
        testBookSet.add(book1);
        testBookSet.add(book2);
        testBookSet.add(book3);
        // When
        int median = medianAdapter.publicationYearMedian(testBookSet);
        // Then
        assertEquals(1886, median);
    }
}
