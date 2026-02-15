import java.util.Scanner;

public class CharacterFrequency {

    // a. Method to find frequency of characters
    public static String[][] findFrequency(String text) {

        int[] freq = new int[256];

        // i & ii. Count frequency
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            freq[ch]++;
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] != 0) {
                count++;
                freq[text.charAt(i)] = 0;
            }
        }

        // Reset frequency array
        freq = new int[256];
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // iii & iv. Store characters and frequencies
        String[][] result = new String[count][2];
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (freq[ch] != 0) {
                result[index][0] = String.valueOf(ch);
                result[index][1] = String.valueOf(freq[ch]);
                index++;
                freq[ch] = 0;
            }
        }

        return result;
    }

    // b. Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[][] result = findFrequency(text);

        System.out.println("\nCharacter Frequency");
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " : " + result[i][1]);
        }

        sc.close();
    }
}
