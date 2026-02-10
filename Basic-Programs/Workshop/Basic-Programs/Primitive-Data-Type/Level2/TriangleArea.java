import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take base and height in cm from user
        System.out.print("Enter the base of the triangle in cm: ");
        double baseCm = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double heightCm = input.nextDouble();

        // Calculate area in square centimeters
        double areaCm2 = 0.5 * baseCm * heightCm;

        // Convert area to square inches (1 inch = 2.54 cm)
        double areaIn2 = areaCm2 / (2.54 * 2.54);

        // Display results
        System.out.println(
            "The Area of the triangle in sq in is " + areaIn2 +
            " and sq cm is " + areaCm2
        );

        input.close();
    }
}
