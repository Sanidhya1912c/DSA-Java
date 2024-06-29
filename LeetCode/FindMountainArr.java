package LeetCode;

public class FindMountainArr {
    public static void main(String[] args) {
        int[] array = { 1, 5, 2 };
        int target = 2;

        System.out.println(search(array, target));
    }

    public static int search(int[] array, int target) {
        int peakElementIndex = peakElementInArray(array);
        int answer = orderAgonsticBS(array, target, 0, peakElementIndex);
        if (answer != -1)
            return answer;

        return orderAgonsticBS(array, target, peakElementIndex + 1, array.length - 1);

    }

    public static int orderAgonsticBS(int[] array, int target, int start, int end) {
        boolean isAce = array[start] < array[end];

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (array[mid] == target)
                return mid;

            if (isAce) {
                if (target < array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > array[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }

    public static int peakElementInArray(int[] arr) {
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
