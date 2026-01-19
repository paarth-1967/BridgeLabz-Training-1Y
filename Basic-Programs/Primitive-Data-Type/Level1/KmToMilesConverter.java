import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        double km;  // variable to store kilometers
        Scanner input = new Scanner(System.in);  // Scanner object for user input

        System.out.print("Enter distance in kilometers: ");
        km = input.nextDouble();  // read user input

        double miles = km / 1.6;  // 1 mile = 1.6 km

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
        input.close(); // close the scanner
    }
}
