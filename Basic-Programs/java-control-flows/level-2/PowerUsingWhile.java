import java.util.Scanner;

public class PowerUsingWhile {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Get inputs
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power: ");
        int power = sc.nextInt();

        // Initialize variables
        int result = 1;
        int counter = 0;

        // Calculate power using while loop
        while (counter < power) {
            result = result * number;
            counter++;
        }

        // Display result
        System.out.println(number + " raised to the power " + power + " is: " + result);
    }
}
