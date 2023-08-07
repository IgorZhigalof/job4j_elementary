package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        for (int i = 1; i <= array.length / 2; i++) {
            int swapHelper = array[i - 1];
            array[i - 1] = array[array.length - i];
            array[array.length - i] = swapHelper;
        }
        return array;
    }
}