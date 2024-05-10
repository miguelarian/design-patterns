package com.miguelvela;

public class StateGreen implements State {
    @Override
    public void nextstate(TrafficLight trafficLight) {
        trafficLight.setState(new StateYellow());
    }

    @Override
    public void printState() {
        System.out.println("GREEN");
    }
}
