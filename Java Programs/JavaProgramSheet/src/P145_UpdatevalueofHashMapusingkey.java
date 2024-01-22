
import java.util.HashMap;

class P145_UpdatevalueofHashMapusingkey {
  public static void main(String[] args) {

    HashMap<String, Integer> numbers = new HashMap<>();
    numbers.put("First", 1);
    numbers.put("Second", 2);
    numbers.put("Third", 3);
    System.out.println("HashMap: " + numbers);

  
    int value = 5;


  
    numbers.put("Second", value);
    System.out.println("HashMap with updated value: " + numbers);
  }
}