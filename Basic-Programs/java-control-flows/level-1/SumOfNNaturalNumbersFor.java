import java.util.Scanner;

public class SumOfNNaturalNumbersFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Check if n is a natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number");
        } else {
            // Compute sum using for loop
            int sumLoop = 0;
            for (int i = 1; i <= n; i++) {
                sumLoop += i;
            }

            // Compute sum using formula
            int sumFormula = n * (n + 1) / 2;

            // Print both results
            System.out.println("Sum using for loop: " + sumLoop);
            System.out.println("Sum using formula: " + sumFormula);

            // Compare the results
            if (sumLoop == sumFormula) {
                System.out.println("Both computations are correct and match.");
            } else {
                System.out.println("There is a mismatch in the computations.");
            }
        }

        sc.close();
    }
}
