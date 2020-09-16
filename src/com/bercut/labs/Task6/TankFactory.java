package com.bercut.labs.Task6;

public class TankFactory {

    public static Tank createTank(Country country) {
        Tank tank;
        if (country == Country.RUSSIA) {
            tank = new T34(5);
        } else if (country == Country.USA) {
            tank = new Abrams(5);
        } else {
            throw new IllegalArgumentException();
        }
        return tank;
    }
}
