public class PrimitiveConversion {
    public static void main(String[] args) {
        Double obj = 45.67;

        double d = obj; // unboxing
        int i = (int) d; // casting

        System.out.println("Double value: " + d);
        System.out.println("Integer value: " + i);
    }
}