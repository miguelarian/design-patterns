package com.miguelvela;

public class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }

    @Override
    public String smile() {
        return "Dog is smiling";
    }

    @Override
    public void accept(Photographer photographer) {
        photographer.takePhoto(this);
    }
}
