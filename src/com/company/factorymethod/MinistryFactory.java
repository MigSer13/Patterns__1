package com.company.factorymethod;

public class MinistryFactory {

    public Ministry getMinistry(TitleMinistry title){
        Ministry ministry = null;
        switch (title){
            case SPORT:
                ministry = new MinistryOfSport();
                break;
            case FINANCE:
                ministry = new MinistryOfFinance();
                break;
        }

        return ministry;
    }
}
