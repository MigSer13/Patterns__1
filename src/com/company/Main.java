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
import com.company.chain_of_responsibility.MailMessage;
import com.company.chain_of_responsibility.Message;
import com.company.chain_of_responsibility.SmsMessage;
import com.company.command.CoffeeMachine;
import com.company.command.Command;
import com.company.command.Lamp;
import com.company.command.SmartHome;
import com.company.composite.*;
import com.company.facade.DeliveryService;
import com.company.facade.Market;
import com.company.facade.Order;
import com.company.facade.OrderFacade;
import com.company.factorymethod.Ministry;
import com.company.factorymethod.MinistryFactory;
import com.company.factorymethod.TitleMinistry;
import com.company.iterator.Iterator;
import com.company.iterator.ListOfBook;
import com.company.proxy.CarProxy;
import com.company.singleton.CurrentCountry;
import com.company.strategy.SelectedStrategy;
import com.company.strategy.SummerShoes;
import com.company.strategy.WinterShoes;

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

//        //Bridge
//        House house = new BrickHouse(new ProfiledSheetFence());
//        house.showDetails();
//
//        //Composite (Компоновщик)
//        Shell tie1 = new Tie();
//        Shell tie2 = new Tie();
//
//        Shell suit1 = new Suit();
//        Shell suit2 = new Suit();
//
//        Shell toothBrush = new ToothBrush();
//
//        Suitcase suitcase1 = new Suitcase();
//        suitcase1.addComponent(tie1);
//        suitcase1.addComponent(suit1);
//
//        Suitcase suitcase2 = new Suitcase();
//        suitcase2.addComponent(tie2);
//        suitcase2.addComponent(suit2);
//        suitcase2.addComponent(toothBrush);
//
//        Suitcase suitcaseSum = new Suitcase();
//        suitcaseSum.addComponent(suitcase1);
//        suitcaseSum.addComponent(suitcase2);

        //Decorator

/////////////////////////////////////////////////////////////////////////////////
//        //chain of responsibility
//        Message smsMessage = new SmsMessage();
//        Message mailMessage = new MailMessage();
//        smsMessage.setNextMessage(mailMessage);
//        smsMessage.send("Всем привет");

        //Command
//        Command lamp = new Lamp();
//        Command coffeeMachine = new CoffeeMachine();
//        SmartHome smartHome = new SmartHome();
//        smartHome.addCommand(lamp);
//        smartHome.addCommand(coffeeMachine);
//        smartHome.execute();

        //Iterator
//        ListOfBook listOfBook = new ListOfBook(new String[]{"Война и мир", "Идиот", "Евгений Онегин"});
//        Iterator iterator = listOfBook.getIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

        //Strategy
        SelectedStrategy selectedStrategy = new SelectedStrategy(new WinterShoes());
        System.out.println(selectedStrategy.getList());

//////////////////////////////////////////////////////////////////////////////






    }
}
