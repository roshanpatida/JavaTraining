import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P69_ConvertMapHashMaptoList {
public static void main(String[] args) {
	
	Map<Integer,String> map = new HashMap<Integer,String>();
	map.put(1, "a");
    map.put(2, "d");
    map.put(3,"e");
    
    List<Integer> keys =  new ArrayList<Integer>(map.keySet());
    List<String> values = new ArrayList<String>(map.values());
    
    System.out.println("keys: " + keys);
    System.out.println("values: ");
 }
}
