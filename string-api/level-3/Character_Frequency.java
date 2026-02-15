import java.util.Scanner;

public class Character_Frequency {

    // Method to find frequency of characters
    static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();      // store characters
        int[] freq = new int[chars.length];     // store frequencies

        // Nested loops to calculate frequency
        for (int i = 0; i < chars.length; i++) {
            freq[i] = 1;

            if (chars[i] == '0') {
                continue;
            }

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // mark duplicate
                }
            }
        }

        // Create 1D String array to store result
        String[] result = new String[chars.length];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index] = chars[i] + " = " + freq[i];
                index++;
            }
        }

        return result;
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        String[] output = findFrequency(input);

        System.out.println("\nCharacter Frequencies:");
        for (String s : output) {
            if (s != null) {
                System.out.println(s);
            }
        }

        sc.close();
    }
}
