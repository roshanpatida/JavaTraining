
	import java.io.File;

	class P111_DeleteEmptyandNone_mptyDirectory {
	  public static void main(String[] args) {

	    try {
	      	      File directory = new File("JavaFile.java");

	      boolean result = directory.delete();

	      if(result) {
	        System.out.println("Directory Deleted");
	      }
	      else {
	        System.out.println("Directory not Found");
	      }

	    } catch (Exception e) {
	      e.getStackTrace();
	    }
	  }
	}