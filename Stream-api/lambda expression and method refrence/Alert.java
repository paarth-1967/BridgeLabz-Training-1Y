import java.util.*;
import java.util.function.Predicate;

class Alert {
    String message;
    String type; // critical, normal

    Alert(String message, String type) {
        this.message = message;
        this.type = type;
    }
}

public class NotificationFilter {
    public static void main(String[] args) {
        List<Alert> alerts = Arrays.asList(
            new Alert("Heart Rate High", "critical"),
            new Alert("Medicine Reminder", "normal"),
            new Alert("Low Oxygen Level", "critical")
        );

        // Filter only critical alerts
        Predicate<Alert> isCritical = a -> a.type.equals("critical");

        alerts.stream()
              .filter(isCritical)
              .forEach(a -> System.out.println(a.message));
    }
}