package day10;

import java.util.Arrays;

public class SwapMinAndMaxArrayElementUsingFunctions {
    public static void main(String[] args) {
        int[] array = {1, -2, 3, 8, 5};

        var index = getIndexOfMinAndMaxElement(array);
        swap(array, index[0], index[1]);
        System.out.println(Arrays.toString(array));
    }

    private static int[] getIndexOfMinAndMaxElement(int[] array) {
        int IndexOfMinElement = 0;
        int minValue = array[0];
        int IndexOfMaxElement = 0;
        int maxValue = array[0];
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            if (current < minValue) {
                minValue = current;
                IndexOfMinElement = i;
            }
            if (current > maxValue) {
                maxValue = current;
                IndexOfMaxElement = i;
            }
        }
        return new int[]{IndexOfMinElement, IndexOfMaxElement};
    }

    private static void swap(int[] array, int IndexOfMinElement, int IndexOfMaxElement) {
        int temp = array[IndexOfMaxElement];
        array[IndexOfMaxElement] = array[IndexOfMinElement];
        array[IndexOfMinElement] = temp;
    }
}
