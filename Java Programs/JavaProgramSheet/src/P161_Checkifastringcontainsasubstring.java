
public class P161_Checkifastringcontainsasubstring {
public static void main(String[] args) {
	String str = "Hello how are you";
	String subString  = "how";
	
	
	if(str.contains(subString)) {
		System.out.println("String is contains substring");
		
	}
	else {
		System.out.println("String is not contains substring");
	}
}
}
