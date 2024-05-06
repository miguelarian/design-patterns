package com.miguelvela;

public class Subscriber implements  Observer {

    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    @Override
    public void update(String article) {
        System.out.println(this.name + " article received: " + article);
    }
}
