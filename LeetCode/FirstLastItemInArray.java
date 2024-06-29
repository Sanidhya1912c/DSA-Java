package LeetCode;

import java.util.Arrays;

public class FirstLastItemInArray {
    public static void main(String[] args) {
        //34
        // Problem: Find First and Last Position of Element in Sorted Array
        // Given an array of integers 'nums' which is sorted in ascending order, find the starting and ending indices of a given 'target' value.
        // If the target is not found in the array, return [-1, -1].
        // You must write an algorithm with a time complexity of O(log n).

        int[] nums = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    public static int[] searchRange(int[] nums, int target) {
        // Initialize the answer array with -1
        int[] ans = { -1, -1 };

        // Find the first occurrence of the target using binary search
        ans[0] = binerySerch(nums, target, true);

        // If the target is found, find the last occurrence of the target using binary search
        if(ans[0] != -1)
            ans[1] = binerySerch(nums, target, false);

        return ans;
    }

    public static int binerySerch(int[] arr, int target, boolean findStartIndex) {
        int ans = -1;

        int start = 0;
        int end = arr.length -1 ;

        // Perform binary search
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                // If we are looking for the first occurrence, continue searching in the left half
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    // If we are looking for the last occurrence, continue searching in the right half
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}