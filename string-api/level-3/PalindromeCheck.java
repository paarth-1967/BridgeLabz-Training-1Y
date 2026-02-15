import java.util.Scanner;

public class PalindromeCheck {

    // LOGIC 1: Using loop and start-end comparison
    static boolean isPalindromeLoop(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // LOGIC 2: Using recursion
    static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method to reverse string using charAt()
    static char[] reverseString(String text) {
        char[] reverse = new char[text.length()];
        int index = 0;

        for (int i = text.length() - 1; i >= 0; i--) {
            reverse[index++] = text.charAt(i);
        }
        return reverse;
    }

    // LOGIC 3: Using character arrays
    static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    // MAIN METHOD
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text: ");
        String input = sc.nextLine();

        System.out.println("\nPalindrome Check Results:");

        System.out.println("Logic 1 (Loop): " +
                (isPalindromeLoop(input) ? "Palindrome" : "Not Palindrome"));

        System.out.println("Logic 2 (Recursion): " +
                (isPalindromeRecursive(input, 0, input.length() - 1)
                        ? "Palindrome" : "Not Palindrome"));

        System.out.println("Logic 3 (Character Array): " +
                (isPalindromeArray(input) ? "Palindrome" : "Not Palindrome"));

        sc.close();
    }
}
