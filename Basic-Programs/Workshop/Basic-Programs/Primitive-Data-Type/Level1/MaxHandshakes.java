import java.util.Scanner;

public class MaxHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take number of students as input
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Calculate maximum number of handshakes using combination formula
        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        // Display result
        System.out.println(
            "The maximum number of handshakes among " + numberOfStudents +
            " students is " + maxHandshakes
        );

        input.close();
    }
}
