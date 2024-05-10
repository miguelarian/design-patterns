package com.miguelvela;

public class StateYellow implements State {
    @Override
    public void nextstate(TrafficLight trafficLight) {
        if(isPreviousStateRed(trafficLight)){
            trafficLight.setState(new StateGreen());
        } else {
            trafficLight.setState(new StateRed());
        }
    }

    @Override
    public void printState() {
        System.out.println("YELLOW");
    }

    private boolean isPreviousStateRed(TrafficLight trafficLight) {
        State previousState =  trafficLight.getPreviousState();
        return previousState instanceof StateRed;
    }
}
