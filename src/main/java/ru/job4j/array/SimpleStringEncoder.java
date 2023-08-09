package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i) && i < input.length() - 1) {
                counter++;
            } else if (symbol != input.charAt(i) && i < input.length() - 1) {
                result += String.valueOf(symbol) + (counter != 1 ?  counter : "");
                symbol = input.charAt(i);
                counter = 1;
            } else if (symbol != input.charAt(i)) {
                result += String.valueOf(symbol) + (counter != 1 ?  counter : "") + input.charAt(i);
            } else if (symbol == input.charAt(i)) {
                counter++;
                result += String.valueOf(input.charAt(i)) + counter;
            }
        }
        return result;
    }
}
