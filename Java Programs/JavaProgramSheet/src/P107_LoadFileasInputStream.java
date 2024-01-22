
import java.io.InputStream;
import java.io.FileInputStream;

public class P107_LoadFileasInputStream {

  public static void main(String args[]) {

    try {

      InputStream input = new FileInputStream("/home/roshan_patidar/FileOutputStream.OutputStream.txt");

      System.out.println("Data in the file: ");

     
      int i = input.available();

      while(i != -1) {
        System.out.print((char)i);

     
        i = input.read();
      }
      input.close();
    }

    catch(Exception e) {
      e.getStackTrace();
    }
  }
}