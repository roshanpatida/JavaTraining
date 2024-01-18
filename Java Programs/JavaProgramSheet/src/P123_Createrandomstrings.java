import java.util.Random;

public class P123_Createrandomstrings {
public static void main(String[] args) {
	String alphabates = "ABCDEFGHIJKLMNOPQRSTWXYZ";
	
	StringBuilder sb = new StringBuilder();
	 Random random = new Random();
	 int length = 7;
	 
	 for(int i =0; i<length-1;i++) {
		 int index = random.nextInt(alphabates.length());
		 
		 char randomchar = alphabates.charAt(index);
		 
		sb.append(randomchar);
		
		
	 }
	 
	 String randomString = sb.toString();
	 
	 System.out.println(randomString);
}
}
