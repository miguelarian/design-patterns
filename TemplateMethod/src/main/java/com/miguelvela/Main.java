package com.miguelvela;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the Italian Restaurant");
        List<Menu> menus = List.of(new StandardMenu(), new VegetarianMenu());

        menus.forEach(menu -> {
            System.out.println();
            System.out.println(menu.printMenu());
        });
    }
}