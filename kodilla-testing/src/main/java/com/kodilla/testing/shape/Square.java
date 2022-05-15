package com.kodilla.testing.shape;

public class Square implements Shape{

    private String name;
    private double edgeLength;

    public Square(String name, double edgeLength) {
        this.name = name;
        this.edgeLength = edgeLength;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = Math.pow(edgeLength, 2);
        return field;
    }

    public String getName() {
        return name;
    }

    public double getEdgeLength() {
        return edgeLength;
    }
}
