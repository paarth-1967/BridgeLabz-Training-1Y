import java.util.*;

public class WelcomeMessage {
    public static void main(String[] args) {
        List<String> attendees = Arrays.asList("Aman", "Rahul", "Sneha");

        attendees.forEach(name ->
            System.out.println("Welcome " + name + "!"));
    }
}