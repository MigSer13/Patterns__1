package com.company.singleton;

public class CurrentCountry {
    private static CurrentCountry instance;

    public static CurrentCountry getInstance(){
        if (instance == null){
            instance = new CurrentCountry();
        }
        return instance;
    }

    public String getTitle(){
        return "Россия";
    }

    private CurrentCountry() {
    }
}
