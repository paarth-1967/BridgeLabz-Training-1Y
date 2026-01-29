import java.util.Scanner;

public class GreatestFactorWhile {
    public static void main(String[] args) {

        // Get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize variables
        int greatestFactor = 1;
        int counter = number - 1;

        // While loop from number-1 down to 1
        while (counter >= 1) {
            if (number % counter == 0) {
                greatestFactor = counter;
                break;
            }
            counter--;
        }

        // Display the result
        System.out.println("Number: " + number + " Greatest Factor: " + greatestFactor);
    }
}
