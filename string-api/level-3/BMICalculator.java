import java.util.Scanner;

public class BMICalculator {

    // b. Method to calculate BMI and Status
    public static String[][] calculateBMI(double[][] data) {

        String[][] result = new String[data.length][4];

        for (int i = 0; i < data.length; i++) {

            double weight = data[i][0];
            double heightCm = data[i][1];
            double heightM = heightCm / 100;

            double bmi = weight / (heightM * heightM);
            bmi = Math.round(bmi * 100) / 100.0;

            String status;
            if (bmi <= 18.4)
                status = "Underweight";
            else if (bmi <= 24.9)
                status = "Normal";
            else if (bmi <= 39.9)
                status = "Overweight";
            else
                status = "Obese";

            result[i][0] = String.valueOf(weight);
            result[i][1] = String.valueOf(heightCm);
            result[i][2] = String.valueOf(bmi);
            result[i][3] = status;
        }
        return result;
    }

    // d. Display method
    public static void display(String[][] result) {

        System.out.println("\nBMI Report");
        System.out.println("-----------------------------------------------");
        System.out.println("Weight\tHeight\tBMI\t\tStatus");
        System.out.println("-----------------------------------------------");

        for (int i = 0; i < result.length; i++) {
            System.out.println(
                result[i][0] + "\t" +
                result[i][1] + "\t" +
                result[i][2] + "\t\t" +
                result[i][3]
            );
        }
    }

    // e. Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int persons = 10;
        double[][] data = new double[persons][2];

        // a. Take input
        for (int i = 0; i < persons; i++) {
            System.out.print("Enter weight (kg) for person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) for person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();
        }

        // c. Call BMI calculation
        String[][] result = calculateBMI(data);

        // d. Display result
        display(result);

        sc.close();
    }
}
