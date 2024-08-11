package CyclicSort;

import java.util.ArrayList;

public class MissingElements {
    public static void main(String[] args) {

        int[] arr = { 1, 5, 2, 2, 2, 8, 4, 6 };
        ArrayList<Integer> ans = cyclicSort(arr);

        for (int i : ans) {
            System.out.print(i + ",");
        }

    }

    static ArrayList<Integer> cyclicSort(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<Integer>();

        for (int i = 0; i < arr.length;) {
            int correct = arr[i] - 1;

            if (correct < arr.length && arr[i] != arr[correct]) {

                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;

            } else {
                i++;
            }
        }
        // [0,1,2,3,4,5,6,7]
        // [1,2,3,4,3,2,7,8]

        // ans should be [5,6]
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i + 1) {
                answer.add(i + 1);
            }
        }

        return answer;
    }
}
