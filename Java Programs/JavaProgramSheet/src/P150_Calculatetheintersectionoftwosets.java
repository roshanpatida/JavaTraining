
import java.util.HashSet;
import java.util.Set;

class Calculatetheintersectionoftwosets {
 
  public static void main(String[] args) {

       Set<Integer> primeNumbers = new HashSet<>();
    primeNumbers.add(2);
    primeNumbers.add(3);
    System.out.println("Prime Numbers: " + primeNumbers);

 
    Set<Integer> evenNumbers = new HashSet<>();
    evenNumbers.add(2);
    evenNumbers.add(4);
    System.out.println("Even Numbers: " + evenNumbers);

    
    evenNumbers.retainAll(primeNumbers);
    System.out.println("Intersection: " + evenNumbers);
  }
}