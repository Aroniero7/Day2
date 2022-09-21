package day9;

import java.util.Arrays;

public class ExtractPositiveIntNumbersFromString {
    public static void main(String[] args) {
        String string = "Hello 1234 from 23, or java - is not java11!-2.3 is not a 24";
        // processing
        int[] numbers = extractNumbersFromString(string);
        // display results
        System.out.println(Arrays.toString(numbers));
    }

    private static int[] extractNumbersFromString(final String string) {
        int[] results = new int[string.length() / 2 + 1];
        int count = 0;
        StringBuilder numberBilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            var ch = string.charAt(i);
            if (isDigit(ch)) {
                numberBilder.append(ch);
            } else if (numberBilder.length() > 0) {
                results[count++] = Integer.parseInt(numberBilder.toString());
                numberBilder.setLength(0);
            }
        }
        if (numberBilder.length() > 0) {
            results[count++] = Integer.parseInt(numberBilder.toString());
        }
        return trimArray(results, count);
    }

    private static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    private static int[] trimArray(int[] array, int count) {
        int[] results = new int[count];
        System.arraycopy(array, 0, results, 0, count);
        return results;
    }
}
