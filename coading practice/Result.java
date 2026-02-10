import java.util.Scanner;
class Result{
public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	int marks = sc.nextInt();
	if (marks >= 40)
	System.out.println("pass");
	else
	System.out.println("fail");
	sc.close();
}
}

