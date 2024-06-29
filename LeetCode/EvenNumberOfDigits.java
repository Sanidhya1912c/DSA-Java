package LeetCode;

public class EvenNumberOfDigits {
    //1295
    
    // Problem: Count Numbers with Even Number of Digits
    // Given an array of integers 'arr', return the count of numbers in the array that have an even number of digits.

    // Example:
    // Input: arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17]
    // Output: 10
    // Explanation: The numbers with an even number of digits are 2, 4, 6, 8, 10, 12, 14, 16, 10, and 12.

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17 };

        // Count the numbers with even number of digits
        System.out.println(evenNumberOfDigits(arr));
    }

    public static int evenNumberOfDigits(int[] arr) {
        if (arr.length == 0)
            return -1;

        int count = 0;

        // Iterate through each number in the array
        for (int num : arr) {
            // Make the number positive if it is negative
            if (num < 0)
                num = num * -1;

            // Skip the number 0
            if (num == 0) {
                continue;
            }

            // Calculate the number of digits using logarithm
            // If the number of digits is even, increment the count
            if ((int) (Math.log10(num) + 1) % 2 == 0) {
                count++;
            }
        }

        return count;
    }
}