package com.studyproject.patterns.behavioral.command.deployplatform;

 public interface DeployCommand {

    void execute();

    void revert();
}
