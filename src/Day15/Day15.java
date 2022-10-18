package Day15;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Day15 {
    public static void main(String[] args) throws IOException {

        MasNumberString1();
    }

    private static void numberString() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Name");
        String str = reader.readLine();
        System.out.println("num");
        int num = Integer.parseInt(reader.readLine());
        while (num >= 0) {
            System.out.print(str + " ");
            num--;
        }
    }

    private static void numberTable8() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("num1");
        int num1 = Integer.parseInt(reader.readLine());
        System.out.println("num2");
        int num2 = Integer.parseInt(reader.readLine());
        for (int i = 1; i <= num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print("8");
            }
            System.out.println();
        }
    }

    private static void mas10() {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = 10 - i;
        }
        System.out.println(Arrays.toString(array));
    }

    private static void masString() throws IOException {
        String[] str = new String[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            String str1 = reader.readLine();
            str[i] = str1;
        }
        System.out.println(Arrays.toString(str));
    }

    private static void masSum() {
        int sum = 0;
        int[] array = {2, 15, 28, 63, 44};
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }

    private static void masMix() {

        int[] array = {22, 15, 28, 63, 44};
        int x = array[0];
        for (int i = 0; i < array.length; i++) {
            if (x < array[i]) {
                x = array[i];
            }
        }
        System.out.println(x);
    }

    private static void initializeArray() throws IOException {
        int[] array = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            int x = Integer.parseInt(reader.readLine());
            array[i] = x;
        }
        System.out.println(max(array));

    }

    private static int max(int[] array) {
        int x = array[0];
        for (int i = 0; i < array.length; i++) {
            if (x < array[i]) {
                x = array[i];
            }
        }
        return x;
    }

    private static void treugolnik() {
        int[][] array = new int[10][10];
        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < i + 1; j++) {
                System.out.print("8");
            }
        }
    }

    private static void MasNumberString() throws IOException {
        int[] number = new int[5];
        String[] strings = new String[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < strings.length; i++) {
            String str = reader.readLine();
            strings[i] = str;
        }
        for (int i = 0; i < number.length; i++) {
            number[i] = strings[i].length();
        }
        System.out.println(Arrays.toString(number));
    }

    private static void MasNumberString1() throws IOException {
        int[] number = new int[10];
        int[] number1 = new int[5];

        int middle = (number.length + 1) / 2;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < number.length; i++) {
            int x = Integer.parseInt(reader.readLine());
            number[i] = x;
        }
        for (int i = 0; i < number.length / 2; i++) {
            number1[i] = number[i];
        }
        int[] number2 = Arrays.copyOfRange(number, number.length / 2, number.length);
        System.out.println(Arrays.toString(number2));
    }
}





