package com.miguelvela;

public class RandomShapesFactory implements ShapesFactory {
    @Override
    public Shape create() {
        int randomValue = (int)(Math.random() * 10) % 3;
        return switch (randomValue) {
            case 0 -> new Rectangle();
            case 1 -> new Triangle();
            case 2 -> new Circle();
            default -> null;
        };
    }
}
