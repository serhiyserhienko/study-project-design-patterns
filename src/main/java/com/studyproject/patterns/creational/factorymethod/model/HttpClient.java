package com.studyproject.patterns.creational.factorymethod.model;

public class HttpClient implements Client {

    @Override
    public String send(String message) {
        System.out.println("Send message by HTTP connection");
        return "Code 200 / Success";
    }
}
