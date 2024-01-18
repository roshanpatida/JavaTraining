
public class P129_Calculatesimpleinterestandcompoundinterest {
public static void main(String[] args) {
	double principal = 1000;
	double time = 3;
	double rate = 10;
	double number = 1;
	double interest =( principal * time * rate)/100;
	System.out.println(interest);
	
	
	double compound = principal * (Math.pow((1 + rate/100), (time * number))) - principal;
	System.out.println(compound);
}
}
