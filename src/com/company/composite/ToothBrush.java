package com.company.composite;

public class ToothBrush implements Shell{

    @Override
    public void pack() {
        System.out.println("Упаковываем зубную щетку");
    }
}
