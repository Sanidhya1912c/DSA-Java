package Algorithms;


public class LinearSerch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };

        int target = 11;
        System.out.println(linearSerch(arr, target));
        

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
}