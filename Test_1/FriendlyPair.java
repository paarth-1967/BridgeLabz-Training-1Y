import java.util.*;
public class FriendlyPair {
    public static void main(String[]args)
    {
        System.out.println("Enter two numbers :");
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int sum1=0,sum2=0;
        for(int i=1;i<n1;i++)
        {
            if(n1%i==0)
            {
                sum1+=i;

            }
        }
        for(int i=1;i<n2;i++)
        {
            if(n2%i==0)
            {
                sum2+=i;
            }
        }
        int num1=sum1/n1;
        int num2=sum2/n2;
        if(num1==1&&num2==1)
        {
            System.out.println("Friendly Pair");
        }
        else {
            System.out.println("Not a friendly pair");
        }
    }
}
