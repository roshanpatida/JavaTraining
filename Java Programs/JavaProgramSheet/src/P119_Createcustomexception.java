class CustomException extends Exception{
	
	public CustomException(String  message) {
	super(message);
	}
}
public class P119_Createcustomexception {

	
	public static void checkNumber(int number)  throws CustomException{
	  	if(number>20) {
	  		throw new CustomException("Invalid number");
	  	}
	  	else {
	  		System.out.println("valid number");
	  	}
	}
	
	public static void main(String[] args) {
		try {
			checkNumber(24);
		}
		catch (CustomException e) {
			System.out.println("Exception occured" + e);
		}
	}

}
