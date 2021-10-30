package com.company.strategy;

public class SelectedStrategy {
    Strategy strategy;

    public SelectedStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public String getList(){
        return strategy.getListOfProducts();
    }
}
