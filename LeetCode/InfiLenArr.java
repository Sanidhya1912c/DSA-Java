package LeetCode;

public class InfiLenArr {
    public static void main(String[] args) {
        // You have to find the element without using the length of the array
        int[] randomArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };
        int target = 10;

        System.out.println(eleOfArrSizeInfi(randomArr, target));

    }

    public static int eleOfArrSizeInfi(int[] arr, int target) {
        int start = 0;
        int end = 1;

        // finding the range
        while (target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }

        // serching the element in the new range
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

        return -1;
    }

}
