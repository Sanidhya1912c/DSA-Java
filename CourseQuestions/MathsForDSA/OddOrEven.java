package MathsForDSA;

public class OddOrEven {
    public static void main(String[] args) {
        // given a number n find if its odd or even

        int n = 12;
        System.out.println(oddOrEvne(n));
    }

    static String oddOrEvne(int n) {
        return (n & 1) == 1 ? "The number is Odd" : "The number is even ";
    }
}
