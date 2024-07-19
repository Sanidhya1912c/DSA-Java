package CourseQuestions.CyclicSort;

public class MissingNumber {
    public static void main(String[] args) {

        int[] arr = { 0, 1 };
        int ans = cyclicSort(arr);
        System.out.println(ans);
    }

    static int cyclicSort(int[] arr) {
        for (int i = 0; i < arr.length;) {
            int correct = arr[i];

            if (correct < arr.length && arr[i] != arr[correct]) {

                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;

            } else {
                i++;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                return i;
            }
        }

        return arr.length;
    }
}
