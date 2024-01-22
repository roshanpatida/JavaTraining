

import java.util.HashSet;
import java.util.Set;

class P152_Checkifasetisthesubsetofanotherset {
  public static void main(String[] args) {

  
    Set<Integer> numbers = new HashSet<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    System.out.println("Numbers: " + numbers);

        Set<Integer> primeNumbers = new HashSet<>();
    primeNumbers.add(2);
    primeNumbers.add(3);
    System.out.println("Prime Numbers: " + primeNumbers);

    boolean result = numbers.containsAll(primeNumbers);
    System.out.println("Is Prime Numbers is subset of Numbers? " + result);
  }
}