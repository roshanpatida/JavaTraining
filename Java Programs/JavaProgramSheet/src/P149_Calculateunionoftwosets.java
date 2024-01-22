

import java.util.HashSet;
import java.util.Set;

class P149_Calculateunionoftwosets {
  public static void main(String[] args) {

    Set<Integer> evenNumbers = new HashSet<>();
    evenNumbers.add(2);
    evenNumbers.add(4);
    System.out.println("Set1: " + evenNumbers);

   
    Set<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(3);
    System.out.println("Set2: " + numbers);

    
    numbers.addAll(evenNumbers);
    System.out.println("Union is: " + numbers);
  }
}