package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;


public class StreamMain {

    public static void main(String[] args) {

        Forum forum = new Forum();
        LocalDate year = LocalDate.of(2004, 11, 15);
        Map<Integer, ForumUser> resultUserList = forum.getUserList().stream()
                .filter(ForumUser -> ForumUser.getSex() == 'M')
                .filter(ForumUser -> ForumUser.getBirthday().isBefore(year))
                .filter(ForumUser -> ForumUser.getPostCount() >= 1)
                .collect(Collectors.toMap(ForumUser::getUserID, ForumUser -> ForumUser));

                resultUserList.entrySet().stream()
                        .map(entry -> entry.getKey() + " : " + entry.getValue())
                        .forEach(System.out::println);
    }
}