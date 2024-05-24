package com.miguelvela;

public class Main {
    public static void main(String[] args) {

        Animal germanShepherd = new Dog(new GermanShepherdBehaviour());
        System.out.println(germanShepherd.sayHi());
        germanShepherd.performSound();

        Animal siberianHusky = new Dog(new SiberianHuskyBehaviour());
        System.out.println(siberianHusky.sayHi());
        siberianHusky.performSound();

        Animal siamesCat = new Cat(new SiamesCatBehaviour());
        System.out.println(siamesCat.sayHi());
        siamesCat.performSound();

        Animal persianCat = new Cat(new PersianCatBehaviour());
        System.out.println(persianCat.sayHi());
        persianCat.performSound();
    }
}