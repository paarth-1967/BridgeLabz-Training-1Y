import java.util.*;
import java.util.stream.*;

public class UppercaseNames {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("rahul", "aman", "sneha");

        List<String> upperNames = names.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());

        upperNames.forEach(System.out::println);
    }
}