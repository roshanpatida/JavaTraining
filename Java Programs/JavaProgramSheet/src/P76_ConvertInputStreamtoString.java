import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class P76_ConvertInputStreamtoString {
public static void main(String[] args) throws IOException {
	String path = "/home/roshan_patidar/IOStream/FileOutput.txt";
	FileInputStream fis = new FileInputStream(path);
	InputStreamReader fsr = new InputStreamReader(fis);
	char[] ch = new char[(int)path.length() ];
     fsr.read(ch);
     String s = new String(ch);
     System.out.println(s);
}
}
