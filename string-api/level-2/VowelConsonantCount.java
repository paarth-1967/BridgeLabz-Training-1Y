import java.util.Scanner;

public class VowelConsonantCount {

    // Method to check character type
    // Returns: 1 = Vowel, 2 = Consonant, 0 = Not a Letter
    public static int checkChar(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if letter
        if (ch >= 'a' && ch <= 'z') {

            // Check vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return 1; // Vowel
            } else {
                return 2; // Consonant
            }
        }

        return 0; // Not a letter
    }

    // Method to count vowels and consonants using charAt()
    // Returns array: [vowelCount, consonantCount]
    public static int[] countVowelsAndConsonants(String text) {

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            int result = checkChar(ch);

            if (result == 1) {
                vowelCount++;
            } else if (result == 2) {
                consonantCount++;
            }
        }

        return new int[] { vowelCount, consonantCount };
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the string: ");
        String text = sc.nextLine();

        // Call user-defined method
        int[] result = countVowelsAndConsonants(text);

        // Display result
        System.out.println("\nVowels count: " + result[0]);
        System.out.println("Consonants count: " + result[1]);

        sc.close();
    }
}
