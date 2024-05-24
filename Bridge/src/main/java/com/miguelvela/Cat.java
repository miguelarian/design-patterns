package com.miguelvela;

public class Cat extends Animal {

    public Cat(SoundBehaviour soundBehavior) {
        super(soundBehavior);
    }

    @Override
    public String sayHi() {
        return "I am a cat!";
    }

    @Override
    public void performSound() {
        super.performSound();
    }
}
