import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String text) {

        // start index > end index
        System.out.println(text.substring(5, 2));
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String text) {

        try {
            // start index > end index
            System.out.println(text.substring(5, 2));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught and handled.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step a: Take input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Step d: Call method to generate exception
        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(text);
        } catch (IllegalArgumentException e) {
            System.out.println("Exception occurred in generateException().");
        }

        // Call method to handle exception
        System.out.println("\nHandling IllegalArgumentException safely:");
        handleException(text);

        sc.close();
    }
}
