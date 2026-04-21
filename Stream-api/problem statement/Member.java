import java.time.*;
import java.util.*;

class Member {
    String name;
    LocalDate expiryDate;

    Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }
}

public class ExpiringMemberships {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("Aman", LocalDate.now().plusDays(10)),
            new Member("Rahul", LocalDate.now().plusDays(40)),
            new Member("Sneha", LocalDate.now().plusDays(20))
        );

        LocalDate today = LocalDate.now();

        members.stream()
               .filter(m -> m.expiryDate.isBefore(today.plusDays(30)))
               .forEach(m -> System.out.println(m.name));
    }
}