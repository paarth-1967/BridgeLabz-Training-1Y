import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // b. Get input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number; // Store original number
        int sum = 0; // c. Initialize sum

        // d. Use while loop to access each digit
        while (number != 0) {
            int digit = number % 10; // Get last digit
            sum += digit; // e. Add digit to sum
            number = number / 10; // Remove last digit
        }

        // f. Check divisibility
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }
    }
}
