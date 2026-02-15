import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    // b. Method to find first non-repeating character
    public static char firstNonRepeatingChar(String text) {

        int[] freq = new int[256]; // ASCII characters

        // ii. Count frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // iii. Find first non-repeating character
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] == 1) {
                return ch;
            }
        }

        return '\0'; // No non-repeating character
    }

    // c. Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.next();

        char result = firstNonRepeatingChar(text);

        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        sc.close();
    }
}
