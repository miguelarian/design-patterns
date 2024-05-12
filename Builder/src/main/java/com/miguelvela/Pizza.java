package com.miguelvela;

import java.util.List;

public class Pizza {

    private PizzaBase base;
    private PizzaSauce sauce;
    private List<String> toppings;

    public Pizza(PizzaBase base, PizzaSauce sauce, List<String> ingredients) {
        this.base = base;
        this.sauce = sauce;
        this.toppings = ingredients;
    }

    public List<String> getToppings() {
        return toppings;
    }

    public void setToppings(List<String> toppings) {
        this.toppings = toppings;
    }

    public PizzaSauce getSauce() {
        return sauce;
    }

    public void setSauce(PizzaSauce sauce) {
        this.sauce = sauce;
    }

    public PizzaBase getBase() {
        return base;
    }

    public void setBase(PizzaBase base) {
        this.base = base;
    }

    @Override
    public String toString() {
        return this.base.toString().toLowerCase() + ", " + this.sauce.toString().toLowerCase() + ", " + String.join(", ", this.toppings);
    }
}
