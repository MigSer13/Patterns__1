package com.company.strategy;

import java.util.Arrays;

public class SummerShoes implements Strategy{
    String[] list = {"Туфли мужские", "Туфли женские", "Кеды", "Летние кроссовки"};
    @Override
    public String getListOfProducts() {
        return Arrays.toString(list);
    }

}
