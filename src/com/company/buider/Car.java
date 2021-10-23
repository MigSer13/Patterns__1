package com.company.buider;

public class Car {
    private String title;
    private Model model;
    private int power;
    private String color;
    //...


    public void setTitle(String title) {
        this.title = title;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "title='" + title + '\'' +
                ", model=" + model +
                ", power=" + power +
                ", color='" + color + '\'' +
                '}';
    }
}
