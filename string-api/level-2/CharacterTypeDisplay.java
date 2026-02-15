import java.util.Scanner;

public class CharacterTypeDisplay {

    // Method to check character type
    // Returns: "Vowel", "Consonant", or "Not a Letter"
    public static String checkCharType(char ch) {

        // Convert uppercase to lowercase using ASCII
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if letter
        if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }

        return "Not a Letter";
    }

    // Method to create 2D array of character and its type
    public static String[][] classifyCharacters(String text) {

        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            result[i][0] = String.valueOf(ch);      // character
            result[i][1] = checkCharType(ch);       // type
        }

        return result;
    }

    // Method to display 2D array in tabular format
    public static void displayTable(String[][] table) {

        System.out.println("\nCharacter\tType");
        System.out.println("------------------------");

        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t\t" + table[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.print("Enter the string: ");
        String text = sc.nextLine();

        // Create 2D array with character and type
        String[][] table = classifyCharacters(text);

        // Display result
        displayTable(table);

        sc.close();
    }
}
