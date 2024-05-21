package com.miguelvela;

public class Sheep extends Animal {

    public Sheep(String name) {
        super(name);
    }

    @Override
    public Sheep makeCopy() {
        return new Sheep(this.getName());
    }

    @Override
    public String toString() {
        return "Sheep{ '" + this.getName() + "': " + this.hashCode() + " }";
    }
}
