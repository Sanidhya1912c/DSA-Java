package Pattern;

public class Patterns {
    public static void main(String[] args) {
        pattern31(4);

    }

    static void pattern31(int n) {
        /*
         * 4 4 4 4 4 4 4
         * 4 3 3 3 3 3 4
         * 4 3 2 2 2 3 4
         * 4 3 2 1 2 3 4
         * 4 3 2 2 2 3 4
         * 4 3 3 3 3 3 4
         * 4 4 4 4 4 4 4
         */

        for (int i = n * 2 - 1; i > 0; i--) {
            for (int j = n * 2 - 1; j > 0; j--) {
                int atEveryIndex = Math.min(Math.min(i, j), Math.min(n * 2 - i, n * 2 - j));

                System.out.print(atEveryIndex + "  ");
            }
            System.out.println();
        }

    }

    static void pattern13(int n) {

        // The formeter not letting me comment the exact pattern so sorry ig

        /*
         *
         * *
         * *
         * *
         *********
         */

    }

    static void pattern12(int n) {

        // The formeter not letting me comment the exact pattern so sorry ig

        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        for (int i = n; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern11(int n) {
        /*
         * * * * *
         * * * *
         * * *
         * *
         *
         */
        for (int i = n; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    static void pattern10(int n) {
        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

    }

    static void pattern9(int n) {
        /*
        *********
         *******
          *****
           ***
            *
         */

        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = (i - 1) * 2; j >= 0; j--) {
                System.out.print("*");

            }
            System.out.println("");
        }
    }

    static void pattern8(int n) {
        /*
            *
           ***
          *****
         *******
        *********
        */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= (i - 1) * 2; j++) {
                System.out.print("*");

            }
            System.out.println("");
        }

    }

    static void pattern7(int n) {
        /*
         ******
           ****
            ***
             **
              *
         */

        for (int i = n; i >= 1; i--) {
            for (int j = n - i; j >= 1; j--) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern6(int n) {
        /*
            *
           **
          ***
         ****
        ***** 
        */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    static void pattern5(int n) {
        // *
        // **
        // ***
        // ****
        // *****
        // ****
        // ***
        // **
        // *
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }

        for (int i = n - 1; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print('*');
            }
            System.out.println("");
        }
    }

    static void pattern4(int n) {
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

    }

    static void pattern3(int n) {
        // *****
        // ****
        // ***
        // **
        // *

        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print('*');
            }
            System.out.println("");
        }
    }

    static void pattern2(int n) {
        // *
        // **
        // ***
        // ****
        // *****

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println("");
        }
    }

    static void pattern1(int n) {
        // *****
        // *****
        // *****
        // *****
        // *****

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
