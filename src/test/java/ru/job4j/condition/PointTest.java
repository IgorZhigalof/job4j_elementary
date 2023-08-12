package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        Point first = new Point(0, 0);
        Point second = new Point(2, 0);
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when16to59then5() {
        Point first = new Point(1, 6);
        Point second = new Point(5, 9);
        double expected = 5;
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenX53Y12toX59Y20then10() {
        Point first = new Point(53, 2);
        Point second = new Point(59, 10);
        double expected = 10;
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when13to99then10() {
        Point first = new Point(1, 3);
        Point second = new Point(9, 9);
        double expected = 10;
        double out = first.distance(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when135to991then10dot77() {
        Point first = new Point(1, 3, 5);
        Point second = new Point(9, 9, 1);
        double expected = 10.77;
        double out = first.distance3d(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when666to999then5dot19() {
        Point first = new Point(6, 6, 6);
        Point second = new Point(9, 9, 9);
        double expected = 5.19;
        double out = first.distance3d(second);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

}