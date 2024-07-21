package CourseQuestions.CyclicSort;

import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 2, 2, 2, 4, 4, 3, 3 };

        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {

                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        ArrayList<Integer> dublicates = new ArrayList<Integer>();

        int lastDublicate = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                if (lastDublicate != arr[j]) {
                    dublicates.add(arr[j]);
                    lastDublicate = arr[j];
                }
            }
        }

        for (int k : dublicates) {
            System.out.print(k + ",");
        }
    }
}
