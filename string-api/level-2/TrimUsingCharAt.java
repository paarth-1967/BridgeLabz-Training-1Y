import java.util.Scanner;

public class TrimUsingCharAt {

    // Method to find start and end index after trimming spaces
    // Returns int array: {startIndex, endIndex}
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[] { start, end };
    }

    // Method to create substring using charAt()
    public static String substringUsingCharAt(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
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

        // Take user input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Step a: Find trim indexes
        int[] indexes = findTrimIndexes(text);

        // Step b: Create trimmed string manually
        String manualTrim = substringUsingCharAt(text, indexes[0], indexes[1]);

        // Step d: Built-in trim()
        String builtInTrim = text.trim();

        // Step c & d: Compare both results
        boolean result = compareStrings(manualTrim, builtInTrim);

        // Display results
        System.out.println("\nTrimmed using charAt(): [" + manualTrim + "]");
        System.out.println("Trimmed using trim():   [" + builtInTrim + "]");
        System.out.println("Are both results equal? " + result);

        sc.close();
    }
}
