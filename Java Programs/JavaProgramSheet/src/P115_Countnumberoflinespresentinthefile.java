
import java.io.File;
import java.util.Scanner;

class P115_Countnumberoflinespresentinthefile {
  public static void main(String[] args) {

    int count = 0;

    try {
            File file = new File("JavaFile.java");

  
      Scanner sc = new Scanner(file);

    
      while(sc.hasNextLine()) {
        sc.nextLine();
        count++;
      }
      System.out.println("Total Number of Lines: " + count);

     
      sc.close();
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}
