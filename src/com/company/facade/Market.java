package com.company.facade;

public class Market {
    DeliveryService deliveryService;

    public Market(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }

    public void placeOrder(Order order){

    }
}
