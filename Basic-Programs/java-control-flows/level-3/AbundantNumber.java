import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // b. Get input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // c. Initialize sum
        int sum = 0;

        // d. Run for loop from 1 to number-1
        for (int i = 1; i < number; i++) {
            // e. Check if i is a divisor
            if (number % i == 0) {
                sum += i; // f. Add divisor to sum
            }
        }

        // g. Check if sum of divisors is greater than number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }
    }
}
