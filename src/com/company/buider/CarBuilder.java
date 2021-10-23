package com.company.buider;

public interface CarBuilder {
    CarBuilder setTitle(String title);
    CarBuilder setModel(Model model);
    CarBuilder setPower(int power);
    CarBuilder setColor(String color);
    Car build();
}
