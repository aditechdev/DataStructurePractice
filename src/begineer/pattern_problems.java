package begineer;

public class pattern_problems {

    public static void main(String[] args) {
        half_number_pyramid(5);
    }

    // Half Number Pyramid
    // 1
    // 2 3
    // 3 4 5
    // 4 5 6 7
    // 5 6 7 8 9
    static void half_number_pyramid(int n) {
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
}
