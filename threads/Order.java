class Order implements Runnable {
    private int id;
    private String restaurant;
    private int deliveryTime;

    public Order(int id, String restaurant, int deliveryTime) {
        this.id = id;
        this.restaurant = restaurant;
        this.deliveryTime = deliveryTime;
    }

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        long start = System.currentTimeMillis();

        System.out.println("Order " + id + " picked up by " + t.getName());
        try { Thread.sleep(deliveryTime * 1000); } catch (Exception e) {}

        System.out.println("Order " + id + " in transit...");
        try { Thread.sleep(1000); } catch (Exception e) {}

        System.out.println("Order " + id + " delivered!");

        long end = System.currentTimeMillis();
        System.out.println("Total time for Order " + id + ": " + (end - start) + " ms\n");
    }
}

public class FoodDelivery {
    public static void main(String[] args) {
        Thread o1 = new Thread(new Order(1, "KFC", 2));
        Thread o2 = new Thread(new Order(2, "Dominos", 3));
        Thread o3 = new Thread(new Order(3, "Pizza Hut", 1));
        Thread o4 = new Thread(new Order(4, "Burger King", 4));
        Thread o5 = new Thread(new Order(5, "Subway", 2));

        o1.setPriority(10); // Express
        o2.setPriority(5);
        o3.setPriority(3);
        o4.setPriority(5);
        o5.setPriority(3);

        o1.start();
        o2.start();
        o3.start();
        o4.start();
        o5.start();
    }
}