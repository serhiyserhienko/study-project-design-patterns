package com.studyproject.patterns.creational.factorymethod;

import com.studyproject.patterns.creational.factorymethod.factories.ConnectionFactory;
import com.studyproject.patterns.creational.factorymethod.model.Client;
import com.studyproject.patterns.creational.factorymethod.factories.HttpConnectionFactory;
import com.studyproject.patterns.creational.factorymethod.factories.SocketConnectionFactory;

public class Main {
    public static void main(String[] args) {
        ConnectionFactory factory = new HttpConnectionFactory();

        Client httpConnection = factory.connectionInstance();
        String httpResponse = httpConnection.send("Hello");
        System.out.println(httpResponse);

        factory = new SocketConnectionFactory();

        Client socketConnection = factory.connectionInstance();
        String socketResponse = socketConnection.send("Hello");
        System.out.println(socketResponse);
    }
}
