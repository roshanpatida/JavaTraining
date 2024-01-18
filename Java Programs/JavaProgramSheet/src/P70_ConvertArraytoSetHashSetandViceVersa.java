import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class P70_ConvertArraytoSetHashSetandViceVersa {
public static void main(String[] args) {
	String[] arr= {"a","f","e"};
	
//	Set<String> set  = new HashSet<String>(Arrays.asList(arr));
	Set<String> set = new HashSet<String>(Arrays.stream(arr).collect(Collectors.toList()));
  System.out.println(set);
}
}
