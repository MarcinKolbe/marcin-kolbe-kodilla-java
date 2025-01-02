package com.kodilla.goodpatterns.productOrderService;

public class ProductOrderServiceRunner {
    public static void main(String[] args) {

        OrderDataRetriever orderDataRetriever = new OrderDataRetriever();
        Order order = orderDataRetriever.retrieve();
        ProductOrderService productOrderService = new ProductOrderService(new InformationService(), new OrderConfirmationService());
        productOrderService.process(order);
    }
}
