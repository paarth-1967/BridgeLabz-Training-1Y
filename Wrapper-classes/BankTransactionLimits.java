public class BankTransactionLimits {
    public static double getLimit(Double limit) {
        return (limit == null) ? 0.0 : limit;
    }

    public static void main(String[] args) {
        System.out.println(getLimit(null));
        System.out.println(getLimit(5000.0));
    }
}