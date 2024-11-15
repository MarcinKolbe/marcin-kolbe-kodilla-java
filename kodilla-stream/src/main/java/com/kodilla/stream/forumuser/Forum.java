package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private List<ForumUser> userList = new ArrayList<>();

    public Forum() {
        userList.add(new ForumUser(01,"username1", 'M', LocalDate.of(1988,1,22), 15));
        userList.add(new ForumUser(02,"username2", 'F', LocalDate.of(2015,9,17), 3));
        userList.add(new ForumUser(03,"username3", 'M', LocalDate.of(2008,2,3), 18));
        userList.add(new ForumUser(04,"username4", 'F', LocalDate.of(2000,8,31), 0));
        userList.add(new ForumUser(05,"username5", 'M', LocalDate.of(1992,3,11), 0));
        userList.add(new ForumUser(06,"username6", 'F', LocalDate.of(1996,7,25), 0));
        userList.add(new ForumUser(07,"username7", 'M', LocalDate.of(2004,4,1), 150));
    }

    public List<ForumUser> getUserList() {
        return userList;
    }
}
