package com.kodilla.stream;


import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.forumUser.Forum;
import com.kodilla.stream.forumUser.ForumUser;
import com.kodilla.stream.person.People;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args){

        Forum forum = new Forum();

        Map<Integer, ForumUser> theResultMapOfUsers = forum.getUserList().stream()
                .filter(forumUser -> forumUser.getSex() == 'm')
                .filter(forumUser -> Period.between(forumUser.getBorn(), LocalDate.now()).getYears() > 20)
                .filter(forumUser -> forumUser.getPostsQuantity() > 1)
                .collect(Collectors.toMap(ForumUser::getUserID, forumUser -> forumUser));

        theResultMapOfUsers.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue().getName() + ", " + entry.getValue().getSex() + ", " + entry.getValue().getBorn() + ", " + entry.getValue().getPostsQuantity())
                .forEach(System.out::println);
    }
}
