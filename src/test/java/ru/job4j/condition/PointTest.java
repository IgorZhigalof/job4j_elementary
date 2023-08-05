package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;
import static ru.job4j.condition.Point.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when16to59then5() {
        int x1 = 1;
        int y1 = 6;
        int x2 = 5;
        int y2 = 9;
        double expected = 5;
        double out = distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenX53Y12toX59Y20then10() {
        int x1 = 53;
        int y1 = 12;
        int x2 = 59;
        int y2 = 20;
        double expected = 10;
        double out = distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when16to59then10() {
        int x1 = 1;
        int y1 = 3;
        int x2 = 9;
        int y2 = 9;
        double expected = 10;
        double out = distance(x1, y1, x2, y2);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

}