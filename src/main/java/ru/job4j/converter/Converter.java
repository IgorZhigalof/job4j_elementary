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
        float inForEuro = 140;
        float expectedForEuro = 2;
        float outForEuro = Converter.rubleToEuro(inForEuro);
        boolean passedForEuro = expectedForEuro == outForEuro;
        System.out.println("140 rubles are 2. Test result : " + passedForEuro);

        float inForDollar = 120;
        float expectedForDollar = 2;
        float outForDollar = Converter.rubleToDollar(inForDollar);
        boolean passed = expectedForDollar == outForDollar;
        System.out.println("120 rubles are 2 dollars. Test result : " + passed);
    }
}