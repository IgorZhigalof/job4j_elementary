package ru.job4j.converter;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ConverterTest {

    @Test
    void whenConvert210RublesThen3Euros() {
        float in = 210;
        float expected = 3;
        float out = Converter.rubleToEuro(in);
        float eps = 0.001f;
        Assertions.assertEquals(expected, out, eps);
    }

    @Test
    void whenConvert180RublesThen3Dollars() {
        float in = 180;
        float expected = 3;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        Assertions.assertEquals(expected, out, eps);
    }
}