package com.company.strategy;

import java.util.Arrays;

public class WinterShoes implements Strategy{
    String[] list = {"Ботинки", "Зимние сапоги", "Зимние кроссовки"};
    @Override
    public String getListOfProducts() {
        return Arrays.toString(list);
    }
}
