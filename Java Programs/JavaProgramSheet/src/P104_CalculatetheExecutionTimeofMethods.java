
public class P104_CalculatetheExecutionTimeofMethods {



	  public void display() {
	    System.out.println("Calculating Method execution time:");
	  }

	  public static void main(String[] args) {

		  P104_CalculatetheExecutionTimeofMethods obj = new P104_CalculatetheExecutionTimeofMethods();

	    long start = System.nanoTime();

	    obj.display();

	    long end = System.nanoTime();

	    long execution = end - start;
	    System.out.println("Execution time: " + execution + " nanoseconds");
	  }
	}