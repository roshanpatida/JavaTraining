

import java.util.HashMap;
import java.util.Map.Entry;

class P147_GetkeyfromHashMapusingthevalue {
  public static void main(String[] args) {

   
    HashMap<String, Integer> numbers = new HashMap<>();
    numbers.put("One", 1);
    numbers.put("Two", 2);
    numbers.put("Three", 3);
    System.out.println("HashMap: " + numbers);


    Integer value = 3;

   
    for(Entry<String, Integer> entry: numbers.entrySet()) {

   
      if(entry.getValue() == value) {
        System.out.println("The key for value " + value + " is " + entry.getKey());
        break;
      }
    }
  }
}