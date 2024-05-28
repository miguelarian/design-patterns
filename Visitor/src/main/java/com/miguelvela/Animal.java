package com.miguelvela;

public class Animal implements Photographable {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }

    public String smile() {
        return "Animal is smiling";
    }

    @Override
    public void accept(Photographer photographer) {
        photographer.takePhoto(this);
    }
}
