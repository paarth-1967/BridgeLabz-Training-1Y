import java.util.*;
public class FrequencyofElements {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the array");
        int n=sc.nextInt();
        System.out.println("Enter the "+n+" elements in the array");
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to find the frequency of");
        int k=sc.nextInt(),c=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==k)
            {
                c++;
            }
        }
        System.out.println("Frequency of given element is "+c);
    }
}
