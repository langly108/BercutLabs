package com.bercut.labs.Task5;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task5 {

    public static final int CIRCLE = 1;
    public static final int TRIANGLE = 2;
    public static final int RECTANGLE = 3;

    //Рандомайзер для чисел от 1 до RND_COUNT
    public static final int RND_COUNT = 100;
    //Количество фигур
    public static final int NUMBER_OF_FIGURES = 10;

    public static double[] findMinMax(List<Shape> objList) {
        double[] perimeters = new double[objList.size()];
        double[] res = new double[2];
        for (int i = 0; i < objList.size(); i++) {
            perimeters[i] = objList.get(i).getPerimeter();
        }
        double minPerimeter = Arrays.stream(perimeters).min().getAsDouble();
        res[0] = minPerimeter;
        double maxPerimeter = Arrays.stream(perimeters).max().getAsDouble();
        res[1] = maxPerimeter;
        return res;
    }

    public static List<Shape> initObjects() {
        return initObjects(NUMBER_OF_FIGURES, RND_COUNT, false, 0);
    }

    public static List<Shape> initObjects(int numberOfFigures, int rndCount) {
        return initObjects(numberOfFigures, rndCount, false, 0);
    }

    public static List<Shape> initObjects(int numberOfFigures, int rndCount, boolean useSeed, int seed) {
        List<Shape> objList = new ArrayList<>();
        for (int i = 0; i < numberOfFigures; i++) {
            Random r;
            if (!useSeed) {
                r = new Random();
            } else {
                r = new Random(seed);
            }
            int rnd = r.nextInt(3) + 1;
            switch (rnd) {
                case (CIRCLE):
                    //рандомный радиус от 1 до 100
                    double radius = r.nextInt(rndCount) + 1;
                    Circle circle = new Circle(radius);
                    objList.add(circle);
                    break;
                case (TRIANGLE):
                    /*
                     * есть вероятность, что получившиеся стороны не смогут образовать треугольник...
                     */
                    double line1, line2, line3;
                    do {
                        line1 = r.nextInt(rndCount) + 1;
                        line2 = r.nextInt(rndCount) + 1;
                        line3 = r.nextInt(rndCount) + 1;
                    } while ((line1 > line2 + line3) || (line2 > line3 + line1) || (line3 > line1 + line2));

                    Triangle triangle = new Triangle(line1, line2, line3);
                    objList.add(triangle);
                    break;
                case (RECTANGLE):
                    double height = r.nextInt(rndCount) + 1;
                    double width = r.nextInt(rndCount) + 1;
                    Rectangle rectangle = new Rectangle(height, width);
                    objList.add(rectangle);
                    break;
                default:
                    break;
            }
        }
        return objList;

    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<Shape> objList = initObjects();
        for (Shape shape : objList) {
            switch (shape.getClass().getSimpleName()) {
                case ("Circle") -> System.out.println("Фигура - круг, радиус: " + shape.getClass().getMethod("getRadius").invoke(shape));
                case ("Triangle") -> System.out.println("Фигура - треугольник, стороны: " + shape.getClass().getMethod("getLine1").invoke(shape) + " " + shape.getClass().getMethod("getLine2").invoke(shape) + " " + shape.getClass().getMethod("getLine3").invoke(shape));
                case ("Rectangle") -> System.out.println("Фигура - прямоугольник, ширина: " + shape.getClass().getMethod("getWidth").invoke(shape) + ", высота " + shape.getClass().getMethod("getHeight").invoke(shape));
            }
        }
        double[] params = findMinMax(objList);
        System.out.println("Минимальный периметр: " + params[0] + ", максимальный периметр: " + params[1]);
    }
}
