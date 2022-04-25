package com.studyproject.patterns.behavioral.observer.service;

import com.studyproject.patterns.behavioral.observer.subscriber.Event;
import com.studyproject.patterns.behavioral.observer.subscriber.EventListener;
import com.studyproject.patterns.behavioral.observer.subscriber.SubscribeManager;
import com.studyproject.patterns.behavioral.observer.subscriber.impl.InMemorySubscribeManager;

public class StockExchange {

    private final SubscribeManager subscribeManager = new InMemorySubscribeManager();

    public void open() {
        System.out.println("Stock exchange is opened");
        subscribeManager.notify(Event.OPEN);
    }

    public void close() {
        System.out.println("Stock exchange is closed");
        subscribeManager.notify(Event.CLOSE);
    }

    public void update() {
        System.out.println("New update in stock exchange");
        subscribeManager.notify(Event.UPDATE);
    }

    public void subscribe(Event event, EventListener... eventListener) {
        subscribeManager.subscribe(event, eventListener);
    }

    public void unsubscribe(Event event, EventListener... eventListener) {
        subscribeManager.unsubscribe(event, eventListener);
    }
}
