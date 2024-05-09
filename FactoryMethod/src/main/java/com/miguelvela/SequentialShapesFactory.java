package com.miguelvela;

public class SequentialShapesFactory implements ShapesFactory {

    private int creatorIndex = 0;

    @Override
    public Shape create() {
        Shape shape = null;
        switch (creatorIndex) {
            case 0:
                shape = new Rectangle();
                break;
            case 1:
                shape = new Triangle();
                break;
            case 2:
                shape = new Circle();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + creatorIndex);
        };

        creatorIndex++;
        creatorIndex = creatorIndex % 3;

        return shape;
    }
}
