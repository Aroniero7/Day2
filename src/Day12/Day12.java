package Day12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 7, 9, 11, 15, 18, 22, 13, 68, 54, 4, 6);
        poiskSum(7, integers);
    }

    private static void minAndMaxAndAvg() {
        int n = 100;
        double[] array = new double[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }
        double max = array[0];
        double min = array[0];
        double avg = 0;
        for (double v : array) {
            if (max < v) {
                max = v;
            }
            if (min > v) {
                min = v;
            } else {
                avg = v / array.length;
            }
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(avg);
    }

    private static void SumProstieChisla() {
        int sum = 0;
        for (int i = 2; i < 100; i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println(sum);
    }

    private static void umnozenie(int x) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(x * i);
        }
    }

    private static void poiskSum(int number, List<Integer> integers) {
        for (int i = 0; i < integers.size(); i++) {
            for (int j = 1 + i; j < integers.size(); j++) {
                if (integers.get(i) + integers.get(j) == number) {
                    System.out.println(integers.get(i) + " " + integers.get(j));
                }
            }
        }
    }

}

