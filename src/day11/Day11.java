package day11;

import java.util.Arrays;

public class Day11 {
    public static void main(String[] args) {
        System.out.println(stepen(2, 4));
    }

    public static void findText(String text) {
        char array = text.charAt(3);
        System.out.println(array);
    }

    public static String textReversed(String text) {
        char[] array = text.toCharArray();
        String result = "";
        for (int i = array.length - 1; i >= 0; i--) {
            result = result + array[i];
        }
        return result;
    }

    private static int stepen(int number, int stp) {
        int result = number;
        for (int i = 1; i < stp; i++) {
            result = result * number;
        }
        return result;
    }
}
