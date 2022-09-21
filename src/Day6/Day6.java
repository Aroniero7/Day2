package Day6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Day6 {
    public static void main(String[] args) {

        ArrayElementStatistic();
    }

    public static void SumFrom1To100() {
        int x = 0;
        for (int i = 0; i <= 100; i++) {
            x = x + i;
        }
        System.out.println(x);
    }

    public static void NumberReverse() {
        int number = 123456789, reverced = 0;
        while (number != 0) {
            int x = number % 10;
            reverced = reverced * 10 + x;
            number /= 10;
        }
        System.out.println(reverced);
    }

    public static void GuessTheNumber() {
        while (true) {
            System.out.println("Vvdeite chislo");
            int x = new Scanner(System.in).nextInt();
            int number = new Random().nextInt(10);
            if (number == x) {
                System.out.println("Congratulations, you guessed the number!");
                break;
            } else {
                System.out.println("Try again");
            }
        }
    }

    public static void Factorial() {
        int factorial = 1;
        for (int i = 1; i <= 5; i++) {
            factorial = factorial * i;
            System.out.println("Factorial chisla: " + i + "! " + factorial);
        }
    }

    public static void MultiplicationTableCase1() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                var res = i * j;
                System.out.print((res == 1 ? "" : res) + "\t");
            }
            System.out.println();
        }
    }

    public static void ArrayCopy() {
        int[] array = {1, 2, 3, 4, 5};
        int[] array1 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i];
        }
        //System.arraycopy(array, 0, array1, 0, array.length);
        System.out.print(Arrays.toString(array1));
    }

    public static void ArrayElementSum() {
        int[] array = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i = 0; i <= array.length; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void FindMinElement() {
        int[] array = {1, -2, 8, 0, 5};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public static void ArrayElementCount() {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2};
        int count = 0;
        for (int i : array) {
            if (i == 2) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void ArrayReverse() {
        int[] array = {1, 2, 3, 4, 5};
        for (int i : array) {
            System.out.println(Arrays.toString(array));

        }
    }

    private static int factorial(int n) {
        int x = 1;
        if (n == 1 || n == 0) {
            return x;
        }
        x = n * factorial(n - 1);
        return x;
    }

    private static double sqrt(double x) {
        return Math.sqrt(x);

    }

    public static void bubleSorted() {
        int[] arrai = {12, 45, 35, 1, 8, 66, 4};
        boolean isSorted = false;
        int x;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < arrai.length - 1; i++) {
                if (arrai[i] > arrai[i + 1]) {
                    isSorted = false;
                    x = arrai[i];
                    arrai[i] = arrai[i + 1];
                    arrai[i + 1] = x;
                }
            }
        }
        System.out.println(Arrays.toString(arrai));
    }

    private static void ArrayElementStatistic() {
        int[] array = {5, 2, 3, 4, 4, 3, 3, 2, 2, 2, 2, 2,};
        int[] unique = new int[array.length];
        int[] counts = new int[array.length];
        int count = 0;
        for (int element : array) {
            boolean exists = false;
            for (int j = 0; j < count; j++) {
                if (unique[j] == element) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                int number = 1;
                for (int j = 1 + 1; j < array.length; j++) {
                    if (element == array[j]) {
                        number++;
                    }
                }
                unique[count] = element;
                counts[count] = number;
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            System.out.println(unique[i] + "=" + (double) counts[i] * 100 / array.length + "%");
        }
    }

    private static void PrintReverseString() {
        String s = "Hello world!";
        char[] array = s.toCharArray();
        StringBuilder result = new StringBuilder();
        for (int i = array.length - 1; i >= 0; i--) {
            result.append(array[i]);
        }
        System.out.println(result);
    }

    private static void MathHelper() {
        System.out.println("Enter cmd: {pi, e, exit or quit}");
        boolean x = true;
        while (x) {
            String operator = new Scanner(System.in).nextLine();
            switch (operator) {
                case ("pi") -> System.out.println(Math.PI);
                case ("e") -> System.out.println(Math.E);
                case ("exit"), ("quit") -> x = false;
                default -> System.out.println("Invalid");
            }
        }
    }

    private static void ReverseStringBuilder() {
        StringBuilder bilder = new StringBuilder();
        bilder.append("Hello world!");
        bilder.reverse();
        System.out.println(bilder);
    }

    private static void BigIntegerSum() {
        String a = "123456789012345678901234567890123456789012345678901234567890";
        String b = "12345678901234567890123456789012345678901234567890";
        var a1 = a.length() >= b.length() ? a : "0".repeat(b.length() - a.length()) + a;
        var b1 = b.length() >= a.length() ? b : "0".repeat(a.length() - a.length()) + b;

        StringBuilder res = new StringBuilder();
        int prevDigit = 0;
        for (int i = a1.length() - 1; i >= 0; i--) {
            var digit1 = Integer.parseInt(String.valueOf(a1.charAt(i)));
            var digit2 = Integer.parseInt(String.valueOf(b1.charAt(i)));
            int sum = digit1 + digit2;
            if (sum > 9) {
                prevDigit = 1;
                sum = sum % 10;
            } else {
                prevDigit = 0;
            }
            res.insert(0, sum);
        }
        if (prevDigit != 0) {
            res.insert(0, prevDigit);
        }
        System.out.println(res.toString());
    }
}

