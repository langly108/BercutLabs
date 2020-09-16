package com.bercut.labs.Task6;

public class TheGame {

    public static void runGame() {
        Tank t1 = TankFactory.createTank(Country.RUSSIA);
        Tank t2 = TankFactory.createTank(Country.USA);
        do {
            t1.tankFire();
            t2.tankFire();

        } while ((t1.getAmmo() != 0) || (t2.getAmmo() != 0));
    }

    public static void main(String[] args) {
        System.out.println("i want to play a game");
        System.out.println("=====================");
        runGame();
        System.out.println("=====================");
        System.out.println("game over");
    }
}
