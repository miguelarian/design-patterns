package com.miguelvela;

import ç.Triangle;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10, 5);

        System.out.println("Rectangle area: " + rectangle.calculateArea());
        System.out.println("Rectangle perimeter: " + rectangle.calculatePerimeter());

        Shape rectangleAdapter = new RectangleAdapter(rectangle);
        System.out.println("RectangleAdapter area: " + rectangleAdapter.getArea());
        System.out.println("RectangleAdapter perimeter: " + rectangleAdapter.getPerimeter());

        Shape triangle = new Triangle(10, 5);
        Shape square = new RectangleAdapter(new Rectangle(2,2));

        System.out.println("---- SHAPES ----");
        Shape[] shapes = { triangle, square, rectangleAdapter };
        for(Shape shape : shapes) {
            System.out.println("Shape " + shape.getClass().getSimpleName());
            System.out.println("Shape area: " + shape.getArea());
            System.out.println("Shape perimeter: " + shape.getPerimeter());
        }
    }
}
