import java.time.LocalDateTime;
import java.util.*;

public class TransactionLogger {
    public static void main(String[] args) {
        List<Integer> transactionIds = Arrays.asList(101, 102, 103);

        transactionIds.forEach(id ->
            System.out.println(id + " at " + LocalDateTime.now()));
    }
}