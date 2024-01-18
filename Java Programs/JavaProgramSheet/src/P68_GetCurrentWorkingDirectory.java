import java.nio.file.Paths;

public class P68_GetCurrentWorkingDirectory {
public static void main(String[] args) {
	String path  = Paths.get("").toAbsolutePath().toString();
	
//	String path1 = System.getProperty("user.dir"); 
	System.out.println(path);
	
}
}
