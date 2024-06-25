package CourseQuestions.Binary;

public class OrderAgnosticBinarySearch {

    public static void main(String[] args) {

        int[] descendingSortedArray = { 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5,
                4, 3, 2, 1 };

        int target = 7;

        System.out.println(orderAgnosticBinarySearch(descendingSortedArray, target));

    }

    public static int orderAgnosticBinarySearch(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        boolean isInAscendingOrder = true;
        if (array[start] > array[end])
            isInAscendingOrder = false;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target == array[mid])
                return mid;

            if (isInAscendingOrder) {

                if (target < array[mid]) {
                    end = mid - 1;
                } else if (target > array[mid]) {
                    start = mid + 1;
                }
            } else {
                if (target < array[mid]) {
                    start = mid + 1;
                } else if (target > array[mid]) {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
