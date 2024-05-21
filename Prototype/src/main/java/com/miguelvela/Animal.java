package com.miguelvela;

public abstract class Animal implements Cloneable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract Animal makeCopy();
}
