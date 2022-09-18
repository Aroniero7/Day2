package day7;

import java.util.Arrays;

public class Day7 {
    public static void main(String[] args) {

        SwapMinAndMaxArrayElement();
    }

    private static void ArrayReverse() {
        int[] array = {1, 2, 3, 4, 5};
        boolean isSorted = false;
        int x;
        while (!isSorted) {
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    isSorted = false;
                    x = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = x;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void CheckIfAllNumbersArePositive() {
        int[] array = {1, 0, 3, 4, 5};
        boolean isAll = true;
        for (int i : array) {
            if (i < 0) {
                isAll = false;
                break;
            }
        }
        System.out.println(isAll ? "All positive" : "Not all positive");
    }

    private static void SwapMinAndMaxArrayElement() {
        int[] array = {1, 8, 3, -2, 5};
        int min = array[0];
        int max = array[0];
        int indexMinElement = 0;
        int indexMaxElement = 0;
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            if (current < min) {
                min = current;
                indexMinElement = i;
            }
            if (current > max) {
                min = current;
                indexMaxElement = i;
            }
        }
        int temp = array[indexMaxElement];
        array[indexMaxElement] = array[indexMinElement];
        array[indexMaxElement] = temp;
        System.out.println(Arrays.toString(array));
    }

}