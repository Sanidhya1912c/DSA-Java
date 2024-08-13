package MathsForDSA;

public class FindingSQURT {
    public static void main(String[] args) {
        int num = 40;
        System.out.println(findingSQURT(num, 2));

    }

    static double findingSQURT(int n, int p) {
        int start = 0;
        int end = n;

        double ans = 0.0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == n) {
                return mid;
            }

            if (mid * mid > n) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        double incr = 0.1;

        for (int i = 0; i < p; i++) {
            while (ans * ans <= n) {
                ans += incr;
            }
            ans -= incr;
            incr /= 10;
        }

        return ans;
    }

}
