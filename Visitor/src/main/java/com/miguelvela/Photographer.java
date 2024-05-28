package com.miguelvela;

public class Photographer {
    public void takePhoto(Animal animal) {
        System.out.println("An animal photo: " + animal.smile());
    }

    public void takePhoto(Dog dog) {
        System.out.println("A dog photo: " + dog.smile());
    }

    public void takePhoto(Cat cat) {
        System.out.println("A cat photo: " + cat.smile());
    }
}
