package LeetCode;

import java.util.Arrays;

public class FirstLastItemInArray {
    public static void main(String[] args) {
        // Find first and last position in an array
        // 34

        int[] nums = { 5, 7, 7, 7, 7, 8, 8, 10 };
        int target = 7;

        System.out.println(Arrays.toString(searchRange(nums, target)));

    }

    public static int[] searchRange(int[] nums, int target) {

        int[] ans = { -1, -1 };

        ans[0] = binerySerch(nums, target, true);
        ans[1] = binerySerch(nums, target, false);

        return ans;
    }

    public static int binerySerch(int[] arr, int target, boolean findStartIndex) {

        int ans = -1;

        int start = 0;
        int end = arr.length -1 ;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;

    }
}
