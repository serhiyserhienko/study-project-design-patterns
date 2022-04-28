package com.studyproject.patterns.behavioral.command;

import com.studyproject.patterns.behavioral.command.client.TerminalClient;

public class Main {

    public static void main(String[] args) {

        TerminalClient client = new TerminalClient();
        client.run();
    }
}
