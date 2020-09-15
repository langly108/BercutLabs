package Tests;

import Code.Task2;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void minNormal() {
        int a, b, c;
        a = 10;
        b = 15;
        c = 20;
        int res = Task2.min(a, b, c);
        Assert.assertEquals(a, res);
    }
}