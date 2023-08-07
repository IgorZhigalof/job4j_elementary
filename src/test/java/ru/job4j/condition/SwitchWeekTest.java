package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SwitchWeekTest {

    @Test
    void when1thenPonedelnik() {
        int in = 1;
        String expected = "Понедельник";
        String out = SwitchWeek.nameOfDay(in);
        System.out.println(expected);
        assertThat(out).isEqualTo(expected);
    }
}