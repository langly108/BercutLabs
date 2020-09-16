package com.bercut.labs.Task5;

public class Triangle implements Shape {

    double line1;
    double line2;
    double line3;

    public Triangle(double line1, double line2, double line3) {
        this.line1 = line1;
        this.line2 = line2;
        this.line3 = line3;
    }

    public double getLine1() {
        return line1;
    }

    public double getLine2() {
        return line2;
    }

    public double getLine3() {
        return line3;
    }

    public void setLine1(double line1) {
        this.line1 = line1;
    }

    public void setLine2(double line2) {
        this.line2 = line2;
    }


    public void setLine3(double line3) {
        this.line3 = line3;
    }

    @Override
    public double getPerimeter() {
        return (line1 + line2 + line3);
    }
}
