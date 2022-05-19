package com.kodilla.testing.forum.statistics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ForumStatisticsTestSuite {

    @Mock
    private Statistics statisticsMock;


    @Test
    void testCalculateAdvStatistics0Posts(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(0);

        //When
         forumStatistics.calculateAdvStatistics(statisticsMock);
         int totalPosts = forumStatistics.getTotalPostsQuantity();
         double commentsPerPosts = forumStatistics.getCommentsPerPost();
         double postsPerUser = forumStatistics.getPostsPerUser();


        //Then
        assertEquals(0, totalPosts);
        assertEquals(0, commentsPerPosts);
        assertEquals(0, postsPerUser);
    }
    @Test
    void testCalculateAdvStatistics1000Posts(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.postsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int totalPosts = forumStatistics.getTotalPostsQuantity();
        double commentsPerPosts = forumStatistics.getCommentsPerPost();
        double postsPerUser = forumStatistics.getPostsPerUser();


        //Then
        assertEquals(1000, totalPosts);
        assertEquals(0, commentsPerPosts);
        assertEquals(0, postsPerUser);
    }
    @Test
    void testCalculateAdvStatistics0Comments(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(0);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int totalComments = forumStatistics.getTotalCommentsQuantity();
        double commentsPerPosts = forumStatistics.getCommentsPerPost();
        double commentsPerUser = forumStatistics.getCommentsPerUser();


        //Then
        assertEquals(0, totalComments);
        assertEquals(0, commentsPerPosts);
        assertEquals(0, commentsPerUser);
    }

    @Test
    void testCalculateAdvStatistics1000Comments(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(1000);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int totalComments = forumStatistics.getTotalCommentsQuantity();
        double commentsPerPosts = forumStatistics.getCommentsPerPost();
        double commentsPerUser = forumStatistics.getCommentsPerUser();


        //Then
        assertEquals(1000, totalComments);
        assertEquals(0, commentsPerPosts);
        assertEquals(0, commentsPerUser);
    }

    @Test
    void testCalculateAdvStatisticsMoreCommentsThenPosts(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(100);
        when(statisticsMock.postsCount()).thenReturn(50);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int totalComments = forumStatistics.getTotalCommentsQuantity();
        int totalPosts = forumStatistics.getTotalPostsQuantity();
        double commentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        assertEquals(2,commentsPerPost);
        assertEquals(100, totalComments);
        assertEquals(50,totalPosts);
    }

    @Test
    void testCalculateAdvStatisticsMorePostsThenComments(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        when(statisticsMock.commentsCount()).thenReturn(50);
        when(statisticsMock.postsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int totalComments = forumStatistics.getTotalCommentsQuantity();
        int totalPosts = forumStatistics.getTotalPostsQuantity();
        double commentsPerPost = forumStatistics.getCommentsPerPost();

        //Then
        assertEquals(0.5,commentsPerPost);
        assertEquals(50, totalComments);
        assertEquals(100, totalPosts);
    }

    @Test
    void testCalculateAdvStatistics0Users(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> resultList = new ArrayList<>();
        when(statisticsMock.usersNames()).thenReturn(resultList);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int totalUsers = forumStatistics.getTotalUsersQuantity();
        double commentsPerUser = forumStatistics.getCommentsPerUser();
        double postsPerUser = forumStatistics.getPostsPerUser();


        //Then
        assertEquals(0, totalUsers);
        assertEquals(0, commentsPerUser);
        assertEquals(0, postsPerUser);
    }

    @Test
    void testCalculateAdvStatistics100Users(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> resultList = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            String newUser = "user number: " + i;
            resultList.add(newUser);}

        when(statisticsMock.usersNames()).thenReturn(resultList);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int totalUsers = forumStatistics.getTotalUsersQuantity();
        double commentsPerUser = forumStatistics.getCommentsPerUser();
        double postsPerUser = forumStatistics.getPostsPerUser();


        //Then
        assertEquals(100, totalUsers);
        assertEquals(0, commentsPerUser);
        assertEquals(0, postsPerUser);
    }

    @Test
    void testCalculateAdvStatisticsMorePostsThenUsers(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> resultList = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            String newUser = "user number: " + i;
            resultList.add(newUser);}

        when(statisticsMock.usersNames()).thenReturn(resultList);
        when(statisticsMock.postsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int totalUsers = forumStatistics.getTotalUsersQuantity();
        int totalPosts = forumStatistics.getTotalPostsQuantity();
        double postsPerUser = forumStatistics.getPostsPerUser();

        //Then
        assertEquals(2,postsPerUser);
        assertEquals(50, totalUsers);
        assertEquals(100, totalPosts);
    }

    @Test
    void testCalculateAdvStatisticsMoreUsersThenPosts(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> resultList = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            String newUser = "user number: " + i;
            resultList.add(newUser);}

        when(statisticsMock.usersNames()).thenReturn(resultList);
        when(statisticsMock.postsCount()).thenReturn(50);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int totalUsers = forumStatistics.getTotalUsersQuantity();
        int totalPosts = forumStatistics.getTotalPostsQuantity();
        double postsPerUser = forumStatistics.getPostsPerUser();

        //Then
        assertEquals(0.5,postsPerUser);
        assertEquals(100, totalUsers);
        assertEquals(50, totalPosts);
    }

    @Test
    void testCalculateAdvStatisticsMoreUsersThenComments(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> resultList = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            String newUser = "user number: " + i;
            resultList.add(newUser);}

        when(statisticsMock.usersNames()).thenReturn(resultList);
        when(statisticsMock.commentsCount()).thenReturn(50);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int totalUsers = forumStatistics.getTotalUsersQuantity();
        int totalComments = forumStatistics.getTotalCommentsQuantity();
        double commentsPerUser = forumStatistics.getCommentsPerUser();

        //Then
        assertEquals(0.5,commentsPerUser);
        assertEquals(100, totalUsers);
        assertEquals(50, totalComments);
    }

    @Test
    void testCalculateAdvStatisticsMoreCommentsThenUsers(){
        //Given
        ForumStatistics forumStatistics = new ForumStatistics();
        List<String> resultList = new ArrayList<>();
        for(int i = 0; i < 50; i++){
            String newUser = "user number: " + i;
            resultList.add(newUser);}

        when(statisticsMock.usersNames()).thenReturn(resultList);
        when(statisticsMock.commentsCount()).thenReturn(100);

        //When
        forumStatistics.calculateAdvStatistics(statisticsMock);
        int totalUsers = forumStatistics.getTotalUsersQuantity();
        int totalComments = forumStatistics.getTotalCommentsQuantity();
        double commentsPerUser = forumStatistics.getCommentsPerUser();

        //Then
        assertEquals(2,commentsPerUser);
        assertEquals(50, totalUsers);
        assertEquals(100, totalComments);
    }
}
