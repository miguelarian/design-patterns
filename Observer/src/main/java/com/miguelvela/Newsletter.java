package com.miguelvela;

import java.util.ArrayList;
import java.util.List;

public class Newsletter implements Observable {

    private final List<Observer> subscribers;

    public Newsletter() {
        this.subscribers = new ArrayList<>();
    }

    public Newsletter(List<Observer> subscribers) {
        this.subscribers = subscribers;
    }

    @Override
    public void publish(String message) {
        this.subscribers.forEach(observer -> observer.update(message));
    }

    @Override
    public void subscribe(Observer observer) {
        this.subscribers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.subscribers.remove(observer);
    }
}
