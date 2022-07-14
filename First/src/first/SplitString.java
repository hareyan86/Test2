package first;

public class SplitString {
	
	public static void main(String args[]) {

	String str = "HARIHARAN";
	String[] re = str.split("A");
	System.out.println("Result is:");
	for(String s:re) {
		System.out.println(s+" , ");
	}
	}
}

/*Output:
Result is:
H , 
RIH , 
R , 
N , */
