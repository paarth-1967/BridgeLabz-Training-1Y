import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number less than 100: ");
        int number = sc.nextInt();

        // Check valid input
        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Enter a positive number less than 100.");
        } else {

            // Loop backward from 100 to 1
            for (int i = 100; i >= 1; i--) {
                if (i % number == 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
