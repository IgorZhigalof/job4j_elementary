package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class MultipleSwitchWeekTest {

    @Test
    void whenSundayThen7() {
        String in = "Sunday";
        int expected = 7;
        int out = MultipleSwitchWeek.numberOfDay(in);
        assertThat(out).isEqualTo(expected);
    }
}