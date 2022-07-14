package first;

public class Employee {
	double salary=40000.00;
	
}
class Programmer extends Employee{
	int bonus = 10000;
	public static void main (String args[]) {
		Programmer p= new Programmer();
		System.out.println("Programmer Salary is"+p.salary);
		System.out.println("Programmer Bonus is"+p.bonus);
	}
}

