import java.util.Scanner;

public class SplitTextComparison {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            // stop counting
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {

        int len = findLength(text);

        // Step i: Count words
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount + 1];
        int idx = 0;
        spaceIndex[idx++] = -1; // start boundary

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[idx] = len; // end boundary

        // Step ii: Extract words
        String[] words = new String[wordCount];
        for (int i = 0; i < wordCount; i++) {
            String word = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                word += text.charAt(j);
            }
            words[i] = word;
        }

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] a, String[] b) {

        if (a.length != b.length) {
            return false;
        }

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step a: Take input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // User-defined split
        String[] manualSplit = splitUsingCharAt(text);

        // Built-in split
        String[] builtInSplit = text.split(" ");

        // Compare results
        boolean result = compareStringArrays(manualSplit, builtInSplit);

        // Display words
        System.out.println("\nWords using charAt():");
        for (String word : manualSplit) {
            System.out.println(word);
        }

        System.out.println("\nWords using split():");
        for (String word : builtInSplit) {
            System.out.println(word);
        }

        // Final result
        System.out.println("\nAre both results equal? " + result);

        sc.close();
    }
}
