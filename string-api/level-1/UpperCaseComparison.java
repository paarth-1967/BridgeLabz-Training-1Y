import java.util.Scanner;

public class UpperCaseComparison {

    // Method to convert text to uppercase using charAt() and ASCII logic
    public static String toUpperUsingCharAt(String text) {

        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // Check if character is lowercase
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch - 32);
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

        // Step b: User-defined uppercase conversion
        String manualUpper = toUpperUsingCharAt(text);

        // Step d: Built-in method
        String builtInUpper = text.toUpperCase();

        // Step c & d: Compare both strings
        boolean result = compareStrings(manualUpper, builtInUpper);

        // Display results
        System.out.println("\nUppercase using charAt(): " + manualUpper);
        System.out.println("Uppercase using toUpperCase(): " + builtInUpper);
        System.out.println("Are both results equal? " + result);

        sc.close();
    }
}
