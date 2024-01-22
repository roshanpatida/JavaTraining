

import java.util.ArrayList;

class P140_ConverttheArrayListintoastringandviceversa {
  public static void main(String[] args) {
    ArrayList<String> languages= new ArrayList<>();

    
    languages.add("Java");
    languages.add("Python");
    languages.add("JavaScript");
    System.out.println("ArrayList: " + languages);

    String arraylist = languages.toString();
    System.out.println("String: " + arraylist);

  }
}