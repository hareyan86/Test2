package string;


public class Reverse {  
public static String reverseString(String str){  
    char ch[]=str.toCharArray();  
    String rev="";  
    for(int i=ch.length-1;i>=0;i--){  
        rev+=ch[i];  
    }  
    return rev;  
}  

public static void main(String[] args) {  
	Reverse sf = new Reverse();
    System.out.println(sf.reverseString("my name is Hari"));  
    System.out.println(sf.reverseString("Testing String Reverse"));      
    }  
}
