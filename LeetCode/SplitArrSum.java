package LeetCode;

public class SplitArrSum {
    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };

        int m = 2;

        System.out.println(splitArr(nums, m));

    }

    public static int splitArr(int[] nums, int m) {
        int start = 0;
        int end = 0;

        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // binery search
        while (start < end) {
            int mid = start + (end - start) / 2;

            // calculate how many peacices you can devide this in with max sum
            int sum = 0;
            int peices = 1;

            for (int num : nums) {
                if (sum + num > mid) {
                    sum = num;
                    peices++;
                } else {
                    sum += num;
                }
            }

            if (peices > m) {
                start = mid + 1;
            } else {
                end = mid;
            }

        }

        return end;
    }
}
