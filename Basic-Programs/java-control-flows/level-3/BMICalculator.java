import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a. Take user input for weight and height
        System.out.print("Enter weight in kg: ");
        double weight = sc.nextDouble();

        System.out.print("Enter height in cm: ");
        double heightCm = sc.nextDouble();

        // Convert height from cm to meters
        double heightM = heightCm / 100.0;

        // b. Calculate BMI
        double bmi = weight / (heightM * heightM);

        // c. Determine weight status
        String status;

        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi >= 18.5 && bmi < 25) {
            status = "Normal weight";
        } else if (bmi >= 25 && bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }

        // Display BMI and weight status
        System.out.printf("BMI: %.2f%n", bmi);
        System.out.println("Weight Status: " + status);
    }
}
