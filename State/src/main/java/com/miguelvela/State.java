package com.miguelvela;

public interface State {
    void nextstate(TrafficLight trafficLight);
    void printState();
}
