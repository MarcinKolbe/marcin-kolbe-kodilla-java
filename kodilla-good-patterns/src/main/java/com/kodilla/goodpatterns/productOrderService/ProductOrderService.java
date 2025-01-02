package com.kodilla.goodpatterns.productOrderService;

public class ProductOrderService {
    private InformationService informationService;
    private OrderConfirmationService orderConfirmationService;

    public ProductOrderService(final InformationService informationService, final OrderConfirmationService orderConfirmationService) {
        this.informationService = informationService;
        this.orderConfirmationService = orderConfirmationService;
    }
    public OrderDto process(Order order) {
        boolean isRented = orderConfirmationService.confirmOrder(order);
        if (isRented) {
            informationService.inform(order.getBuyer(), order.getSeller());
            return new OrderDto(order, true);
        } else {
            return new OrderDto(order, false);
        }
    }
}
