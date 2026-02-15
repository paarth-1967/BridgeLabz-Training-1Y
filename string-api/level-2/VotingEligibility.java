import java.util.Scanner;

public class VotingEligibility {

    // a. Method to generate random 2-digit ages for n students
    public static int[] generateAges(int n) {

        int[] ages = new int[n];

        for (int i = 0; i < n; i++) {
            // Random 2-digit age (10 to 99)
            ages[i] = (int)(Math.random() * 90) + 10;
        }

        return ages;
    }

    // b. Method to check voting eligibility
    // Returns 2D String array: {Age, CanVote(true/false)}
    public static String[][] checkVotingEligibility(int[] ages) {

        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {

            result[i][0] = String.valueOf(ages[i]);

            if (ages[i] < 0) {
                result[i][1] = "false";
            } 
            else if (ages[i] >= 18) {
                result[i][1] = "true";
            } 
            else {
                result[i][1] = "false";
            }
        }

        return result;
    }

    // c. Method to display 2D array in tabular format
    public static void displayResult(String[][] data) {

        System.out.println("\nAge\tCan Vote");
        System.out.println("----------------");

        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }
    }

    // d. Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Generate ages
        int[] ages = generateAges(n);

        // Check voting eligibility
        String[][] votingStatus = checkVotingEligibility(ages);

        // Display result
        displayResult(votingStatus);

        sc.close();
    }
}
