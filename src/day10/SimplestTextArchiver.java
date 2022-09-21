package day10;

import java.util.Arrays;

public class SimplestTextArchiver {
    public static void main(String[] args) {
        String source = "A".repeat(8) + "B".repeat(3) + "C".repeat(5);
        System.out.println("Source text:   " + source);

        // processing
        String zipped = zip(source);
        // display results
        System.out.println("Zipped text:   " + zipped);

        // processing
        String unzipped = unzip(zipped);
        // display results
        System.out.println("Unzipped text: " + unzipped);
    }

    private static String zip(String source) {
        StringBuilder result = new StringBuilder();
        char prev = source.charAt(0);
        int count = 1;
        for (int i = 1; i < source.length(); i++) {
            char current = source.charAt(i);
            if (current == prev) {
                count++;
            } else {
                result.append(prev).append(count);
                prev = current;
                count = 1;
            }
        }
        result.append(prev).append(count);
        return result.toString();
    }

    private static String unzip(String zipped) {
        StringBuilder result = new StringBuilder();
        char ch = zipped.charAt(0);
        StringBuilder countBilder = new StringBuilder();
        for (int i = 1; i < zipped.length(); i++) {
            char current = zipped.charAt(i);
            if (isDigit(current)) {
                countBilder.append(current);
            } else {
                int count = Integer.parseInt(countBilder.toString());
                for (int j = 0; j < count; j++) {
                    result.append(ch);
                }
                countBilder.setLength(0);
                ch = current;
            }
        }
        int count = Integer.parseInt(countBilder.toString());
        for (int j = 0; j < count; j++) {
            result.append(ch);
        }
        return result.toString();
    }

    private static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }
}