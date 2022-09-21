package day10;

public class BinarySearchInteractive {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 7, 8, 10, 13, 14};
        int query = 10;
        //int index = binarySearchInterative(array, query);
        int index = binarySearchRecursive(array, query, 0, array.length - 1);
        System.out.println("index=" + index);
    }

    private static int binarySearchInterative(int[] array, int query) {
        int startIndex = 0;
        int endIndex = array.length - 1;

        while (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            int middleValue = array[middleIndex];
            if (query > middleValue) {
                startIndex = middleIndex + 1;
            } else if (query < middleValue) {
                endIndex = middleIndex - 1;
            } else {
                return middleIndex;
            }
        }
        return -1;
    }

    private static int binarySearchRecursive(int[] array, int query, int startIndex, int endIndex) {
        if (startIndex <= endIndex) {
            int middleIndex = (startIndex + endIndex) / 2;
            int middleValue = array[middleIndex];
            if (query > middleValue) {
                return binarySearchRecursive(array, query, middleIndex + 1, endIndex);
            } else if (query < middleValue) {
                return binarySearchRecursive(array, query, startIndex, middleIndex - 1);
            } else {
                return middleIndex;
            }
        }
        return -1;
    }
}
