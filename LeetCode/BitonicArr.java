package LeetCode;

public class BitonicArr {
    public static void main(String[] args) {
        // 852. Peak Index in a Mountain Array
        int[] array = { 0, 10, 5, 2 };

        System.out.println(binerySerch(array));

    }

    static int binerySerch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return start;
    }
}
