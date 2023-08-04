package ru.job4j.condition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class X2Test {

    @Test
    void whenA1B1C1X1Then3() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 3;
        int out = X2.calc(a, b, c, x);
        Assertions.assertEquals(expected, out);
    }

    @Test
    void whenA0B1C1X1Then2() {
        int a = 0;
        int b = 1;
        int c = 1;
        int x = 1;
        int expected = 2;
        int out = X2.calc(a, b, c, x);
        Assertions.assertEquals(expected, out);
    }

    @Test
    void whenA1B1C0X1Then2() {
        int a = 1;
        int b = 1;
        int c = 0;
        int x = 1;
        int expected = 2;
        int out = X2.calc(a, b, c, x);
        Assertions.assertEquals(expected, out);
    }

    @Test
    void whenA1B1C1X0Then2() {
        int a = 1;
        int b = 1;
        int c = 1;
        int x = 0;
        int expected = 1;
        int out = X2.calc(a, b, c, x);
        Assertions.assertEquals(expected, out);
    }

}