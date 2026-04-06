import java.util.*;

public class PerformanceBenchmark {
    public static void main(String[] args) {
        int n = 1000000;

        long start1 = System.currentTimeMillis();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;

        long sum1 = 0;
        for (int x : arr) sum1 += x;
        long end1 = System.currentTimeMillis();

        long start2 = System.currentTimeMillis();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) list.add(i);

        long sum2 = 0;
        for (Integer x : list) sum2 += x;
        long end2 = System.currentTimeMillis();

        System.out.println("int[] time: " + (end1 - start1) + " ms");
        System.out.println("ArrayList time: " + (end2 - start2) + " ms");
    }
}