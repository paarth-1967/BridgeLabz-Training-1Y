class Student{
	String name;
	int id;
	int age;
	void display(){
		System.out.println("your id is: "+ id);
		System.out.println("your name is: "+ name);
		system.out.println("your age is:"+ age);
		
	}
	public static void main(String[]args){
		Student s1 = new Student();
		s1.id = 1001;
		s1.name = "paarth";
		s1.age = 19;
		s1.display();
	}
        }