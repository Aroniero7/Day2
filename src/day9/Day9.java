package day9;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        var number = new Random().nextInt(10);

//        int[] array = {1, -2, 8, 0, 5};
//        System.out.println(findMin(array,1,array[0]));
//        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
//        var query = 6;
//        System.out.println(findIndex(array, 0, query));
//        FizzBuzz();
        String string = "Hello 1234 from 23, or java - is not java11!-2.3 is not a 24";
        int[] numbers = extractNumbersFromString(string);
        System.out.println(Arrays.toString(numbers));

    }

    private static void GuessTheNumberUsingRecursion(int number) {
        int userCase = new Scanner(System.in).nextInt();


        if (number > userCase) {
            System.out.println("number > " + userCase + ". Try again:");
            GuessTheNumberUsingRecursion(number);
        } else if (number < userCase) {
            GuessTheNumberUsingRecursion(number);
            System.out.println("number < " + userCase + ". Try again:");
        } else {

            System.out.println("Congratulations, you guessed the number!");
        }
    }

    private static int sumOf(int current, int sum) {
        if (current > 100) {
            return sum;
        } else {
            return sumOf(current + 1, sum + current);
        }
    }

    private static int sumOf(int value) {
        if (value == 0) {
            return 0;
        } else {
            return value + sumOf(value - 1);
        }
    }

    private static int factorial(int n) {
        if (n < 0 || n == 0) {
            return 1;
        } else {
            n = n * factorial(n - 1);
        }
        return n;
    }

    private static int findMin(int[] array, int i, int min) {
        if (i == array.length) {
            return min;
        } else {
            if (array[i] < min) {
                return findMin(array, i + 1, array[i]);
            } else {
                return findMin(array, i + 1, min);
            }
        }
    }

    private static int findIndex(int[] array, int i, int query) {
        if (i == array.length) {
            return -1;
        } else if (array[i] == query) {
            return i;
        } else {
            return findIndex(array, i + 1, query);
        }
    }

    private static void FizzBuzz() {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");

            } else {
                System.out.println(i);
            }
        }
    }

    private static int[] extractNumbersFromString(final String string) {
        int[] result = new int[string.length() / 2 + 1];
        int count = 0;
        StringBuilder numberBilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            var ch = string.charAt(i);
            if (isDigit(ch)) {
                numberBilder.append(ch);
            } else if (numberBilder.length() > 0) {
                result[count++] = Integer.parseInt(numberBilder.toString());
                numberBilder.setLength(0);
            }
            if (numberBilder.length() > 0) {
                result[count++] = Integer.parseInt(numberBilder.toString());
            }
        }
        return trimArray(result, count);
    }

    private static boolean isDigit(char ch) {
        return ch >= '0' && ch <= '9';
    }

    private static int[] trimArray(int[] array, int count) {
        int[] result = new int[count];
        System.arraycopy(array, 0, result, 0, count);
        return result;
    }
}



