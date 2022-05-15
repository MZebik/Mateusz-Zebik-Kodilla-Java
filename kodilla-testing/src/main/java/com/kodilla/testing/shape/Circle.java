package com.kodilla.testing.shape;

public class Circle implements Shape{

    private String name;
    private double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        double field = Math.PI * Math.pow(radius, 2);
        return 0;
    }

    public String getName() {
        return name;
    }

    public double getRadius() {
        return radius;
    }
}
