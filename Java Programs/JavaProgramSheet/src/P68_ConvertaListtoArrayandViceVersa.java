import java.util.ArrayList;
import java.util.List;

public class P68_ConvertaListtoArrayandViceVersa {
public static void main(String[] args) {
	 ArrayList list = new ArrayList<>();
	list.add("2");
	list.add("43");
	list.add("32");
	list.add("4");
	String[] arr = new String[list.size()];
	
	list.toArray(arr);
	
	
	for(String array : arr) {
		System.out.print(array);
	}
}
}
