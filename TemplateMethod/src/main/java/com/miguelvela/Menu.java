package com.miguelvela;

public abstract class Menu {

    protected String[] drinks = {"Water", "Soda", "Beer", "Wine"};

    protected abstract String name();
    protected abstract String appetizer();
    protected abstract String main();
    protected abstract String dessert();
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
        return String.format(menuTemplate, name(), getRandomDring(), appetizer(), main(), dessert(), price());
    }

    private String getRandomDring() {
        return String.join(", ", drinks);
    }
}
