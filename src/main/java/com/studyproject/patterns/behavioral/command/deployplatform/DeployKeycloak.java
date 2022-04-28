package com.studyproject.patterns.behavioral.command.deployplatform;

public class DeployKeycloak implements DeployCommand {

    @Override
    public void execute() {
        System.out.println("Keycloak has been deployed");
    }

    @Override
    public void revert() {
        System.out.println("Keycloak has been stopped");
    }
}
