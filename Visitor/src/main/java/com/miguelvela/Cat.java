package com.miguelvela;

public class Cat extends Animal {
    @Override
    public String smile() {
        return "Cat is smiling";
    }

    @Override
    public void accept(Photographer photographer) {
        photographer.takePhoto(this);
    }
}
