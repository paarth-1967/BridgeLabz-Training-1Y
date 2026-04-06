import java.util.*;

public class WrapperConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer: ");
        int num = sc.nextInt();

        Integer obj = num; // auto-boxing

        System.out.println("Primitive: " + num);
        System.out.println("Wrapper: " + obj);
    }
}