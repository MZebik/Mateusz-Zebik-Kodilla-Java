package com.kodilla.stream.forumUser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {

    private final List<ForumUser> userList = new ArrayList<>();
    public Forum(){

        userList.add(new ForumUser(1, "John Smith", 'm', LocalDate.of(1989,4,12), 102));
        userList.add(new ForumUser(2, "Dorothy Newman", 'f', LocalDate.of(2002,6,6), 11));
        userList.add(new ForumUser(3, "John Wolkowitz", 'm', LocalDate.of(1994,8,1), 0));
        userList.add(new ForumUser(4, "Lucy Riley", 'f', LocalDate.of(2000,4,22), 15));
        userList.add(new ForumUser(5, "Owen Rogers", 'm', LocalDate.of(1990,5,7), 123));
        userList.add(new ForumUser(6, "Matilda Davies", 'f', LocalDate.of(1999,8,2), 153));
        userList.add(new ForumUser(7, "Declan Booth", 'm', LocalDate.of(1987,7,14), 23));
        userList.add(new ForumUser(8, "Corinne Foster", 'f', LocalDate.of(1995,7,13), 45));
        userList.add(new ForumUser(9, "Khloe Fry", 'f', LocalDate.of(2004,8,23), 78));
        userList.add(new ForumUser(10, "Martin Valenzuela", 'm', LocalDate.of(1991,9,30), 89));
    }
    public List<ForumUser> getUserList() { return new ArrayList<>(userList);}
}
