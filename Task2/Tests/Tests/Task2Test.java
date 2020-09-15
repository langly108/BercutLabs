package Tests;

import Code.Task2;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Task2Test {

    @Test
    void min1st() {
        int a, b, c;
        a = 10;
        b = 15;
        c = 20;
        int res = Task2.min(a, b, c);
        Assert.assertEquals(a, res);
    }

    @Test
    void min2nd() {
        int a, b, c;
        a = 15;
        b = 10;
        c = 20;
        int res = Task2.min(a, b, c);
        Assert.assertEquals(b, res);
    }

    @Test
    void min3rd() {
        int a, b, c;
        a = 15;
        b = 20;
        c = 10;
        int res = Task2.min(a, b, c);
        Assert.assertEquals(c, res);
    }
}