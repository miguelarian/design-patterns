package com.miguelvela;

public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, String name, String color, String texture) {
        this.x = x;
        this.y = y;
        this.type = TreeFactory.getTreeType(name, color, texture);
    }

    public void draw() {
        System.out.println("Drawing a tree at " + x + ", " + y + " with type {" + type.draw() + ",  " + type.hashCode() + "}");
    }
}
