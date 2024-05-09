package com.miguelvela;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("RANDOM ----------");
        ShapesFactory randomFactory = new RandomShapesFactory();
        List<Shape> randomShapes = new ArrayList<>();
        randomShapes.add(randomFactory.create());
        randomShapes.add(randomFactory.create());
        randomShapes.add(randomFactory.create());
        randomShapes.forEach(Shape::draw);


        System.out.println("SEQUENTIAL ----------");
        ShapesFactory sequentialFactory = new SequentialShapesFactory();
        List<Shape> sequentialShapes = new ArrayList<>();
        sequentialShapes.add(sequentialFactory.create());
        sequentialShapes.add(sequentialFactory.create());
        sequentialShapes.add(sequentialFactory.create());
        sequentialShapes.add(sequentialFactory.create());
        sequentialShapes.add(sequentialFactory.create());
        sequentialShapes.add(sequentialFactory.create());
        sequentialShapes.forEach(Shape::draw);
    }
}