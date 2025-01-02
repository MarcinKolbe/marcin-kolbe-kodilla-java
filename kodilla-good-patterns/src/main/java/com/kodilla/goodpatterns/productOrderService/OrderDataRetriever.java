package com.kodilla.goodpatterns.productOrderService;

public class OrderDataRetriever {

    public Order retrieve() {
        User buyer = new User("John", "Jonny28");
        User seller = new User("Michael", "Michael115");
        Product product = new Product("Snowboard", 499.99 );

        return new Order(buyer, seller, product);
    }
}
