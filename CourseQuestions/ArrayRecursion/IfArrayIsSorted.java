package ArrayRecursion;

public class IfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println((isArraySorted(arr, 0)));

    }

    static Boolean isArraySorted(int[] arr, int index) {

        if (index == arr.length - 1) {
            return true;
        }

        return arr[index] < arr[index + 1] && isArraySorted(arr, index + 1);
    }
}
