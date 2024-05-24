package com.miguelvela;

public abstract class Animal {

    private final SoundBehaviour soundBehaviour;

    public Animal(SoundBehaviour soundBehavior) {
        this.soundBehaviour = soundBehavior;
    }

    public abstract String sayHi();

    public void performSound() {
        soundBehaviour.makeSound();
    }
}
