package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 120;
        float expected = 2;
        float out = Converter.rubleToDollar(in);
        boolean passed = expected == out;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);
    }
}