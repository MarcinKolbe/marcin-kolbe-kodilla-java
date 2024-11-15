package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int userID;
    private String userName;
    private char sex;
    private LocalDate birthday;
    private int postCount;

    public ForumUser(int userID, String userName, char sex, LocalDate birthday, int postCount) {
        this.userID = userID;
        this.userName = userName;
        this.sex = sex;
        this.birthday = birthday;
        this.postCount = postCount;
    }

    public int getUserID() {
        return userID;
    }

    public String getUserName() {
        return userName;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public int getPostCount() {
        return postCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userID=" + userID +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", postCount=" + postCount +
                '}';
    }
}
