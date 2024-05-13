package com.miguelvela.classicbuilder;

public class Menu {
    private String appetizer;
    private String main;
    private String side;
    private String beverage;
    private String dessert;

    public String getAppetizer() {
        return appetizer;
    }

    public void setAppetizer(String appetizers) {
        this.appetizer = appetizers;
    }

    public String getMain() {
        return main;
    }

    public void setMain(String main) {
        this.main = main;
    }

    public String getSide() {
        return side;
    }

    public void setSide(String side) {
        this.side = side;
    }

    public String getBeverage() {
        return beverage;
    }

    public void setBeverage(String beverage) {
        this.beverage = beverage;
    }

    public String getDessert() {
        return dessert;
    }

    public void setDessert(String dessert) {
        this.dessert = dessert;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "appetizer='" + appetizer + '\'' +
                ", main='" + main + '\'' +
                ", side='" + side + '\'' +
                ", beverage='" + beverage + '\'' +
                ", dessert='" + dessert + '\'' +
                '}';
    }
}
