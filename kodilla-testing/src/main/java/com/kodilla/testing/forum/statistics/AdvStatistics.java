package com.kodilla.testing.forum.statistics;

import java.util.List;

public class AdvStatistics {
    private int userCount = 0;
    private int postsCount = 0;
    private int commentsCount = 0;
    private double avgPostsPerUser = 0.0;
    private double avgCommentsPerUser = 0.0;
    private double avgCommentsPerPost = 0.0;

    public void calculateAdvStatistics(Statistics statistics) {
        List<String> users = statistics.usersNames();
        userCount = users.size();
        postsCount = statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if (userCount > 0) {
            avgPostsPerUser = (double) postsCount / userCount;
            avgCommentsPerUser = (double) commentsCount / userCount;
        }   else {
            avgPostsPerUser = 0.0;
            avgCommentsPerUser = 0.0;
        }
        if (postsCount > 0) {
            avgCommentsPerPost = (double) commentsCount / postsCount;
        }   else {
            avgCommentsPerPost = 0.0;
        }
    }
    public void showStatistics() {
        System.out.println("Users count: " + userCount);
        System.out.println("Posts count: " + postsCount);
        System.out.println("Comments count: " + commentsCount);
        System.out.println("Average posts per user: " + avgPostsPerUser);
        System.out.println("Average comments per user: " + avgCommentsPerUser);
        System.out.println("Average comments per post: " + avgCommentsPerPost);
    }
    public int getUserCount() {
        return userCount;
    }
    public int getPostsCount() {
        return postsCount;
    }
    public int getCommentsCount() {
        return commentsCount;
    }
    public double getAvgPostsPerUser() {
        return avgPostsPerUser;
    }
    public double getAvgCommentsPerUser() {
        return avgCommentsPerUser;
    }
    public double getAvgCommentsPerPost() {
        return avgCommentsPerPost;
    }
}