package com.bercut.labs.Task5;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Task5Test {

    @Test
    void findMinMax() {
        Circle c1 = new Circle(75);
        Rectangle r1 = new Rectangle(100,200);
        Rectangle r2 = new Rectangle(200,233);
        Triangle t1 = new Triangle(120, 130, 140);
        List<Shape> list = new ArrayList<>();
        list.add(c1);
        list.add(r1);
        list.add(r2);
        list.add(t1);
        double[] res = Task5.findMinMax(list);
        System.out.println(Arrays.toString(res));
        Assert.assertArrayEquals(new double[]{390.0, 866.0}, res, 0.1);
    }

    @Test
    void initObjects() {
        List<Shape> objList = Task5.initObjects(10, 30, true,0);
        double[] res = Task5.findMinMax(objList);
        Assert.assertArrayEquals(new double[]{182.2, 182.2}, res, 0.1);

        objList = Task5.initObjects(10, 30, true,141);
        res = Task5.findMinMax(objList);
        Assert.assertArrayEquals(new double[]{76.0, 76.0}, res, 0.1);

    }
}