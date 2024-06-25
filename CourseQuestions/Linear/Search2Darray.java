package CourseQuestions.Linear;

import java.util.Arrays;

public class Search2Darray {
    public static void main(String[] args) {
        int[][] arr2D = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int target2D = 3;

        int[] ans = search2Darray(arr2D, target2D);
        System.out.println(Arrays.toString(ans));
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
}
