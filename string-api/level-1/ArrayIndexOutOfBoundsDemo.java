import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names) {

        // Accessing index beyond array length
        System.out.println(names[names.length]);
    }

    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names) {

        try {
            // Again accessing invalid index
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught and handled.");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException caught.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step a: Take array size
        System.out.print("Enter number of names: ");
        int n = sc.nextInt();

        String[] names = new String[n];

        // Take array input
        System.out.println("Enter names:");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }

        // Step d: Call method to generate exception
        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        try {
            generateException(names);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception occurred in generateException().");
        }

        // Call method to handle exception
        System.out.println("\nHandling ArrayIndexOutOfBoundsException safely:");
        handleException(names);

        sc.close();
    }
}
