package CyclicSort;

import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2, 2, 4, 4, 3, 3 };

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

        ArrayList<Integer> dublicates = new ArrayList<Integer>();

        int lastDublicate = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                if (lastDublicate != nums[j]) {
                    dublicates.add(nums[j]);
                    lastDublicate = nums[j];
                }
            }
        }

        for (int k : dublicates) {
            System.out.print(k + ",");
        }
    }
}
