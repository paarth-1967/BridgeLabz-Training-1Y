import java.util.Scanner;

public class FactorialForLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if the number is positive
        if (number < 0) {
            System.out.println("The number " + number + " is not a positive integer");
        } else {
            long factorial = 1; // Use long to handle larger factorials

            // Compute factorial using for loop
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }

            // Output
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        sc.close();
    }
}
