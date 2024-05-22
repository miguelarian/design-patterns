package com.miguelvela;

public class StandardMenu extends Menu {

    private String[] appetizers = {"Bruschetta", "Calamari", "Caprese Salad"};
    private String[] mains = {"Spaghetti Carbonara", "Chicken Parmesan", "Lasagna"};
    private String[] desserts = {"Tiramisu", "3 Chocolates cake", "Gelato"};
    private double price = 10.00d;

    @Override
    protected String name() {
        return "Daily Menu";
    }

    @Override
    protected final String appetizers() {
        return String.join(", ", appetizers);
    }

    @Override
    protected final String mains() {
        return String.join(", ", mains);
    }

    @Override
    protected final String desserts() {
        return String.join(", ", desserts);
    }

    @Override
    protected final double price() {
        return price;
    }
}
