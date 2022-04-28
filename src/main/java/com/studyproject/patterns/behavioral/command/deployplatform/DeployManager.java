package com.studyproject.patterns.behavioral.command.deployplatform;

import java.util.*;

import static java.util.Optional.ofNullable;

public class DeployManager {

    Deque<DeployCommand> history = new ArrayDeque<>();

    public void execute(DeployCommand command) {
        command.execute();
        history.push(command);
    }

    public void undo() {
        DeployCommand peeked = history.peek();
        ofNullable(peeked).ifPresent(n -> {
                    n.revert();
                    history.pop();
                }
        );
    }
}
