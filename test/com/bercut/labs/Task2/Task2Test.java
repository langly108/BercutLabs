package com.bercut.labs.Task2;

import com.bercut.labs.Task2.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Task2Test {

    @Test
    void min1st() {
        int a, b, c;
        a = 10;
        b = 15;
        c = 20;
        int res = Task2.min(a, b, c);
        Assertions.assertEquals(a, res);
    }

    @Test
    void min2nd() {
        int a, b, c;
        a = 15;
        b = 10;
        c = 20;
        int res = Task2.min(a, b, c);
        Assertions.assertEquals(b, res);
    }

    @Test
    void min3rd() {
        int a, b, c;
        a = 15;
        b = 20;
        c = 10;
        int res = Task2.min(a, b, c);
        Assertions.assertEquals(c, res);
    }

    @Test
    void min4rd() {
        int a, b, c;
        a = 20;
        b = 15;
        c = 10;
        int res = Task2.min(a, b, c);
        Assertions.assertEquals(c, res);
    }
}