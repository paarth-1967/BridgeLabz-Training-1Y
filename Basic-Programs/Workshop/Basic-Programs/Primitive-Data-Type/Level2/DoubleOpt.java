import java.util.Scanner;

public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for a, b, and c as double
        System.out.print("Enter value for a: ");
        double a = input.nextDouble();

        System.out.print("Enter value for b: ");
        double b = input.nextDouble();

        System.out.print("Enter value for c: ");
        double c = input.nextDouble();

        // Compute double operations
        double result1 = a + b * c;   // Multiplication first, then addition
        double result2 = a * b + c;   // Multiplication first, then addition
        double result3 = c + a / b;   // Division first, then addition
        double result4 = a % b + c;   // Modulus first, then addition

        // Print the results
        System.out.println(
            "The results of Double Operations are " +
            result1 + ", " + result2 + ", " + result3 + ", and " + result4
        );

        input.close();
    }
}
