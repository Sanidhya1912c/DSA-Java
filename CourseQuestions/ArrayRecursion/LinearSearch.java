package ArrayRecursion;

public class LinearSearch {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 5, 7, 8 };

        int target = 70;

        System.out.println(linearSearch(arr, target, 0));

    }

    static boolean linearSearch(int[] arr, int target, int index) {

        if (index == arr.length - 1) {
            if (arr[index] == target) {
                return true;
            } else {
                return false;
            }
        }

        return arr[index] == target || linearSearch(arr, target, index + 1);
    }
}