package first;

public class SampleImmutableString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Hello";
int ms = System.identityHashCode(s);
System.out.println("Memory of Given String S is : "+ms);
String s1 = "Hello";
int ms1 = System.identityHashCode(s1);
System.out.println("Memory of Given String S1 is : "+ms1);
String res =s.concat(s1);
System.out.println(res);
int mres = System.identityHashCode(res);
System.out.println("Memory of Concatenated String is : "+mres);
	}

}

/*Memory of Given String S is : 925858445
Memory of Given String S1 is : 925858445
HelloHello
Memory of Concatenated String is : 798154996*/
