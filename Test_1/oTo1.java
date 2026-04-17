import java.util.*;
public class oTo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num1 = sc.nextInt();
        String str = Integer.toString(num1);
        str = str.replace('0', '1');
        int num2 = Integer.parseInt(str);
        System.out.println(num2);
    }
}
