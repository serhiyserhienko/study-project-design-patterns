package com.studyproject.patterns.behavioral.observer.listener;

import com.studyproject.patterns.behavioral.observer.subscriber.Event;
import com.studyproject.patterns.behavioral.observer.subscriber.EventListener;

import static com.studyproject.patterns.behavioral.observer.subscriber.Event.CLOSE;
import static com.studyproject.patterns.behavioral.observer.subscriber.Event.OPEN;

public class MainEngineListener implements EventListener {

    @Override
    public void notify(Event event) {
        if (OPEN.equals(event)) {
            System.out.println("Start main application");
        } else if (CLOSE.equals(event)) {
            System.out.println("Stop main application");
        }
    }
}
