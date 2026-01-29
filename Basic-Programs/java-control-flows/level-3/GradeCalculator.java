import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input marks for 3 subjects
        System.out.print("Enter marks for Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = sc.nextInt();

        // Calculate total and average
        int total = physics + chemistry + maths;
        double average = total / 3.0;

        // Calculate percentage
        double percentage = (total / 300.0) * 100; // assuming each subject is out of 100

        // Determine grade and remarks
        String grade, remarks;

        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Average";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Pass";
        } else {
            grade = "F";
            remarks = "Fail";
        }

        // Display results
        System.out.println("\n--- Result ---");
        System.out.println("Physics: " + physics);
        System.out.println("Chemistry: " + chemistry);
        System.out.println("Maths: " + maths);
        System.out.printf("Average Marks: %.2f%n", average);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}
