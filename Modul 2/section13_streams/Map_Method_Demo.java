
package section13_streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author roshan_patidar
 */
public class Map_Method_Demo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(0);
        l.add(14);
        l.add(15);
        l.add(90);
        l.add(7);
        
        List<Integer> l2=new ArrayList<Integer>();
        for(Integer I : l){
          
                l2.add(I*2);
            
        }
        System.out.println(l2);
        //---------------------------------------------------------------------
        System.out.println(l);//stream() method present in collection interface
        List<Integer> l1=l.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println(l1);
        // in this porgram stream() method is process the gruop of objects which is present in the collction.
        // map() method is used for perform with all statements and doing some process which we want.
        // collect() method is collect the elements from the stream and adding to the spacified collection 
        //
    }
    
}
