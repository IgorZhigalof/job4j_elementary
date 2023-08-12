package ru.job4j.condition;

public class Max {
    public int max(int left, int right) {
        return left > right ? left : right;
    }

    public int max(int left, int middle, int right) {
        return max(left, max(middle, right));
    }

    public int max(int lefter, int left, int right, int righter) {
        return max(max(lefter, left), max(righter, right));
    }
}