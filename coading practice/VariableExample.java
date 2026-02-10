class VariableExample{ //class keyword with class name
	
	int id = 1001;
	String name = "paarth" 
	static  int age = 20;//static variable
	
	void display()  //method
	{
		String status = "Active"; //local variable
System.out.println("status:" + status); // printing statement
	}
	public static void main(String []args){
		VariableExamples var = new VariableExample();
		var.display();
		System.out.println(age);
	
	}
}


	