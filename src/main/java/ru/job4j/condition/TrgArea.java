package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double halfP = (a + b + c) / 2;
        double rsl = Math.sqrt((halfP - a) * (halfP - b) * (halfP - c) * halfP);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(6, 8, 10);
        System.out.println("area (6, 8, 10) = " + rsl);
    }
}