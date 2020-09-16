package com.bercut.labs.Task3;

import com.bercut.labs.Task3.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SpaceshipTest {

    @Test
    void getSpeed() {

        Spaceship sh = new Spaceship(20);
        Assertions.assertEquals(20, sh.getSpeed());
    }
}