package first;

import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 0, b = 1, c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the count for Fibonacci Series:");
		int count = s.nextInt();
		System.out.println(a);
		System.out.println(b);
		for(int i=1; i<=count;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(a);
			
			
		}
	}

}
