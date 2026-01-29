import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Check for Gregorian calendar
        if (year < 1582) {
            System.out.println("Leap Year calculation is valid only for year >= 1582");
        } else {

            // -------- Approach 1: Multiple if-else --------
            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year");
            } else if (year % 100 == 0) {
                System.out.println("Year is not a Leap Year");
            } else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year");
            } else {
                System.out.println("Year is not a Leap Year");
            }

            // -------- Approach 2: Single if with logical operators --------
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("(Logical Check) Year is a Leap Year");
            } else {
                System.out.println("(Logical Check) Year is not a Leap Year");
            }
        }
    }
}


