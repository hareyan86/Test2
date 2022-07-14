package first;

import java.util.*;


public class SampleMutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = new String("Hello");
int ms = System.identityHashCode(s);
System.out.println("Memory of Given String S is : "+ms);
String s1 = new String("Hello");
int ms1 = System.identityHashCode(s1);
System.out.println("Memory of Given String S1 is : "+ms1);
StringBuffer s2 = new StringBuffer ("Hello");
StringBuffer res = s2.append(s1);
System.out.println(res);
int mres = System.identityHashCode(res);
System.out.println("Memory of Concatenated String is : "+mres);
	}

}