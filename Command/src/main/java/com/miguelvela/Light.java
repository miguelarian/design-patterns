package com.miguelvela;

public class Light {
    private int intensity;
    private final int MAX_INTENSITY = 100;
    private final int MIN_INTENSITY = 0;
    private final int DIM_STEP = 10;

    public Light() {
        this.intensity = MIN_INTENSITY;
    }

    public void turnOn() {
        this.intensity = 100;
        printIntensity();
    }

    public void turnOff() {
        this.intensity = 0;
        printIntensity();
    }

    public void dimUp() {
        this.intensity = Math.min(MAX_INTENSITY, this.intensity + DIM_STEP);
        printIntensity();
    }

    public void dimDown() {
        this.intensity = Math.max(MIN_INTENSITY, this.intensity - DIM_STEP);
        printIntensity();
    }

    private void printIntensity() {
        System.out.println("The light intensity is: " + this.intensity);
    }
}
