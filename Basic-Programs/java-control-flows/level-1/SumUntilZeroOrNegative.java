import java.util.Scanner;

public class SumUntilZeroOrNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0.0;

        while (true) {
            // Take user input
            System.out.print("Enter a number (0 or negative to stop): ");
            double number = sc.nextDouble();

            // Check for 0 or negative number
            if (number <= 0) {
                break; // exit the loop
            }

            // Add to total
            total += number;
        }

        // Output
        System.out.println("The total sum is " + total);

        sc.close();
    }
}
