package com.studyproject.patterns.creational.factorymethod.factories;

import com.studyproject.patterns.creational.factorymethod.model.Client;
import com.studyproject.patterns.creational.factorymethod.model.HttpClient;

public class HttpConnectionFactory extends ConnectionFactory {

    @Override
    public Client connectionInstance() {
        return new HttpClient();
    }
}
