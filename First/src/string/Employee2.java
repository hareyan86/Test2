package string;

public class Employee2 {
	
	public Employee2{
		this(1001);
		System.out.println("Default Constructor");
	}
	
	public Employee2(int id) {
		this("Java");
		System.out.println("My Id is : "+id);
		
	}

	public Employee2(String name) {
		
		System.out.println("My name is : "+name);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee2 e = new Employee2();

	}

}
