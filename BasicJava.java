import java.util.Scanner;

public class BasicJava {
    public static void main(String[] args) {

        // 1.Input a year and find whether it is a leap year or not.
        // FindLeapYear();

        // 2.Take two numbers and print the sum of both.
        // SumOfTwoNumbers();

        // 3.Take a number as input and print the multiplication table for it.
        // MultiplicationTable();

        // 4.Take 2 numbers as inputs and find their HCF and LCM.
        // HCFandLCM();

        // 5.Keep taking numbers as inputs till the user enters ‘x’, after that print
        // sum of all.
        // SumOfAll();

        // 6. Write the fubunatchi table
        // System.out.println(Fibunatchi());

        // 7.Number of 7 occured :>
        // System.out.println(NumSevenOccured());

        // 8.Number reversel
        // System.out.println(NumberReversel());

        // 9. 3 digit armstrong number
        System.out.println(ArmstrongNumber());
    }

    public static void FindLeapYear() {

        try (Scanner sc = new Scanner(System.in)) {
            int year = sc.nextInt();

            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }
        }
    }

    public static void SumOfTwoNumbers() {
        try (Scanner sc = new Scanner(System.in)) {
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();

            int sum = num1 + num2;

            System.out.println("Sum of two numbers is :" + sum);
        }
    }

    public static void MultiplicationTable() {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            for (int i = 1; i <= 10; i++) {
                System.out.println(num * i);
            }
        }
    }

    public static void HCFandLCM() {
        try (Scanner sc = new Scanner(System.in)) {
            int largerNum = sc.nextInt();
            int smallerNum = sc.nextInt();

            int tem;
            int rem;
            int HCF = 1;
            int LCM = 0;

            // if first number is greater we switch the values so largerNum > smallerNum
            // always

            if (largerNum < smallerNum) {
                tem = largerNum;
                largerNum = smallerNum;
                smallerNum = tem;
            }

            while (HCF == smallerNum) {
                rem = largerNum % smallerNum;
                if (rem == 0) {
                    HCF = smallerNum;
                }
                largerNum = smallerNum;
                smallerNum = rem;
            }

            LCM = (largerNum * smallerNum) / HCF;
            System.out.println("HCF is :" + HCF);
            System.out.println("LCM is :" + LCM);
        }
    }

    public static void SumOfAll() {
        try (Scanner sc = new Scanner(System.in)) {
            int sum = 0;

            while (true) {
                String str = sc.nextLine();
                if ("x".equals(str)) {
                    System.out.println("The sum of all the number is :" + sum);
                } else {
                    sum += Integer.valueOf(str);
                }
            }

        }
    }

    public static Integer Fibunatchi() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the number of the Fibunatch");
            int num = sc.nextInt();

            int tempNum = 0;
            int finalNum = 1;

            // 0,1,1,2,3,5,8,13
            for (int i = 1; i < num; i++) {
                int temp = finalNum;
                finalNum += tempNum;
                tempNum = temp;
            }
            return finalNum;
        }
    }

    public static Integer NumSevenOccured() {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            int Num7Occured = 0;

            while (num > 0) {
                int rem = num % 10;
                if (rem == 7)
                    Num7Occured++;
                num /= 10;
            }

            return Num7Occured;
        }
    }

    public static Integer NumberReversel() {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();

            int finalNum = 0;

            while (num > 0) {
                int rem = num % 10;
                finalNum = finalNum * 10 + rem;
                num /= 10;
            }

            return finalNum;
        }
    }

    public static Boolean ArmstrongNumber() {
        try (Scanner sc = new Scanner(System.in)) {
            /*
             * What is armstrong number
             * let num = 153
             * it is equal to 1^3 + 5^3 + 3^3 = 153 
             * hence it is a armstrong number
             */

            int num = sc.nextInt();
            int temp = num;
            int rem;

            
            int answer = 0;
            
            while (temp > 0) {
                rem = temp % 10;
                temp /= 10;
                
                answer += rem * rem * rem;
            }
            
            return answer == num;
        }
    }
}
