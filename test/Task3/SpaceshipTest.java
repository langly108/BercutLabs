package Task3;

import com.bercut.labs.Task3.*;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class SpaceshipTest {

    @Test
    void getSpeed() {
        Spaceship sh = new Spaceship(20);
        Assert.assertEquals(20, sh.getSpeed());
    }
}