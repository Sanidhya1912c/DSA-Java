package Algorithms;

import java.util.Arrays;

public class LinearSerch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };

        int target = 9;
        // normal linear search
        System.out.println(linearSerch(arr, target));

        // search in range
        int[] range = { 1, 11 };
        System.out.println(serchInRange(arr, target, range));

        // find the minimum number
        System.out.println(minimumNumber(arr));

        // serching in 2D arrays
        int[][] arr2D = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target2D = 3;
        int[] ans = search2Darray(arr2D, target2D);
        System.out.println(Arrays.toString(ans));

        // even number of digits
        System.out.println(evenNumberOfDigits(arr));

    }

    // serch in the array: return the index if item found
    public static int linearSerch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;

        for (int index = 0; index < arr.length; index++) {
            int element = arr[index];

            if (element == target)
                return index;
        }

        return -1;
    }

    public static int serchInRange(int[] arr, int target, int[] range) {
        if (arr.length == 0)
            return -1;

        for (int index = range[0]; index <= range[1]; index++) {
            int element = arr[index];

            if (element == target)
                return index;
        }

        return -1;
    }

    public static int minimumNumber(int[] arr) {
        if (arr.length == 0)
            return -1;

        int minimumNumber = Integer.MAX_VALUE;

        for (int index : arr) {
            if (minimumNumber > index)
                minimumNumber = index;

        }

        return minimumNumber;
    }

    public static int[] search2Darray(int[][] arr, int target) {
        if (arr.length == 0)
            return new int[] { -1, -1 };

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                if (target == arr[row][column])
                    return new int[] { row, column };
            }
        }

        return new int[] { -1, -1 };
    }

    public static int evenNumberOfDigits(int[] arr) {
        if (arr.length == 0)
            return -1;

        int count = 0;

        for (int num : arr) {
            if (num < 0)
                num = num * -1;
            if (num == 0) {
                continue;
            }
            if ((int) (Math.log10(num) + 1) % 2 == 0) {
                count++;
            }

            // int digitCount = 0;

            // while (num > 0) {
            // digitCount++;
            // num /= 10;
            // }

            // if (digitCount % 2 == 0) {
            // count++;
            // }
        }

        return count;
    }
}