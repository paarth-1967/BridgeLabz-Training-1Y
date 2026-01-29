import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Get input number
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // b. Initialize sum and store original number
        int sum = 0;
        int originalNumber = number;

        // c. Use while loop until originalNumber becomes 0
        while (originalNumber != 0) {
            // d. Find each digit
            int digit = originalNumber % 10;

            // Find cube of digit and add to sum
            sum += digit * digit * digit;

            // e. Remove last digit
            originalNumber = originalNumber / 10;
        }

        // f. Check if sum equals the original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }
    }
}
