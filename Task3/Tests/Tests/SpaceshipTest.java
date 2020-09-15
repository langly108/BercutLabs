package Tests;

import Code.Spaceship;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpaceshipTest {

    @Test
    void getSpeed() {
        Spaceship sh = new Spaceship(20);
        Assert.assertEquals(20, sh.getSpeed());
    }
}