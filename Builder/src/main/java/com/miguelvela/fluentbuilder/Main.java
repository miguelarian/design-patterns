package com.miguelvela.fluentbuilder;

public class Main {
    public static void main(String[] args) {

        Pizza customPizza = new PizzaBuilder()
                        .withAmericanBase()
                        .withTomatoSauce()
                        .addTopping("york")
                        .addTopping("cheese")
                        .addTopping("mushroom")
                        .cookPizza();
        System.out.println("My custom pizza: " + customPizza);

        Pizza cheesyPizza = new PizzaBuilder()
                            .cookCheesyPizza();
        System.out.println("A cheesy pizza: " + cheesyPizza);

        Pizza pepperoniPizza = new PizzaBuilder()
                            .cookPepperoniPizza();
        System.out.println("A pepperoni pizza: " + pepperoniPizza);
    }
}