import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class P73_AppendTextoanExistingFile {
public static void main(String[] args) throws IOException {
	FileWriter fos = new FileWriter("/home/roshan_patidar/IOStream/FileOutput/fileoutput.txt");
	String str = "Roshan Patidar";
	fos.write(str);
	fos.close();
}
}
