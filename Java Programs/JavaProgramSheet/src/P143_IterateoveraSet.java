
import java.util.Set;
import java.util.HashSet;


class P143_IterateoveraSet {
  public static void main(String[] args) {
    
    Set<String> languages = new HashSet<>();
    languages.add("Java");
    languages.add("JavaScript");
    languages.add("Python");
    System.out.println("Set: " + languages);

  
    System.out.println("Iterating over Set using for-each loop:");
    for(String language : languages) {
      System.out.print(language);
      System.out.print(", ");
    }
  }
}