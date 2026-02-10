class Scope{
	int a = 10; //instance
	static int b = 20; //static
	
	void show(){
	int c = 30; //local
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
}
public static void main(String[]args){
	Scope obj = new Scope();
	obj.show();
}
}

	
	
	