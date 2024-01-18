
public class P40_ReverseaSentenceUsingRecursion {

public static String reverse(String s) {
	int index = s.indexOf(" ");
	if(index == -1) {
		return s;
	}
return reverse(s.substring(index+1)) +" " +s.substring(0,index);
}
public static void main(String[] args) {
	String s = "Roshan patidar from Maheshwar";
	System.out.println(reverse(s));
	System.out.println(s.substring(6));
	
}
	
//public static void main(String[] args) {
//	String s = "My name is Roshan Patidar";
//	s= s +" ";
//	String word = "" ,rev="";
//	for(int i =0;i<s.length();i++) {
//		char ch = s.charAt(i);
//      if(ch != ' ') {
//    	  word = word + ch; 
//      }
//      else {
//    	  rev = word + " "+ rev;
//    	  word = "";
//      }
//	}


//}
	}