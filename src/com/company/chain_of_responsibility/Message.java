package com.company.chain_of_responsibility;

public abstract class Message {
    Message nextMessage;

    public void setNextMessage(Message message){
        this.nextMessage = message;
    }
    public void send(String message){
        proccessMessage(message);
        if(nextMessage != null){
            nextMessage.send(message);
        }
    }
    public abstract void proccessMessage(String message);
}

