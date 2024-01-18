
import java.io.BufferedInputStream;
import java.io.FileInputStream;

class P109_ReadtheContentofaFileLinebyLine {
  public static void main(String[] args) {
    try {

      FileInputStream file = new FileInputStream("JavaFile.java");

      BufferedInputStream input = new BufferedInputStream(file);

      int i = input .read();

      while (i != -1) {
        System.out.print((char) i);

        i = input.read();
      }
      input.close();
    }

    catch (Exception e) {
      e.getStackTrace();
    }
  }
}