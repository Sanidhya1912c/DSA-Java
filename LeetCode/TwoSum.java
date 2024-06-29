package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        //1

        // Initialize an array of integers and a target value
        int[] nums = { 3, 2, 3 };
        int target = 6;

        // Call the towPointer method with the array and target value
        int[] ans = towPointer(nums, target);

        // Print the result of the towPointer method
        System.out.println(Arrays.toString(ans));

    }

    // Method to find two indices in an array that add up to a given target value
    public static int[] towPointer(int[] nums, int target) {
        // Iterate through the array using a for loop
        for (int i = 0; i < nums.length; i++) {

            // Iterate through the remaining elements of the array using another for loop
            for (int j = i + 1; j < nums.length; j++) {
                // Check if the sum of the current elements is equal to the target value
                if (nums[i] + nums[j] == target) {
                    // Return the indices of the two elements that add up to the target value
                    return new int[] { j, i };
                } 
            }
        }

        // If no pair of indices is found that adds up to the target value, return -1
        return new int[] { -1 };
    }
}