package com.miguelvela;

public class Main {
    public static void main(String[] args) {

        Duck duck1 = new Duck(new WildDuckQuack());
        Duck duck2 = new Duck(new WildDuckQuack());
        Duck duck3 = new Duck(new WildDuckQuack());
        Duck[] ducksArmy = new Duck[] {duck1, duck2, duck3};

        System.out.println("Ducks Army: We are wild ducks!!");
        for(Duck duck : ducksArmy) {
            duck.quack();
        }

        System.out.println("Ducks Army: We are downgraded to rubber ducks!!");
        for(Duck duck : ducksArmy) {
            duck.mutateQuack(new RubberDuckQuack());
            duck.quack();
        }
    }
}