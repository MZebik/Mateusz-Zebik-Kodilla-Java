package com.kodilla.stream.forumUser;

import java.time.LocalDate;

public class ForumUser {

    private final int userID;
    private final String name;
    private final char sex;
    private final LocalDate born;
    private final int postsQuantity;

    public ForumUser(int userID, String name, char sex, LocalDate born, int postsQuantity) {
        this.userID = userID;
        this.name = name;
        this.sex = sex;
        this.born = born;
        this.postsQuantity = postsQuantity;
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBorn() {
        return born;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }
}
