package LeetCode;

public class InfiLenArr {
    public static void main(String[] args) {
        // Problem: Find Element in an Infinite Array
        // You are given an infinite array of integers, where the array is sorted in ascending order.
        // Your task is to find the index of a given target element in the array.
        // If the target element is not present in the array, return -1.

        int[] randomArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        int target = 10;

        System.out.println(eleOfArrSizeInfi(randomArr, target));
    }

    public static int eleOfArrSizeInfi(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // Finding the range where the target element could be present
        // This is done by doubling the range size until the target element is found or the range exceeds the array
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        // Searching the target element in the new range
        // This is done using binary search
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

        // If the target element is not found, return -1
        return -1;
    }
}