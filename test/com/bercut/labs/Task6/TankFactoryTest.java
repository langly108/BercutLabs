package com.bercut.labs.Task6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TankFactoryTest {

    @Test
    void createT34() {
        Country country = Country.RUSSIA;
        Tank tRus = TankFactory.createTank(country);
        Assertions.assertEquals("T34", tRus.getClass().getSimpleName());
    }

    @Test
    void createAbrams() {
        Country country = Country.USA;
        Tank tUsa = TankFactory.createTank(country);
        Assertions.assertEquals("Abrams", tUsa.getClass().getSimpleName());
    }

    @Test
    public void IllegalArgumentTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            Country country = Country.UNKNOWN;
            Tank hz = TankFactory.createTank(country);
        });
    }
}
