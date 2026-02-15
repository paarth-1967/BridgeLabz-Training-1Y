import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate NumberFormatException
    public static void generateException(String text) {

        // This will throw NumberFormatException if text is not numeric
        int number = Integer.parseInt(text);
        System.out.println("Converted number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught and handled.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step a: Take input as String
        System.out.print("Enter a value: ");
        String text = sc.next();

        // Step e: Call method to generate exception
        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Exception occurred in generateException().");
        }

        // Call method to handle exception
        System.out.println("\nHandling NumberFormatException safely:");
        handleException(text);

        sc.close();
    }
}
