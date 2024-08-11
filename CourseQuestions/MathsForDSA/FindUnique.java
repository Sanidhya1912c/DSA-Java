package MathsForDSA;

public class FindUnique {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 4, 5, 2, 4, 5 };

        System.out.println(findUnique(arr));
    }

    static int findUnique(int[] arr) {
        int unique = 0;

        for (int n : arr) {
            unique ^= n;
        }

        return unique;
    }
}
