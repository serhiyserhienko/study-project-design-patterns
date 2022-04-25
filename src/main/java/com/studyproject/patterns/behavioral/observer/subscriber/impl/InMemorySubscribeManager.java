package com.studyproject.patterns.behavioral.observer.subscriber.impl;

import com.studyproject.patterns.behavioral.observer.subscriber.Event;
import com.studyproject.patterns.behavioral.observer.subscriber.EventListener;
import com.studyproject.patterns.behavioral.observer.subscriber.SubscribeManager;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import static java.util.Optional.ofNullable;

public class InMemorySubscribeManager implements SubscribeManager {

    private final Map<Event, List<EventListener>> subscriptions = new ConcurrentHashMap<>();

    @Override
    public void subscribe(Event event, EventListener... actions) {
        ofNullable(subscriptions.get(event))
                .ifPresentOrElse(
                        n -> n.addAll(List.of(actions)),
                        () -> subscriptions.put(event, List.of(actions))
                );
    }

    @Override
    public void unsubscribe(Event event, EventListener... actions) {
        ofNullable(subscriptions.get(event))
                .ifPresent(n -> n.removeAll(List.of(actions)));
    }

    @Override
    public void notify(Event event) {
        ofNullable(subscriptions.get(event))
                .ifPresent(n -> n.forEach(m -> m.notify(event)));
    }
}
