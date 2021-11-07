package com.company.chain_of_responsibility;

public class SmsMessage extends Message{
    @Override
    public void proccessMessage(String message) {
        System.out.println("Обработка смс сообщения: " + message);
    }
}
