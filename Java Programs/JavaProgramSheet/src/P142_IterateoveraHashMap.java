
import java.util.HashMap;
import java.util.Map.Entry;

class P142_IterateoveraHashMap {
  public static void main(String[] args) {

   
    HashMap<String, String> languages = new HashMap<>();
    languages.put("Java", "Enterprise");
    languages.put("Python", "ML/AI");
    languages.put("JavaScript", "Frontend");
    System.out.println("HashMap: " + languages);

    
    System.out.print("Entries: ");
    for(Entry<String, String> entry: languages.entrySet()) {
      System.out.print(entry);
      System.out.print(", ");
    }

  }
}