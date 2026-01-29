import java.util.Scanner;

public class FactorsOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        // Check if number is positive
        if (number <= 0) {
            System.out.println("The number " + number + " is not a positive integer");
        } else {
            System.out.println("Factors of " + number + " are:");

            int counter = 1; // Initialize counter

            // While loop to find factors
            while (counter <= number) { // include the number itself
                if (number % counter == 0) {
                    System.out.println(counter);
                }
                counter++; // Increment counter
            }
        }

        sc.close();
    }
}
