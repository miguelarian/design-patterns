package com.miguelvela;

public class Triangle implements Shape {
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * width * height;
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.sqrt(width * width + height * height);
        return width + height + hypotenuse;
    }
}
