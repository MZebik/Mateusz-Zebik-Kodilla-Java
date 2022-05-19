package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    int totalUsersQuantity;
    int totalPostsQuantity;
    int totalCommentsQuantity;
    double postsPerUser;
    double commentsPerUser;
    double commentsPerPost;


    public void calculateAdvStatistics(Statistics statistics){
        totalUsersQuantity = statistics.usersNames().size();
        totalPostsQuantity = statistics.postsCount();
        totalCommentsQuantity = statistics.commentsCount();
        if(totalUsersQuantity == 0){
            postsPerUser = 0;
            commentsPerUser = 0;
        }else {
            postsPerUser = (double) totalPostsQuantity /(double) totalUsersQuantity;
            commentsPerUser
                    = (double)totalCommentsQuantity / (double)totalUsersQuantity;
        }
        if(totalPostsQuantity == 0){
            commentsPerPost = 0;
        }else {
            commentsPerPost = (double)totalCommentsQuantity / (double)totalPostsQuantity;
        }

    }

    public void showStatistics(){
        System.out.println("Ilość użytkowników forum wynosi: " + totalUsersQuantity);
        System.out.println("Ilość postów na forum wynosi: " + totalPostsQuantity);
        System.out.println("Ilość komentarzy na forum wynosi: " + totalCommentsQuantity);
        System.out.println("Średnia ilość postów tworzonych przez użytkownika forum: " + postsPerUser);
        System.out.println("Średnia ilość komentarzy pisanych przez użytkownika forum: " + commentsPerUser);
        System.out.println("Średnia ilość komentarzy pod postem: " + commentsPerPost);
    }

    public int getTotalUsersQuantity() {
        return totalUsersQuantity;
    }

    public int getTotalPostsQuantity() {
        return totalPostsQuantity;
    }

    public int getTotalCommentsQuantity() {
        return totalCommentsQuantity;
    }

    public double getPostsPerUser() {
        return postsPerUser;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }
}
