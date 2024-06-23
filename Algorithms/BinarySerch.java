package Algorithms;

public class BinarySerch {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25 };
        int target = 7;

        System.out.println(binarySerch(array, target));

    }

    public static int binarySerch(int[] array, int target) {
        int low = 0;
        int high = array.length - 1;

        int mid = (low + high) / 2;

        while (low <= high) {
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
            mid = (low + high) / 2;
        }

        return -1;
    }
}
