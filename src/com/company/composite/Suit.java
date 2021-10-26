package com.company.composite;

public class Suit implements Shell{

    @Override
    public void pack() {
        System.out.println("Упаковываем костюм");
    }
}
