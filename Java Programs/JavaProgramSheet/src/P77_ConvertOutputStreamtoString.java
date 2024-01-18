import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class P77_ConvertOutputStreamtoString {
public static void main(String[] args) throws IOException {
	String path = "/home/roshan_patidar/IOStream/FileOutput.txt";
	ByteArrayOutputStream bos = new ByteArrayOutputStream();
	String s = "hello roshan";
	
	bos.write(s.getBytes());
	String Final = new String(bos.toByteArray());
  System.out.println(Final);
	
}
}
