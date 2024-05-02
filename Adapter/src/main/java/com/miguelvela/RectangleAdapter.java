package com.miguelvela;

public class RectangleAdapter implements Shape {

    private Rectangle rectangle;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
    }

    @Override
    public double getArea() {
        return this.rectangle.calculateArea();
    }

    @Override
    public double getPerimeter() {
        return this.rectangle.calculatePerimeter();
    }
}
