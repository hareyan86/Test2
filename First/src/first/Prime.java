package first;

import java.util.*;
public class Prime {
	int a, c=0; 

	public void findPrime(int n) {
		a = n/2;
		if (n==0||n==1)
			System.out.println("Given number " +n+ " is not a prime");
		else {
			for (int i =2; i < a ; i++) 
			{
				if (n%i ==0) {
					System.out.println("Given number " +n+ " is not a prime");
					c=1;
				}
				break;
			}
			
			if (c==0)	
				System.out.println("Given number " +n+ " is a prime");
			
			
			}
		}
	
	public static void main(String args[]) {
		Prime p = new Prime();
		p.findPrime(10);
		p.findPrime(53);
		p.findPrime(15);
		
	}
	
}


/* Output: 
Given number 10 is not a prime
Given number 15 is not a prime
Given number 15 is not a prime*/


