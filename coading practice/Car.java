class Car {
	int price;
	String brand;
	void display(){
		System.out.println("the brand is" +brand);
		System.out.println("the price is" +price);
	}
	public static void main(String[]args){
		Car c1 = new Car();
		c1.brand = "BMW";
		c1.price = 5000000;
		c1.display();
	}
}

		
	
	