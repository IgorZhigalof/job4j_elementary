package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double halfP = (a + b + c) / 2;
        double first = halfP - a;
        double second = halfP - b;
        double third = halfP - c;
        double fourth = first * second * third * halfP;
        double rsl = Math.sqrt(fourth);
        return rsl;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(6, 8, 10);
        System.out.println("area (6, 8, 10) = " + rsl);
    }
}