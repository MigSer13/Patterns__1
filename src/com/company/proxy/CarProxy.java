package com.company.proxy;

public class CarProxy implements CarInt{
    Car car;

    public CarProxy(Car car) {
        this.car = car;
    }

    @Override
    public void start() {
        System.out.println("Проверка систем автомобиля");
        car.start();
    }
}
