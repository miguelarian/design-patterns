package com.miguelvela.classicbuilder;

public interface MenuBuilder {
    void appetizer(String appetizer);
    void main(String main);
    void side(String side);
    void beverage(String beverage);
    void dessert(String dessert);
    Menu order();
}
