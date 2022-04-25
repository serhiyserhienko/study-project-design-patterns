package com.studyproject.patterns.behavioral.observer.listener;

import com.studyproject.patterns.behavioral.observer.subscriber.Event;
import com.studyproject.patterns.behavioral.observer.subscriber.EventListener;

public class NotificationServiceListener implements EventListener {

    @Override
    public void notify(Event event) {
        System.out.println("Sending update to brokers");
    }
}
