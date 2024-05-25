package com.miguelvela;

public class TreeType {
    private String name;
    private String color;
    private String texture;

    public TreeType(String name, String color, String texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public String draw() {
        return "Name: " + name + ", Color: " + color + ", Texture: " + texture;
    }
}
