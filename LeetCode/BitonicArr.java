package LeetCode;

public class BitonicArr {
    public static void main(String[] args) {
        //852

        // Problem: Peak Index in a Mountain Array
        // Given an integer array 'arr' of length 'n' that represents a mountain, find and return the index of the peak element.
        // A mountain is defined as an array that consists of a sequence of increasing elements followed by a sequence of decreasing elements.
        // The peak element is the element with the highest value in the array.
        // You must solve this problem using a binary search algorithm.

        int[] array = { 0, 10, 5, 2 };

        System.out.println(binerySerch(array));
    }

    static int binerySerch(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Perform binary search to find the peak element
        while (start < end) {
            int mid = start + (end - start) / 2;

            // If the middle element is less than the next element, move the start pointer to the right
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                // If the middle element is greater than or equal to the next element, move the end pointer to the left
                end = mid;
            }
        }

        // Return the index of the peak element
        return start;
    }
}