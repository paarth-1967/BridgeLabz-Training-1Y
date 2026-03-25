class BankAccount implements Runnable {
    private String name;
    private String type;

    public BankAccount(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        for (int i = 1; i <= 3; i++) {
            System.out.println(t.getName() + " (" + type + ", Priority: " + t.getPriority() + ") checking balance... [" + i + "]");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        Thread premium = new Thread(new BankAccount("User1", "Premium"));
        Thread regular = new Thread(new BankAccount("User2", "Regular"));
        Thread basic = new Thread(new BankAccount("User3", "Basic"));

        premium.setPriority(10);
        regular.setPriority(5);
        basic.setPriority(1);

        premium.start();
        regular.start();
        basic.start();
    }
}