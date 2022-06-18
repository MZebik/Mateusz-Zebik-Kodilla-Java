package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        //Given
        Library library = new Library("Library 1");
        Book book1 = new Book("Secrets of Alamo", "John Smith", LocalDate.of(2008, 01, 01));
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", LocalDate.of(2012, 02, 02));
        Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", LocalDate.of(2016, 03, 03));
        Book book4 = new Book("Secrets of Java", "Ian Tenewitch", LocalDate.of(2010, 04, 04));
        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);
        library.getBooks().add(book4);

        Library clonedLibrary = null;
        try {
            clonedLibrary = library.shallowCopy();
            clonedLibrary.setName("Project number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);

        //Then
        System.out.println(library);
        System.out.println(clonedLibrary);
        System.out.println(deepClonedLibrary);
        assertEquals(3, library.getBooks().size());
        assertEquals(3, clonedLibrary.getBooks().size());
        assertEquals(4, deepClonedLibrary.getBooks().size());
        assertEquals(library.getBooks(), clonedLibrary.getBooks());
        assertNotEquals(library.getBooks(), deepClonedLibrary.getBooks());
    }
}
