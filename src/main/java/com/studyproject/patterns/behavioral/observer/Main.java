package com.studyproject.patterns.behavioral.observer;

import com.studyproject.patterns.behavioral.observer.listener.MainEngineListener;
import com.studyproject.patterns.behavioral.observer.listener.NotificationServiceListener;
import com.studyproject.patterns.behavioral.observer.service.StockExchange;

import static com.studyproject.patterns.behavioral.observer.subscriber.Event.*;

public class Main {
    public static void main(String[] args) {

        StockExchange stockExchange = new StockExchange();
        stockExchange.subscribe(OPEN, new MainEngineListener());
        stockExchange.subscribe(CLOSE, new MainEngineListener());
        stockExchange.subscribe(UPDATE, new NotificationServiceListener());

        stockExchange.open();
        stockExchange.update();
        stockExchange.close();
    }
}
