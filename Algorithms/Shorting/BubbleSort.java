package Algorithms.Shorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 12, 7, 1, 7, 9 };
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr) {
        boolean swapped; // Flag to check if any swapping occurred in a pass
        for (int i = 0; i < arr.length; i++) {
            swapped = false; // Reset the flag for each pass
            for (int j = 1; j < arr.length - i; j++) {
                // Compare adjacent elements and swap if they are in wrong order
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    swapped = true; // Set the flag to true if a swap occurred
                }
            }
            // If no two elements were swapped in a pass, then the array is already sorted
            if (!swapped)
                break;
        }
    }
}