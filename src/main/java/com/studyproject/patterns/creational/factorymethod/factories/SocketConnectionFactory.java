package com.studyproject.patterns.creational.factorymethod.factories;

import com.studyproject.patterns.creational.factorymethod.model.Client;
import com.studyproject.patterns.creational.factorymethod.model.SocketClient;

public class SocketConnectionFactory extends ConnectionFactory {

    @Override
    public Client connectionInstance() {
        return new SocketClient();
    }
}
