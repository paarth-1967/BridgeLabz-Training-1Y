import java.util.*;

class Ticket extends Thread {
    private int id;
    private String type;
    private int priority;

    public Ticket(int id, String type, int priority) {
        this.id = id;
        this.type = type;
        this.priority = priority;
        setPriority(priority);
    }

    public void run() {
        Random r = new Random();
        int time = (r.nextInt(5) + 1) * 1000;

        System.out.println("Ticket " + id + " (" + type + ", Priority: " + priority + ") started by " + getName());

        try {
            Thread.sleep(time);
        } catch (Exception e) {}

        System.out.println("Ticket " + id + " completed in " + time + " ms");
    }
}

public class SupportSystem {
    public static void main(String[] args) {
        String[] types = {"Critical Bug", "Feature Request", "General Query", "Feedback"};
        int[] priorities = {10, 4, 2, 1};

        List<Ticket> tickets = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int idx = new Random().nextInt(4);
            Ticket t = new Ticket(i, types[idx], priorities[idx]);
            tickets.add(t);
        }

        // Sort by priority (highest first)
        tickets.sort((a, b) -> b.getPriority() - a.getPriority());

        for (Ticket t : tickets) {
            t.start();
        }
    }
}