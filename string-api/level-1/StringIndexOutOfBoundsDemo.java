import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {

        // Accessing index beyond string length
        System.out.println(text.charAt(text.length()));
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String text) {

        try {
            // Again accessing invalid index
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught and handled.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step a: Take input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Step d: Call method to generate exception
        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        try {
            generateException(text);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException().");
        }

        // Call method to handle exception
        System.out.println("\nHandling StringIndexOutOfBoundsException safely:");
        handleException(text);

        sc.close();
    }
}
