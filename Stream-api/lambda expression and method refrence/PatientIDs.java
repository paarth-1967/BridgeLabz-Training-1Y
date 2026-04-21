import java.util.*;

public class PatientIDs {
    public static void main(String[] args) {
        List<Integer> patientIds = Arrays.asList(101, 102, 103, 104);

        // Lambda
        // patientIds.forEach(id -> System.out.println(id));

        // Method Reference
        patientIds.forEach(System.out::println);
    }
}