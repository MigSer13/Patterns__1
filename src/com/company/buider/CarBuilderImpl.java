package com.company.buider;

public class CarBuilderImpl implements CarBuilder{
    Car car = new Car();

    @Override
    public CarBuilder setTitle(String title) {
        car.setTitle(title);
        return this;
    }

    @Override
    public CarBuilder setModel(Model model) {
        car.setModel(model);
        return this;
    }

    @Override
    public CarBuilder setPower(int power) {
        car.setPower(power);
        return this;
    }

    @Override
    public CarBuilder setColor(String color) {
        car.setColor(color);
        return this;
    }

    @Override
    public Car build() {
        return car;
    }
}
