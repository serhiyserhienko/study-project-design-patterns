package com.studyproject.patterns.creational.factorymethod.model;

public class SocketClient implements Client {

    @Override
    public String send(String message) {
        System.out.println("Send message by Socket connection");
        return "message sent successfully";
    }
}
