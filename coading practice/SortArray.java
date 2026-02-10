import java.util.Arrays;

class SortArray {
    public static void main(String[] args) {
        int[] a = {5, 2, 8, 1};

        Arrays.sort(a);

        for (int x : a) {
            System.out.println(x);
        }
    }
}
