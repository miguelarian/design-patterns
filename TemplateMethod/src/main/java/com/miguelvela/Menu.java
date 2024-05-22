package com.miguelvela;

public abstract class Menu {

    private String[] drinks = {"Water", "Soda", "Beer", "Wine"};

    protected abstract String name();
    protected abstract String appetizers();
    protected abstract String mains();
    protected abstract String desserts();
    protected abstract double price();

    private String menuTemplate = """
        --------------------
        Menu: %s
        --------------------
        Drinks:
        %s
        --------------------
        Appetizer:
        %s
        --------------------
        Main:
        %s
        --------------------
        Dessert:
        %s
        --------------------
        Price: %.2f EUR
        --------------------
        """;

    public String printMenu() {
        return String.format(menuTemplate, name(), drinks(), appetizers(), mains(), desserts(), price());
    }

    private String drinks() {
        return String.join(", ", drinks);
    }
}
