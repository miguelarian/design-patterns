package com.miguelvela;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat());
        Photographer photographer = new Photographer();

        System.out.println("Single dispatch: Photographer::takePhoto(Animal animal) method used");
        animals.forEach(photographer::takePhoto);

        System.out.println("Double dispatch: Photographer::takePhoto(Cat/Dog xxx) method used");
        animals.forEach(animal -> animal.accept(photographer));
    }
}