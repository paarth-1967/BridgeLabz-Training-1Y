import java.util.Scanner;

public class FriendsAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input ages
        System.out.print("Enter Amar's age: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = sc.nextInt();

        // Input heights
        System.out.print("Enter Amar's height (in cm): ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter Akbar's height (in cm): ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter Anthony's height (in cm): ");
        double heightAnthony = sc.nextDouble();

        // Find youngest
        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";
        if (youngestAge == ageAmar) youngestFriend += "Amar ";
        if (youngestAge == ageAkbar) youngestFriend += "Akbar ";
        if (youngestAge == ageAnthony) youngestFriend += "Anthony ";

        // Find tallest
        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";
        if (tallestHeight == heightAmar) tallestFriend += "Amar ";
        if (tallestHeight == heightAkbar) tallestFriend += "Akbar ";
        if (tallestHeight == heightAnthony) tallestFriend += "Anthony ";

        // Output
        System.out.println("Youngest friend(s): " + youngestFriend.trim() + " with age " + youngestAge);
        System.out.println("Tallest friend(s): " + tallestFriend.trim() + " with height " + tallestHeight + " cm");

        sc.close();
    }
}
