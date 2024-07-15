package Algorithms.Searching;

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

    

    
}