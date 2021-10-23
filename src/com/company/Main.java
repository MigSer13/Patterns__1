package com.company;

import com.company.abstractfactory.*;
import com.company.buider.Car;
import com.company.buider.CarBuilderImpl;
import com.company.buider.Model;
import com.company.factorymethod.Ministry;
import com.company.factorymethod.MinistryFactory;
import com.company.factorymethod.TitleMinistry;
import com.company.singleton.CurrentCountry;

public class Main {

    public static void main(String[] args) {
        //на проверку

        //Singleton
        System.out.println(CurrentCountry.getInstance().getTitle());
        System.out.println(CurrentCountry.getInstance().getTitle());
        System.out.println(CurrentCountry.getInstance().getTitle());

        //factorymethod
        MinistryFactory ministryFactory = new MinistryFactory();

        Ministry ministryOfFinance = ministryFactory.getMinistry(TitleMinistry.FINANCE);
        ministryOfFinance.publication();

        //factory
        PlayerFactory somyPlayerFactory = new SonyPlayerFactory();
        MediaPlayer somyMediaPlayer = somyPlayerFactory.createMediaPlayer();
        somyMediaPlayer.play();
        VideoPlayer sonyVideoPlayer = somyPlayerFactory.createVideoPlayer();
        sonyVideoPlayer.playVideo();

        PlayerFactory applePlayerFactory = new ApplePlayerFactory();
        MediaPlayer appleMediaPlayer =  applePlayerFactory.createMediaPlayer();
        appleMediaPlayer.play();
        VideoPlayer appleVideoPlayer =  applePlayerFactory.createVideoPlayer();
        appleVideoPlayer.playVideo();

        //Buider
        Car car1 = new CarBuilderImpl().setModel(Model.BMW).setTitle("X6").setColor("black").build();
        car1.toString();

        Car car2 = new CarBuilderImpl().setModel(Model.NISSAN).setTitle("Patrole").build();
        car2.toString();

    }
}
