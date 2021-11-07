package com.company.chain_of_responsibility;

public class MailMessage extends Message{
    @Override
    public void proccessMessage(String message) {
        System.out.println("Обработка почтового сообщения: " + message);
    }
}
