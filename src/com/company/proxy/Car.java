package com.company.proxy;

import com.company.buider.Model;

public class Car implements CarInt{
    private Model model;
    private String title;

    public Car(Model model, String title) {
        this.model = model;
        this.title = title;
    }

    @Override
    public void start() {
        System.out.println("Звпустить двигатель");
    }
}
