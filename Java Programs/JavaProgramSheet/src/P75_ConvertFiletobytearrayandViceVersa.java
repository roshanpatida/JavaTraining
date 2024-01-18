import java.io.FileInputStream;
import java.io.IOException;

public class P75_ConvertFiletobytearrayandViceVersa {
public static void main(String[] args) throws IOException {
	FileInputStream fis  = new FileInputStream("/home/roshan_patidar/IOStream/FileOutput.txt");
	byte  arr[] = new byte[fis.available()];
	fis.read(arr);
	String s = new String(arr);
 System.out.println(s);
 fis.close();
	
	
}
	
}
