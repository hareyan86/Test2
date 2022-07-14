package first;
import java.util.*;


 class Parent {
	int a= 1; 
	int b= 2;
	int c,d;
}

 class Father extends Parent{
	
	void add() {
		c=a+b;
		System.out.println("Addition of two numbers are: "+c);
	}
}

 class Inherit extends Father{
	
	 void mul() {
		d=a+b;
		System.out.println("Multiplication of two numbers are: "+d);
	}
	 

	public void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Give the first number (A):");
		
		a = s.nextInt();
		System.out.println("Give the Second number (B):");
		b = s.nextInt();
				
		System.out.println("The two numbers are:");
		System.out.println("A: "+a);
		System.out.println("B: "+b);
		Inherit i = new Inherit();
		i.mul();
		i.add();

	}

}
