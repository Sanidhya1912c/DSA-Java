package LeetCode;

public class CeilingOfALetter {
    public static void main(String[] args) {
        // Problem: Find Smallest Letter Greater Than Target
        // Given a sorted array of unique characters 'letters' and a target character 'target', find the smallest letter in the array that is greater than the target.
        // If there is no letter greater than the target, return the first letter of the array.

        char[] letters = { 'd', 'f', 'x' };
        char target = 'a';

        System.out.println(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        // Perform binary search to find the smallest letter greater than the target
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        // Return the smallest letter greater than the target
        // If there is no letter greater than the target, return the first letter of the array
        return letters[start % letters.length];
    }
}