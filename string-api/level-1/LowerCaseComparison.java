import java.util.Scanner;

public class LowerCaseComparison {

    // Method to convert text to lowercase using charAt() and ASCII logic
    public static String toLowerUsingCharAt(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            result += ch;
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step a: Take complete text input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Step b: User-defined lowercase conversion
        String manualLower = toLowerUsingCharAt(text);

        // Step d: Built-in method
        String builtInLower = text.toLowerCase();

        // Step c & d: Compare both strings
        boolean result = compareStrings(manualLower, builtInLower);

        // Display results
        System.out.println("\nLowercase using charAt(): " + manualLower);
        System.out.println("Lowercase using toLowerCase(): " + builtInLower);
        System.out.println("Are both results equal? " + result);

        sc.close();
    }
}
