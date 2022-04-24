package com.studyproject.patterns.creational.factorymethod.factories;

import com.studyproject.patterns.creational.factorymethod.model.Client;

public abstract class ConnectionFactory {

    public abstract Client connectionInstance();
}
