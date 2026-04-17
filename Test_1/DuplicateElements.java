import java.util.*;

public class DuplicateElements{
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Apple");
        list.add("Mango");
        list.add("Banana");

        System.out.println("Original List: " + list);

        Set<String> set = new HashSet<>(list);

        ArrayList<String> uniqueList = new ArrayList<>(set);

        System.out.println("After Removing Duplicates: " + uniqueList);
    }
}
