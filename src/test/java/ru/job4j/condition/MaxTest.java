package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {
    @Test
    void whenMax1To2Then2() {
        Max object = new Max();
        int left = 1;
        int right = 2;
        int result = object.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To2Then5() {
        Max object = new Max();
        int left = 5;
        int right = 2;
        int result = object.max(left, right);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax1To20Then2() {
        Max object = new Max();
        int left = 1;
        int right = 20;
        int result = object.max(left, right);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax2To2Then2() {
        Max object = new Max();
        int left = 2;
        int right = 2;
        int result = object.max(left, right);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax20To2To6Then20() {
        Max object = new Max();
        int left = 20;
        int middle = 2;
        int right = 6;
        int result = object.max(left, middle, right);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax20To2To6To10Then20() {
        Max object = new Max();
        int lefter = 20;
        int left = 2;
        int right = 6;
        int righter = 10;
        int result = object.max(lefter, left, right, righter);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }
}