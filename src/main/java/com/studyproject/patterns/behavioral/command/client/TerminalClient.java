package com.studyproject.patterns.behavioral.command.client;

import com.studyproject.patterns.behavioral.command.deployplatform.*;

import java.util.Map;
import java.util.Scanner;

import static java.util.Optional.ofNullable;

public class TerminalClient {

    DeployManager deployManager = new DeployManager();
    Map<String, DeployCommand> operations = Map.of(
            "deploy-ec2", new DeployEC2(),
            "deploy-kafka", new DeployKafka(),
            "deploy-keycloak", new DeployKeycloak()
    );

    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String operation = scanner.nextLine();
            if (operation.equals("exit")) {
                break;
            } else if (operation.equals("revert")) {
                deployManager.undo();
            } else {

                //Main command pattern logic is here: client asks manager service to execute a command
                ofNullable(operations.get(operation)).ifPresentOrElse(
                        command -> deployManager.execute(command),
                        () -> System.out.println("unknown operation '" + operation + "'")
                );
            }
        }
    }
}
