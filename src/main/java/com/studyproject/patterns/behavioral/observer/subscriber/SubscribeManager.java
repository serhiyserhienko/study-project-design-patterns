package com.studyproject.patterns.behavioral.observer.subscriber;

public interface SubscribeManager {

    void subscribe(Event event, EventListener... actions);

    void unsubscribe(Event event, EventListener... actions);

    void notify(Event event);
}
