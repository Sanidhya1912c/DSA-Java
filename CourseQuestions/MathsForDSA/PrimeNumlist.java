package MathsForDSA;

import java.util.ArrayList;

public class PrimeNumlist {
    public static void main(String[] args) {
        int num = 100;
        System.out.println(primeList(num));
    }

    static ArrayList<Integer> primeList(int n) {
        ArrayList<Integer> arrList = new ArrayList<Integer>(0);

        if (n <= 0)
            return new ArrayList<Integer>();

        for (int i = 1; i < n; i++) {
            if (prime(i)) {
                arrList.add(i);
            }
        }
        return arrList;
    }

    static boolean prime(int n) {
        if (n <= 0)
            return false;

        int c = 2;
        while (c * c <= Math.sqrt(n)) {
            if (n % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }

}
