package Day16;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class Day16 {
    public static void main(String[] args) {
        time();
    }

    private static void missingNumber(int n) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 187};
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            if (array[i] == n) {
                System.out.println(count);
            }
        }
    }

    private static void sortedArray() {
        int[][] array = new int[6][7];
        int num;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < 7; j++) {
                int number = new Random().nextInt(10);
                array[i][j] = (int) (Math.random() * 10);
            }
        }
        System.out.println(Arrays.deepToString(array));
//        boolean isSorted = false;
//        while (!isSorted)
//            isSorted = true;
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length-1; j++) {
//                if (array[i][j] > array[i][j + 1])
//                    isSorted = false;
//
//
//                num = array[i][j];
//                array[i][j] = array[i][j + 1];
//                array[i][j + 1] = num;
        for (int i = 0; i < array.length; i++) {
            Arrays.sort(array[i]);
            System.out.println(Arrays.toString(array[i]));
        }
    }


//        Arrays.sort(array, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return Integer.compare(o2[0], o1[0]);
//            }
//        });
//        System.out.println(Arrays.deepToString(array));
//    }


    private static void time() {
        int x = 0;
        for (int i = 0; i < 24; i++) {
            for (int j = 0; j < 60; j++) {
                if (i % 10 == j / 10 % 10 && i / 10 % 10 == j % 10 ) {
                    x++;
                    System.out.println(i + " " + j);
                }
            }

        }
        System.out.println(x);
    }
}







