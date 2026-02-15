import java.util.Scanner;

public class StringLengthWithoutMethod {

    // Method to find length without using length()
    public static int findLength(String text) {

        int count = 0;

        try {
            while (true) {           // infinite loop
                text.charAt(count);  // access character
                count++;
            }
        } catch (RuntimeException e) {
            // Exception occurs when index is out of range
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step a: Take input
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Step c: Call user-defined method
        int manualLength = findLength(text);

        // Built-in method
        int builtInLength = text.length();

        // Display results
        System.out.println("\nLength without using length(): " + manualLength);
        System.out.println("Length using length(): " + builtInLength);

        sc.close();
    }
}
