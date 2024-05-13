package com.miguelvela.lombokbuilder;

public class Main {
    public static void main(String[] args) {
        Menu menu = Menu.builder()
                .beverage("Cola")
                .appetizers("Chicken Wings")
                .side("Fries")
                .main("Cheese Burger")
                .dessert("Milkshake")
                .build();

        System.out.println(menu);
    }
}