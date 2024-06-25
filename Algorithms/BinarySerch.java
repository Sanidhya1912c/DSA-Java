package Algorithms;

public class BinarySerch {
    public static void main(String[] args) {
        int[] ascendingSortedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22,
                23, 24, 25 };

        int[] descendingSortedArray = { 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5,
                4, 3, 2, 1 };

        int target = 7;

        System.out.println(binarySerch(ascendingSortedArray, target));

        System.out.println(orderAgnosticBinarySearch(descendingSortedArray, target));

    }

    public static int binarySerch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < array[mid]) {
                end = mid - 1;
            } else if (target > array[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

    public static int orderAgnosticBinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        boolean isInAscendingOrder = true;
        if (array[start] > array[end])
            isInAscendingOrder = false;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == array[mid])
                return mid;

            if (isInAscendingOrder) {

                if (target < array[mid]) {
                    end = mid - 1;
                } else if (target > array[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < array[mid]) {
                    start = mid + 1;
                } else if (target > array[mid]) {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
