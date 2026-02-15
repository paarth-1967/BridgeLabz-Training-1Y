import java.util.Scanner;

public class AnagramCheck {

    // Method to check if two strings are anagrams
    static boolean isAnagram(String text1, String text2) {

        // Step i: Check length
        if (text1.length() != text2.length()) {
            return false;
        }

        // Step ii: Frequency arrays (for lowercase letters)
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Step iii: Find frequency of characters
        for (int i = 0; i < text1.length(); i++) {
            freq1[text1.charAt(i) - 'a']++;
            freq2[text2.charAt(i) - 'a']++;
        }

        // Step iv: Compare frequencies
        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first text: ");
        String text1 = sc.nextLine();

        System.out.print("Enter second text: ");
        String text2 = sc.nextLine();

        if (isAnagram(text1, text2)) {
            System.out.println("\nResult: The texts are Anagrams");
        } else {
            System.out.println("\nResult: The texts are NOT Anagrams");
        }

        sc.close();
    }
}
