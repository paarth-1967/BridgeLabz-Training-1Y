import java.util.*;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        int[] ages = {22, 45, 18, 30};

        ArrayList<Integer> list = new ArrayList<>();

        for (int age : ages) {
            list.add(age);
        }

        System.out.println("Youngest: " + Collections.min(list));
        System.out.println("Oldest: " + Collections.max(list));
    }
}