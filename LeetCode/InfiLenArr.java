package LeetCode;

public class InfiLenArr {
    public static void main(String[] args) {
        // You have to find the element without using the length of the array
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        int target = 10;

        System.out.println(binerySerch(arr, target, findingRange(arr, target)));

    }

    public static int[] findingRange(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (target > end) {
            start = end + 1;
            end = (end + 1) * (end + 1);
        }

        return new int[] { start, end };

    }

    public static int binerySerch(int[] arr, int target, int[] range) {

        int start = range[0];
        int end = range[1];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        return -1;

    }
}
