package JavaConcepts;

public class Recursion {
    public static void main(String[] args) {
        // printing hello world n times
        // printHelloWorld(5);

        // print to number n in ascending order
        // printToN(10);

        // FIBONATCHI SERIESE using recursion
        // System.out.println(fibonatchi(7));

        // BINERY SEARCH using recurion
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int target = 7;
        System.out.println(binarySearch(arr, target, 0, arr.length - 1));

    }

    static void printHelloWorld(int n) {
        if (n == 0)
            return;
        System.out.println("Hello world ");
        printHelloWorld(n - 1);
    }

    static void printToN(int n) {
        if (n == 0) {
            return;
        }
        printToN(n - 1);

        System.out.print(n + " ");
    }

    static int fibonatchi(int n) {
        if (n < 2)
            return n;

        return fibonatchi(n - 1) + fibonatchi(n - 2);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {

        // base condition
        int mid = start + (end - start) / 2;
        if (arr[mid] == target)
            return mid;
        if (start > end)
            return -1;

        if (target < arr[mid]) {
            return binarySearch(arr, target, start, mid - 1);
        } else {
            return binarySearch(arr, target, mid + 1, end);
        }
    }
}
