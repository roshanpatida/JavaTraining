import java.security.KeyStore.Entry;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public class P80_SortaMapByValues {


	  public static void main(String[] args) {

	    // create a map and store elements to it
	    LinkedHashMap<String, String> capitals = new LinkedHashMap();
	    capitals.put("Nepal", "Kathmandu");
	    capitals.put("India", "New Delhi");
	    capitals.put("United States", "Washington");
	    capitals.put("England", "London");
	    capitals.put("Australia", "Canberra");

	    // call the sortMap() method to sort the map
	    Map<String, String> result = sortMap(capitals);

	    result.forEach((key, value) -> {
	        System.out.print("Key: " + key);
	        System.out.println(" Value: " + value);
	    });

	  }

	  public static LinkedHashMap sortMap(LinkedHashMap map) {
		  List <Map.Entry<String, String>> capitalList = new LinkedList<>(map.entrySet());
	    // call the sort() method of Collections
	    Collections.sort(capitalList, (l1, l2) -> l1.getValue().compareTo(l2.getValue()));

	    // create a new map
	    LinkedHashMap<String, String> result = new LinkedHashMap();

	    // get entry from list to the map
	    for (Map.Entry<String, String> entry : capitalList) {
	      result.put(entry.getKey(), entry.getValue());
	    }

	    return result;
	  }
	}

