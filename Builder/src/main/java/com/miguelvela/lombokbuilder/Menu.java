package com.miguelvela.lombokbuilder;

import lombok.Builder;

@Builder
public class Menu {
    private String appetizers;
    private String main;
    private String side;
    private String beverage;
    private String dessert;

    @Override
    public String toString() {
        return "Menu{" +
                "appetizers='" + appetizers + '\'' +
                ", main='" + main + '\'' +
                ", side='" + side + '\'' +
                ", beverage='" + beverage + '\'' +
                ", dessert='" + dessert + '\'' +
                '}';
    }
}
