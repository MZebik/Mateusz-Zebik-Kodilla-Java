package com.kodilla.testing.library;

import java.util.List;

public interface LibraryDatabase {

    List<Book> listBookWithConditions(String titleFragment);
    List<Book> listBooksInHandsOf(LibraryUser libraryUser);
    boolean rentABook(LibraryUser libraryUser,Book book);
    int returnBooks(LibraryUser libraryUser);
}
