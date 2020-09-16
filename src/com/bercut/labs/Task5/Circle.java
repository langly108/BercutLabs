package com.bercut.labs.Task5;

public class Circle implements Shape {

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
}
