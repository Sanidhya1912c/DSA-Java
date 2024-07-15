package Algorithms.Shorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = { 4, 12, 7, 1, 7, 9 };
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr) {
        // Iterate over the array from the beginning to the second-to-last element.
        for (int i = 0; i < arr.length; i++) {
            // Calculate the index of the last unsorted element.
            int last = arr.length - i - 1;
            // Initialize the index of the maximum element found so far to the first element.
            int maxIndex = 0;

            // Iterate over the unsorted part of the array.
            for (int j = 0; j <= last; j++) {
                // If the current element is greater than the maximum element found so far,
                // update the maxIndex to the current index.
                if (arr[maxIndex] < arr[j]) {
                    maxIndex = j;
                }
            }

            // Swap the maximum element found with the last unsorted element.
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }
    }

}
