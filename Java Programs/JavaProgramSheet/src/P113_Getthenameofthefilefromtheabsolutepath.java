
import java.io.File;

class P113_Getthenameofthefilefromtheabsolutepath {

  public static void main(String[] args) {

        File file = new File("/home/roshan_patidar/FileOutputStream.OutputStream.txt");

 
    String fileName = file.getName();
    System.out.println("File Name: " + fileName);

  }
}