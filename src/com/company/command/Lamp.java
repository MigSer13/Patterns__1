package com.company.command;

public class Lamp implements Command{
    @Override
    public void run() {
        System.out.println("Включить свет");
    }
}
