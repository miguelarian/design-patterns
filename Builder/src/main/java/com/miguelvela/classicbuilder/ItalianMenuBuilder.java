package com.miguelvela.classicbuilder;

public class ItalianMenuBuilder implements MenuBuilder {

    private String appetizer;
    private String main;
    private String side;
    private String beverage;
    private String dessert;

    @Override
    public void appetizer(String appetizer) {
        this.appetizer = appetizer;
    }

    @Override
    public void main(String main) {
        this.main = main;
    }

    @Override
    public void side(String side) {
        this.side = side;
    }

    @Override
    public void beverage(String beverage) {
        this.beverage = beverage;
    }

    @Override
    public void dessert(String dessert) {
        this.dessert = dessert;
    }

    @Override
    public Menu order() {
        Menu menu = new Menu();
        menu.setBeverage(this.beverage);
        menu.setAppetizer(this.appetizer);
        menu.setMain(this.main);
        menu.setSide(this.side);
        menu.setDessert(this.dessert);
        // some more complex stuff here...
        // ...
        return menu;
    }
}
