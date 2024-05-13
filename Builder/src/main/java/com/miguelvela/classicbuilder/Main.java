package com.miguelvela.classicbuilder;

public class Main {
    public static void main(String[] args) {

        MenuBuilder americanMenuBuilder = new AmericanMenuBuilder();
        americanMenuBuilder.beverage("Cola");
        americanMenuBuilder.appetizer("Chicken Wings");
        americanMenuBuilder.main("Burger");
        americanMenuBuilder.side("Fries");
        americanMenuBuilder.dessert("Milkshake");

        Menu americanMenu = americanMenuBuilder.order();
        System.out.println(americanMenu);

        MenuBuilder italianMenuBuilder = new ItalianMenuBuilder();
        italianMenuBuilder.beverage("Spritz");
        italianMenuBuilder.appetizer("Focaccia");
        italianMenuBuilder.main("Pizza Margarita");
        italianMenuBuilder.side("Caprese Salad");
        italianMenuBuilder.dessert("Pandoro");

        Menu italianMenu = italianMenuBuilder.order();
        System.out.println(italianMenu);
    }
}