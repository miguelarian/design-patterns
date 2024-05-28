package com.miguelvela;

public class Animal implements Photographable {
    public String smile() {
        return "Animal is smiling";
    }

    @Override
    public void accept(Photographer photographer) {
        photographer.takePhoto(this);
    }
}
