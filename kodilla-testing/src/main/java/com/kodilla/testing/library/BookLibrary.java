package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    private LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBooksWithConditions(String titleFragment){
        List<Book> bookList = new ArrayList<Book>();
        if(titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBookWithConditions(titleFragment);
        if(resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){
        List<Book> bookList = new ArrayList<Book>();
        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        if(resultList.size() > 0 || resultList != null){
            bookList = resultList;
        }
        return bookList;
    }
}
