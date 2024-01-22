
import java.io.InputStream;
import java.util.Arrays;
import java.io.ByteArrayInputStream;

public class P106_ConverttheInputStreamintoByteArray {

  public static void main(String args[]) {

    try {
      // create an input stream
      byte[] input = {1, 2, 3, 4};
      InputStream stream = new ByteArrayInputStream(input);

      // Display the contents of the byte array
      System.out.println("Input Stream Contents: " + Arrays.toString(input));

      // convert the input stream to byte array
      byte[] array = stream.readAllBytes();
      System.out.println("Byte Array: " + Arrays.toString(array));

      stream.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
