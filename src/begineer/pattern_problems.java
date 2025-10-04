package begineer;

public class pattern_problems {

    public static void main(String[] args) {
        int n = 5;
        halfNumberPyramid(n);
        System.out.println();
        palindromicPattern(n);
        halfDiamondPattern(n);
    }

    // Half Number Pyramid
    // 1
    // 2 3
    // 3 4 5
    // 4 5 6 7
    // 5 6 7 8 9
    static void halfNumberPyramid(int n) {
        System.out.println("Half Number Pyramid:");

        for (int i = 1; i <= n; i++) {
            int count = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }

    //    1
    //   232
    //  34543
    // 4567654
    //567898765
    // Observation:
    // Every row start with value equal to row number.
    // We have to print n rows.
    // Every row has N-1 spaces. i number in increasing order followed by i-1 number
    // in decreasing order.
    // Use AP formula to solve all patern problem
    // a+(i-1)*d
    // Here space are like  4,3,2,1,0
    // 4 + (i-1)*(-1) = 4 -i +1 = 5 -i = N-i
    // 
    static void palindromicPattern(int n) {
        System.out.println("Palindromic Patter:");

        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // increasing numbers
            for (int j = 1; j <= i; j++) {
                System.out.print(i + j - 1);
            }
            // decreasing numbers
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(i + j - 1);
            }

            System.out.println();
        }

    }

    //    *
    //   ***
    //  *****
    // *******
    //*********

    static void halfDiamondPattern(int n) {
        for (int i = 1; i <= n; i++) {

            // Print Space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 1,3,5,7
            // a = 1
            // d = a[2] - a[1] = 2
            // i = ithTerm
            // a+(i-1)*d
            // 1 + (i-1) * 2 
            // 2i -1
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(("*"));
            }
            System.out.println();
        }
    }
}
