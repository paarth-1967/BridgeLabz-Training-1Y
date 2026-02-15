import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            // stop when index goes out of bounds
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

        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    // Method to find shortest and longest word indexes
    // Returns int array: {shortestIndex, longestIndex}
    public static int[] findShortestAndLongest(String[][] table) {

        int shortestIndex = 0;
        int longestIndex = 0;

        int minLen = Integer.parseInt(table[0][1]);
        int maxLen = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);

            if (len < minLen) {
                minLen = len;
                shortestIndex = i;
            }

            if (len > maxLen) {
                maxLen = len;
                longestIndex = i;
            }
        }

        return new int[] { shortestIndex, longestIndex };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Step a: Take input
        System.out.print("Enter the text: ");
        String text = sc.nextLine();

        // Step b: Split text
        String[] words = splitUsingCharAt(text);

        // Step d: Create 2D array
        String[][] table = wordsWithLength(words);

        // Step e: Find shortest and longest
        int[] result = findShortestAndLongest(table);

        // Step f: Display results
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + table[i][1]);
        }

        System.out.println("\nShortest word: " 
                + table[result[0]][0] + " (Length: " + table[result[0]][1] + ")");

        System.out.println("Longest word: " 
                + table[result[1]][0] + " (Length: " + table[result[1]][1] + ")");

        sc.close();
    }
}
