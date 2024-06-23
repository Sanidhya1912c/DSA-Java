package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {

        int[] nums = { 3, 2, 3 };
        int target = 6;

        int[] ans = towPointer(nums, target);

        System.out.println(Arrays.toString(ans));

    }

    public static int[] towPointer(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { j, i };
                } 
            }
        }

        return new int[] { -1 };
    }
}
