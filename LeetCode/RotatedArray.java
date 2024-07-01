package LeetCode;

public class RotatedArray {
    public static void main(String[] args) {
        // 33
        /*
         * Prior to being passed to your function, nums is possibly rotated at an
         * unknown pivot index k (1 <= k < nums.length) such that the resulting array is
         * [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]
         * (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3
         * and become [4,5,6,7,0,1,2].
         * 
         * Given the array nums after the possible rotation and an integer target,
         * return the index of target if it is in nums, or -1 if it is not in nums.
         * 
         * You must write an algorithm with O(log n) runtime complexity
         */

        int[] nums = { 1, 3 };
        int target = 3;

        System.out.println(search(nums, target));
    }

    static int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        int pivot = findPivit(nums);

        if (pivot == -1) {
            // if pivot is not found
            return binerySearch(nums, target, start, nums.length - 1);
        }

        // if pivot is found
        if (nums[pivot] == target) {
            return pivot;
        } else if (target >= nums[0]) {
            return binerySearch(nums, target, start, pivot - 1);
        } else {
            return binerySearch(nums, target, pivot + 1, end);
        }

    }

    static int binerySearch(int[] nums, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    static int findPivit(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            if (nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

}
