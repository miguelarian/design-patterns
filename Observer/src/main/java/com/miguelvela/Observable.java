package com.miguelvela;

public interface Observable {
    void publish(String message);
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
}
