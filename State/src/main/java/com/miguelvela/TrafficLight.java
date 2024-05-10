package com.miguelvela;

public class TrafficLight {
    private State currentState;
    private State previousState;

    public TrafficLight() {
        this.currentState = new StateRed();
        this.previousState = new StateYellow();
    }

    public void setState(State newState) {
        this.previousState = this.currentState;
        this.currentState = newState;
    }

    public State getPreviousState() {
        return previousState;
    }

    public void printState() {
        this.currentState.printState();
    }

    public State getCurrentState() {
        return currentState;
    }

    public void next() {
        this.getCurrentState().nextstate(this);
    }
}
