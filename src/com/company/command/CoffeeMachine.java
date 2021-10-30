package com.company.command;

public class CoffeeMachine implements Command{
    @Override
    public void run() {
        System.out.println("Приготовить кофе");
    }
}
