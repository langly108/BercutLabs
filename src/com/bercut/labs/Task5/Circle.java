package com.bercut.labs.Task5;

public class Circle implements Shape {

    public final static int type = Shape.CIRCLE;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double radius;

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public int getType() {
        return type;
    }
}
