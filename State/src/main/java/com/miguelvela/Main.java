package com.miguelvela;

public class Main {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight();

        int count = 0;
        while(count < 10) {
            try {
                trafficLight.printState();
                trafficLight.nextState();
                Thread.sleep(1000);
                count++;
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}