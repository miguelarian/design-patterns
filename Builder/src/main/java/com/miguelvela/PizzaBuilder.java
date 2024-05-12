package com.miguelvela;

import java.util.ArrayList;

public class PizzaBuilder {

    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza(PizzaBase.STANDARD, PizzaSauce.NONE, new ArrayList<>());
    }

    public Pizza cookCheesyPizza() {
        this.pizza = new Pizza(PizzaBase.THIN, PizzaSauce.TOMATO, new ArrayList<>());
        this.pizza.getToppings().add("cheese");
        this.pizza.getToppings().add("cheese");
        this.pizza.getToppings().add("cheese");
        return this.pizza;
    }

    public Pizza cookPepperoniPizza() {
        this.pizza = new Pizza(PizzaBase.STANDARD, PizzaSauce.TOMATO, new ArrayList<>());
        this.pizza.getToppings().add("cheese");
        this.pizza.getToppings().add("pepperoni");
        this.pizza.getToppings().add("chorizo");
        return this.pizza;
    }

    public PizzaBuilder withThinBase() {
        this.pizza.setBase(PizzaBase.THIN);
        return this;
    }

    public PizzaBuilder withAmericanBase() {
        this.pizza.setBase(PizzaBase.AMERICAN);
        return this;
    }

    public PizzaBuilder withNeapolitanBase() {
        this.pizza.setBase(PizzaBase.NEAPOLITAN);
        return this;
    }

    public PizzaBuilder withBbqSauce() {
        this.pizza.setSauce(PizzaSauce.BBQ);
        return this;
    }

    public PizzaBuilder withTomatoSauce() {
        this.pizza.setSauce(PizzaSauce.TOMATO);
        return this;
    }

    public PizzaBuilder withPestoSauce() {
        this.pizza.setSauce(PizzaSauce.PESTO);
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        this.pizza.getToppings().add(topping);
        return this;
    }

    public Pizza cookPizza() {
        return this.pizza;
    }
}
