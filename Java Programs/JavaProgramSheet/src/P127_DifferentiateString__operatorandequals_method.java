
public class P127_DifferentiateString__operatorandequals_method {
public static void main(String[] args) {
	String str1 = new String("hello");
	String str2 = new String("hello");
	
	boolean b1= (str1==str2);
	boolean b2 = str1.equals(str2);
	
	System.out.println(b1);
	System.out.println(b2);
}
}
