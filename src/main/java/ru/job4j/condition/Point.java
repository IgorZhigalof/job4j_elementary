package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = (x2 - x1);
        double second = (y2 - y1);
        double trird = Math.pow(first, 2);
        double fourth = Math.pow(second, 2);
        double fifth = trird + fourth;
        double rsl = Math.sqrt(fifth);
        return rsl;
    }

    public static void main(String[] args) {
        double result = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) " + result);
        result = Point.distance(2, 4, 6, 8);
        System.out.println("result (2, 4) to (6, 8) " + result);
        result = Point.distance(3, 15, 312, 123);
        System.out.println("result (3, 15) to (312, 123) " + result);
    }
}