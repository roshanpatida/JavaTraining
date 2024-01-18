import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class P32_MakeaSimpleCalculatorUsingswitchcase {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of a");
    int a = sc.nextInt();
    System.out.println("Enter the value of b");
    int b = sc.nextInt();
    System.out.println("For multiply Enter 1\n"
    		+ "For substraction Enter 2\n"
    		+"For Addition Enter 3\n"
+ "For division Enter 4");
    int o = sc.nextInt();
    switch(o) {
    case 1 : System.out.println("Ans is:"+ (a * b));
    break;
    case 2: System.out.println("Ans is:" + (a - b));
    break;
    case 3: System.out.println("Ans is:"+(a + b));
    break;
    case 4: System.out.println("Ans is:"+(a / b));
    break;
    default:System.out.println("Envalid Input"); 
    	}
    
}
}
