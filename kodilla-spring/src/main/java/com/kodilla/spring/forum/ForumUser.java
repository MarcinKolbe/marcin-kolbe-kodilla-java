package com.kodilla.spring.forum;

import org.springframework.stereotype.Component;

@Component
public class ForumUser {
    final String name;

    public ForumUser() {
        this.name = "John Smith";
    }

    public String getName() {
        return name;
    }
}
