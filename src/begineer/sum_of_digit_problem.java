package begineer;

public class sum_of_digit_problem {

    public static void main(String[] args) {
        sumOfDigitProblem(35435);
    }

    static void sumOfDigitProblem(int number) {

        int sume = 0;
        int newNumber = number;

        while (newNumber != 0) {
            sume = sume + (newNumber % 10);
            newNumber = newNumber / 10;
            System.out.println("Sume: " + sume);
            System.out.println("NewNumber = " + newNumber);
        }

    }

    // Swap number
    static void swapNumber(int newNumber) {
    }
}
