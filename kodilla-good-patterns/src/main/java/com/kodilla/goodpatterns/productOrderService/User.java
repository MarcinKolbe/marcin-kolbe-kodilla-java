package com.kodilla.goodpatterns.productOrderService;

public class User {
    private final String name;
    private final String username;

    public User(final String name, final String username) {
        this.name = name;
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

}
