package com.bercut.labs.Task5;

public class Rectangle implements Shape {

    public final static int type = Shape.RECTANGLE;

    double height;
    double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }

    @Override
    public int getType() {
        return type;
    }
}
