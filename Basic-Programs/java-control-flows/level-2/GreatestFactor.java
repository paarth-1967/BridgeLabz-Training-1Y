import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {

        // Get input from the user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Initialize greatestFactor
        int greatestFactor = 1;

        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        // Display the result
        System.out.println("Number: " + number + " Greatest Factor: " + greatestFactor);
    }
}
