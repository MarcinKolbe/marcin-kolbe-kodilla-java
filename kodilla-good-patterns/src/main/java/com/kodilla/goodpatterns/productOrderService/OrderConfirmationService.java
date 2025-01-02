package com.kodilla.goodpatterns.productOrderService;

public class OrderConfirmationService {

    public boolean confirmOrder(Order order) {
        System.out.println("Order Confirmed: " + order);
        return true;
    }
}
