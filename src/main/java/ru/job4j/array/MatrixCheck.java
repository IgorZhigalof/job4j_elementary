package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (char element : board[row]) {
            if (element != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (char[] element : board) {
            if (element[column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }
}