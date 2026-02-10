class Marks{
	public static void main(String[]args){
		int []a = {50,60,70,80,90}; 
		int max = a[0];
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (a[i] > max){
				max = a[i];
			}
			if(a[i] < min){
				min = a[i];
			}
			
		}
		System.out.println(max);
			System.out.println(min);
	}
}

				
				
		
