package DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Array_ArrayLists {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = { 0, 1, 2, 3 };

            // // ways to print arrays
            // // 1. for each
            for (int i : arr) {
                System.out.println(i); // for each in java
            }
            // // 2. .toString()
            System.out.println(Arrays.toString(arr));

            // Arrays of objects
            String[] anotherArr = new String[5];

            for (int i = 0; i < anotherArr.length; i++) {
                anotherArr[i] = sc.next();
            }

            System.out.println(Arrays.toString(anotherArr));

            // Multidimensional arrays
            int[][] multiArr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
            System.out.println(multiArr);

            // Taking input for multidimonsional arrays

            int[][] arr2D = new int[3][3];

            for (int i = 0; i < arr2D.length; i++) {
                for (int j = 0; j < arr2D[i].length; j++) {
                    arr2D[i][j] = sc.nextInt();
                }
            }

            // // Outputting arrays
            for (int i = 0; i < arr2D.length; i++) {
                for (int j = 0; j < arr2D[i].length; j++) {
                    System.out.print(arr2D[i][j] + " ");
                }
                System.out.println();
            }

            // declearing new array
            // syntex
            // dataType[] arrayName = new dataType[size];
            // int[] example = new int[10];

            // int[] array; // declarations
            // array = new int[10]; // initializations

            // Array lists
            ArrayList<String> arrList = new ArrayList<String>();

            // Array list methods

            arrList.add("Shiva");
            arrList.get(0);
            arrList.remove(0);
            arrList.size();
            // arrList.set(index, valus)

            // Multidimensional arrayList 3 x 3

            ArrayList<ArrayList<String>> arrList2D = new ArrayList<>();

            for (int i = 0; i < 3; i++) {
                arrList2D.add(new ArrayList<String>());
            }

            // Exercise Swap

            int[] Array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

            reverseArr(Array);

            swap(Array, 2, 4);
        }

    }

    public static void reverseArr(int[] arr) {
        int min = 0;
        int max = arr.length - 1;

        int arrMid = arr.length % 2 == 0 ? arr.length / 2 : (arr.length - 1) / 2;

        for (int i = 0; i < arrMid; i++) {

            int temp = arr[min];
            arr[min] = arr[max];
            arr[max] = temp;
            min++;
            max--;

        }

        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        System.out.println(Arrays.toString(arr));
    }

}
