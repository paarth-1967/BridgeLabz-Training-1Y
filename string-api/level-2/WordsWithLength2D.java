import java.util.Scanner;

public class WordsWithLength2D {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            // stop when index goes out of range
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] splitUsingCharAt(String text) {

        int len = findLength(text);

        // Count words
        int wordCount = 1;
        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Store space indexes
        int[] spaceIndex = new int[wordCount + 1];
        int idx = 0;
        spaceIndex[idx++] = -1;

        for (int i = 0; i < len; i++) {
            if (text.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[idx] = len;

        // Extract words
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

    // Method to create 2D array of word and its length
    public static String[][] wordsWithLength(String[] words) {

        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];                         // word
            result[i][1] = String.valueOf(findLength(words[i])); // length as String
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step a: Take input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Step b: Split text into words
        String[] words = splitUsingCharAt(text);

        // Step d: Create 2D array
        String[][] table = wordsWithLength(words);

        // Step e: Display in tabular format
        System.out.println("\nWord\tLength");
        System.out.println("---------------");

        for (int i = 0; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]); // convert String → int
            System.out.println(table[i][0] + "\t" + length);
        }

        sc.close();
    }
}
