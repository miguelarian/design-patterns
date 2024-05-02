package com.miguelvela;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public double calculateArea() {
        return width * height;
    }

    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}
