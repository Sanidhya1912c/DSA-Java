package CyclicSort;

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2, 4 };

        System.out.println(Arrays.toString(setMismatch(nums)));

    }

    static int[] setMismatch(int[] nums) {

        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (j != nums[j] - 1) {
                return new int[] { nums[j], j + 1 };
            }
        }

        return new int[] { -1, -1 };
    }
}
