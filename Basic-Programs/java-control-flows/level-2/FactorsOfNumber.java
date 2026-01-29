import java.util.Scanner;

public class FactorsOfNumber {
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

            // Loop to find factors
            for (int i = 1; i <= number; i++) { // include number itself
                if (number % i == 0) {
                    System.out.println(i);
                }
            }
        }

        sc.close();
    }
}
