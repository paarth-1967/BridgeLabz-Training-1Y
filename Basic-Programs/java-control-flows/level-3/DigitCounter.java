import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Get integer input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Handle negative numbers
        number = Math.abs(number);

        // b. Initialize count
        int count = 0;

        // Special case: if number is 0
        if (number == 0) {
            count = 1;
        }

        // c. Use loop until number becomes 0
        while (number != 0) {
            // d. Remove last digit
            number = number / 10;

            // e. Increment count
            count++;
        }

        // f. Display the count
        System.out.println("Number of digits: " + count);
    }
}
