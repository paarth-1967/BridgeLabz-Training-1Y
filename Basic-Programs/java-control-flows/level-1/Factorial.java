import java.util.Scanner;

public class Factorial {
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
            int i = 1;

            // Compute factorial using while loop
            while (i <= number) {
                factorial *= i;
                i++;
            }

            // Output
            System.out.println("Factorial of " + number + " is " + factorial);
        }

        sc.close();
    }
}
