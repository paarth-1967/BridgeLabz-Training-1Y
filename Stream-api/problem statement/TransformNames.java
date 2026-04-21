import java.util.*;

public class TransformNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul", "aman", "sneha");

        names.stream()
             .map(String::toUpperCase)
             .sorted()
             .forEach(System.out::println);
    }
}