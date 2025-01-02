package com.kodilla.goodpatterns.productOrderService;

public class InformationService {

    public void inform(User user, User user2) {
        System.out.println("Confirmation send to: " + user.getName() + " and " + user2.getName());
    }
}
