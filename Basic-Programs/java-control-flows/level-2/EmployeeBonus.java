import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input salary and years of service
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter years of service: ");
        int yearsOfService = sc.nextInt();

        double bonus = 0.0;

        // Check if years of service is more than 5 to give 5% bonus
        if (yearsOfService > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        // Output bonus
        System.out.println("The bonus amount is: " + bonus);

        sc.close();
    }
}
