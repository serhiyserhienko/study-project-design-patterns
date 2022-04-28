package com.studyproject.patterns.behavioral.command.deployplatform;

public class DeployKafka implements DeployCommand {

    @Override
    public void execute() {
        System.out.println("Kafka has been deployed");
    }

    @Override
    public void revert() {
        System.out.println("Kafka has been stopped");
    }
}
