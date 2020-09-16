package com.bercut.labs.Task5;

public interface Shape {

    int CIRCLE = 1;
    int TRIANGLE = 2;
    int RECTANGLE = 3;

    double getPerimeter();

    int getType();
}
