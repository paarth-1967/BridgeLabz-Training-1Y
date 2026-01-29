import java.util.Scanner;

public class MultiplesBelow100While {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        // Check valid input
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Enter a positive number less than 100.");
        } else {

            // Initialize counter
            int counter = 100;

            // While loop from 100 to 1
            while (counter > 1) {
                if (counter % number == 0) {
                    System.out.println(counter);
                }
                counter--;
            }
        }
    }
}
