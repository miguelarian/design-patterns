package com.miguelvela;

public class StandardMenu extends Menu {

    private String[] appetizers = {"Bruschetta", "Calamari", "Caprese Salad"};
    private String[] mains = {"Spaghetti Carbonara", "Chicken Parmesan", "Lasagna"};
    private String[] desserts = {"Tiramisu", "Cannoli", "Gelato"};
    private double price = 10.00d;

    @Override
    protected String name() {
        return "Daily Menu";
    }

    @Override
    protected String appetizer() {
        return String.join(", ", appetizers);
    }

    @Override
    protected String main() {
        return String.join(", ", mains);
    }

    @Override
    protected String dessert() {
        return String.join(", ", desserts);
    }

    @Override
    protected double price() {
        return price;
    }
}
