package com.studyproject.patterns.behavioral.command.deployplatform;

public class DeployEC2 implements DeployCommand {

    @Override
    public void execute() {
        System.out.println("EC2 has been deployed");
    }

    @Override
    public void revert() {
        System.out.println("EC2 has been stopped");
    }
}
