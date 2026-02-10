import java.util.Scanner;
class average{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int[]marks = new int[n];
		int sum = 0;
		 for (int i = 0; i < n; i++) {
            marks[i] = sc.nextInt();
            sum += marks[i];
        }

        double avg = sum / (double)n;
        System.out.println(avg);
    }
}

		
		