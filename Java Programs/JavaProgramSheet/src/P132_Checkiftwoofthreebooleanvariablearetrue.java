
public class P132_Checkiftwoofthreebooleanvariablearetrue { 
	public static void main(String[] args) {
		
	
	boolean b1 = true;
	boolean b2 =  true;
	boolean b3 = false;
     boolean result;
     
     if(b1 ==  true) {
    	 result = b2||b3;
     }
     else {
    	 result = b2&&b3;
     }
     if(result == true) {
     System.out.println("two boolean variable are true");
     }
     else {
    	 System.out.println("two boolean variable are not true");
     }
}
}