

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class P105_ConvertaStringintotheInputStream {

  public static void main(String args[]) {

   
    String name = "Programiz";
    System.out.println("String is: " + name);

    try {

      InputStream stream = new ByteArrayInputStream(name.getBytes(StandardCharsets.UTF_8));
      System.out.println("InputStream: " + stream);

   

    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}