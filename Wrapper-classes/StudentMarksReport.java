import java.util.*;

public class StudentMarksReport {
    public static void main(String[] args) {
        Object[] marks = {"85", 95, Integer.valueOf(88), "null"};

        ArrayList<Integer> valid = new ArrayList<>();

        for (Object m : marks) {
            try {
                if (m instanceof String) {
                    if (!m.equals("null"))
                        valid.add(Integer.parseInt((String) m));
                } else if (m instanceof Integer) {
                    valid.add((Integer) m);
                }
            } catch (Exception ignored) {}
        }

        double avg = valid.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Average marks: " + avg);
    }
}