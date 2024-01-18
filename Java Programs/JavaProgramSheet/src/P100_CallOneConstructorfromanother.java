
public class P100_CallOneConstructorfromanother {



	  int sum;

	
	  P100_CallOneConstructorfromanother() {
	
	    this(5, 2);
	  }

	
	  P100_CallOneConstructorfromanother(int arg1, int arg2) {
	
	    this.sum = arg1 + arg2;
	  }

	  void display() {
	    System.out.println("Sum is: " + sum);
	  }

	
	  public static void main(String[] args) {

	
	    P100_CallOneConstructorfromanother obj = new P100_CallOneConstructorfromanother();

	
	    obj.display();
	  }
	}