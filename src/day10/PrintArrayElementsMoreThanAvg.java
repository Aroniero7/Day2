package day10;

import java.util.Arrays;

public class PrintArrayElementsMoreThanAvg {
    public static void main(String[] args) {

        int[] array = {1, 4, -5, -2, 0, 12};
        int[] result = subArrayWithMoreThanAvgElements(array);
        System.out.println(Arrays.toString(result));

    }

    private static int[] subArrayWithMoreThanAvgElements(int[] array) {
        int avg = calcukateAvg(array);
        return extractElementMoreThanAvg(array, avg);
    }

    private static int calcukateAvg(int[] array) {
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        return round(sum / array.length);
    }

    private static int round(double v) {
        int round = (int) v;
        if (v - round >= 0.5) {
            return round + 1;
        } else {
            return round;
        }
    }

    private static int[] extractElementMoreThanAvg(int[] array, int avg) {
        int[] result = new int[array.length];
        int count = 0;
        for (int i : array) {
            if (i > avg) {
                result[count++] = i;
            }
        }
        return trin(result, count);
    }

    private static int[] trin(int[] array, int count) {
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = array[i];
        }
        return result;
    }
}
