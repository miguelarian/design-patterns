package com.miguelvela;

public class Dog extends Animal {

    public Dog(SoundBehaviour soundBehavior) {
        super(soundBehavior);
    }

    @Override
    public String sayHi() {
        return "I am a dog!";
    }

    @Override
    public void performSound() {
        super.performSound();
    }
}
