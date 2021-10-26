package com.company.facade;

public class OrderFacade {
    private Market market;
    private DeliveryService deliveryService;
    private Order order;

    public OrderFacade(Market market) {
        this.market = market;
        this.deliveryService = deliveryService;
        this.order = order;
    }

    public Order getOrder(){
        order.create();
        market.placeOrder(order);
        deliveryService.deliverOrder();

        return order;
    }
}
