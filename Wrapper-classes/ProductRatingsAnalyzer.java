import java.util.*;

public class ProductRatingsAnalyzer {
    public static void main(String[] args) {
        int[] arr = {4, 5, 3};
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, null, 4));

        ArrayList<Integer> combined = new ArrayList<>();

        for (int x : arr) combined.add(x);

        for (Integer x : list) {
            if (Objects.nonNull(x)) combined.add(x);
        }

        double avg = combined.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Average rating: " + avg);
    }
}