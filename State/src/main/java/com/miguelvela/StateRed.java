package com.miguelvela;

public class StateRed implements State {
    @Override
    public void nextstate(TrafficLight trafficLight) {
        trafficLight.setState(new StateYellow());
    }

    @Override
    public void printState() {
        System.out.println("RED");
    }
}
