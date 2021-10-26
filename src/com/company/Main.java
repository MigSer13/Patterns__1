package com.company;

import com.company.abstractfactory.*;
import com.company.adapter.Wrench;
import com.company.adapter.Wrench17;
import com.company.adapter.Wrench17Adapter19;
import com.company.bridge.BrickHouse;
import com.company.bridge.House;
import com.company.bridge.ProfiledSheetFence;
import com.company.bridge.WoodenFence;
import com.company.buider.Car;
import com.company.buider.CarBuilderImpl;
import com.company.buider.Model;
import com.company.composite.*;
import com.company.facade.DeliveryService;
import com.company.facade.Market;
import com.company.facade.Order;
import com.company.facade.OrderFacade;
import com.company.factorymethod.Ministry;
import com.company.factorymethod.MinistryFactory;
import com.company.factorymethod.TitleMinistry;
import com.company.proxy.CarProxy;
import com.company.singleton.CurrentCountry;

public class Main {

    public static void main(String[] args) {
        //Singleton
//        System.out.println(CurrentCountry.getInstance().getTitle());
//        System.out.println(CurrentCountry.getInstance().getTitle());
//        System.out.println(CurrentCountry.getInstance().getTitle());
//
//        //factorymethod
//        MinistryFactory ministryFactory = new MinistryFactory();
//
//        Ministry ministryOfFinance = ministryFactory.getMinistry(TitleMinistry.FINANCE);
//        ministryOfFinance.publication();
//
//        //factory
//        PlayerFactory somyPlayerFactory = new SonyPlayerFactory();
//        MediaPlayer somyMediaPlayer = somyPlayerFactory.createMediaPlayer();
//        somyMediaPlayer.play();
//        VideoPlayer sonyVideoPlayer = somyPlayerFactory.createVideoPlayer();
//        sonyVideoPlayer.playVideo();
//
//        PlayerFactory applePlayerFactory = new ApplePlayerFactory();
//        MediaPlayer appleMediaPlayer =  applePlayerFactory.createMediaPlayer();
//        appleMediaPlayer.play();
//        VideoPlayer appleVideoPlayer =  applePlayerFactory.createVideoPlayer();
//        appleVideoPlayer.playVideo();
//
//        //Buider
//        Car car1 = new CarBuilderImpl().setModel(Model.BMW).setTitle("X6").setColor("black").build();
//        car1.toString();
//
//        Car car2 = new CarBuilderImpl().setModel(Model.NISSAN).setTitle("Patrole").build();
//        car2.toString();
//
//        //на проверку
//
//        //Adapter
//        Wrench17 wrench17 = new Wrench17();
//        Wrench17Adapter19 wrench17Adapter19 = new Wrench17Adapter19(wrench17);
//        wrench17Adapter19.turn();
//
//        //Facade
//        OrderFacade orderFacade = new OrderFacade(
//                new Market(
//                        new DeliveryService(
//                                new Order(87))));
//        orderFacade.getOrder();
//
//        //Proxu
//        CarProxy carNissan = new CarProxy(new com.company.proxy.Car(Model.NISSAN, "Patrol"));
//        carNissan.start();

        //Bridge
        House house = new BrickHouse(new ProfiledSheetFence());
        house.showDetails();

        //Composite (Компоновщик)
        Shell tie1 = new Tie();
        Shell tie2 = new Tie();

        Shell suit1 = new Suit();
        Shell suit2 = new Suit();

        Shell toothBrush = new ToothBrush();

        Suitcase suitcase1 = new Suitcase();
        suitcase1.addComponent(tie1);
        suitcase1.addComponent(suit1);

        Suitcase suitcase2 = new Suitcase();
        suitcase2.addComponent(tie2);
        suitcase2.addComponent(suit2);
        suitcase2.addComponent(toothBrush);

        Suitcase suitcaseSum = new Suitcase();
        suitcaseSum.addComponent(suitcase1);
        suitcaseSum.addComponent(suitcase2);





    }
}
