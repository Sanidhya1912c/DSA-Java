package CourseQuestions.Linear;

public class EvenNumberOfDigits {

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };

        // even number of digits
        System.out.println(evenNumberOfDigits(arr));

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

        }

        return count;
    }
}
