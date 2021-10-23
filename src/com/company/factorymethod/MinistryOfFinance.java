package com.company.factorymethod;

public class MinistryOfFinance implements Ministry{
    @Override
    public void publication() {
        System.out.println("publication of the decree on finance");
    }
}
