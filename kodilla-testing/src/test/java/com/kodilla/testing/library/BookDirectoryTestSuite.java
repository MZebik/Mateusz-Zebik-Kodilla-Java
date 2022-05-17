package com.kodilla.testing.library;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock;

    private List<Book> generateListOfNBooks(int booksQuantity){
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++){
            Book theBook = new Book("Title"+n, "Author"+n, 1970+n);
            resultList.add(theBook);
        }
        return resultList;
    }
    @Nested
    @DisplayName("Tests of ListBookWithConditions method")
    class TestsOfListBookWithConditionsMethod {
        @Test
        void testListBookWithConditionsReturnList() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOfBooks = new ArrayList<>();
            Book book1 = new Book("Secrets of Alamo", "John Smith", 2008);
            Book book2 = new Book("SSecretaries and Directors", "Dilbert Michigan", 2012);
            Book book3 = new Book("Secret life of programmers", "Steve Wolkowitz", 2016);
            Book book4 = new Book("Secrets of Jva", "Ian Tenewitch", 2010);
            resultListOfBooks.add(book1);
            resultListOfBooks.add(book2);
            resultListOfBooks.add(book3);
            resultListOfBooks.add(book4);
            when(libraryDatabaseMock.listBookWithConditions("Secret")).thenReturn(resultListOfBooks);

            //When
            List<Book> theListOfBooks = bookLibrary.listBooksWithConditions("Secret");

            //Then
            assertEquals(4, theListOfBooks.size());
        }

        @Test
        void testListBookWithConditionsMoreThan20() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            List<Book> resultListOf0Books = new ArrayList<Book>();
            List<Book> resultListOf15Books = generateListOfNBooks(15);
            List<Book> resultListOf40Books = generateListOfNBooks(40);
            when(libraryDatabaseMock.listBookWithConditions(anyString())).thenReturn(resultListOf15Books);
            when(libraryDatabaseMock.listBookWithConditions("ZeroBooks")).thenReturn(resultListOf0Books);
            when(libraryDatabaseMock.listBookWithConditions("FortyBooks")).thenReturn(resultListOf40Books);

            //When
            List<Book> theListOfBooks0 = bookLibrary.listBooksWithConditions("ZeroBooks");
            List<Book> theListOFBooks15 = bookLibrary.listBooksWithConditions("Any title");
            List<Book> theListOfBooks40 = bookLibrary.listBooksWithConditions("FortyBooks");

            //Then
            assertEquals(0, theListOfBooks0.size());
            assertEquals(15, theListOFBooks15.size());
            assertEquals(0, theListOfBooks40.size());
        }

        @Test
        void testListBookWithConditionsFragmentShorterThen3() {
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

            //When
            List<Book> theListOfBook10 = bookLibrary.listBooksWithConditions("An");

            //Then
            assertEquals(0, theListOfBook10.size());
            verify(libraryDatabaseMock, times(0)).listBookWithConditions(anyString());
        }
    }
    @Nested
    @DisplayName("Tests of ListBooksInHandsOf method")
    class TestsOfListBooksInHandsOfMethod{


        @Test
        void testListBookInHandsOf0Books(){
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("John", "Smith", "70031802202");
            List<Book> resultListOf0Books = new ArrayList<>();
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOf0Books);

            //When
            List<Book> booksInHands = bookLibrary.listBooksInHandsOf(libraryUser);

            //
            assertEquals(0, booksInHands.size());
        }

        @Test
        void testListBookInHandsOf1Book(){
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("John", "Smith", "70031802202");
            List<Book> resultListOf1Book = generateListOfNBooks(1);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOf1Book);

            //When
            List<Book> booksInHands = bookLibrary.listBooksInHandsOf(libraryUser);

            //
            assertEquals(1, booksInHands.size());
        }

        @Test
        void testListBookInHandsOf5Books(){
            //Given
            BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
            LibraryUser libraryUser = new LibraryUser("John", "Smith", "70031802202");
            List<Book> resultListOf5Books = generateListOfNBooks(5);
            when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(resultListOf5Books);

            //When
            List<Book> booksInHands = bookLibrary.listBooksInHandsOf(libraryUser);

            //
            assertEquals(5, booksInHands.size());
        }
    }
}
