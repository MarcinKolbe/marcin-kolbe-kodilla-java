package com.kodilla.goodpatterns.productOrderService;

public class OrderDto {
    private Order order;
    private boolean isConfirmed;

    public OrderDto(Order order, boolean isConfirmed) {
        this.order = order;
        this.isConfirmed = isConfirmed;
    }

    public Order getOrder() {
        return order;
    }

    public boolean isConfirmed() {
        return isConfirmed;
    }
}
