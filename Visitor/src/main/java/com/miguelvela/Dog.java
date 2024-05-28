package com.miguelvela;

public class Dog extends Animal {
    @Override
    public String smile() {
        return "Dog is smiling";
    }

    @Override
    public void accept(Photographer photographer) {
        photographer.takePhoto(this);
    }
}
