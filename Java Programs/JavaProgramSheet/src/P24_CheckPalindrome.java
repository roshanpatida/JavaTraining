
public class P24_CheckPalindrome {
public static void main(String[] args) {
	int n =242,rem,sum =0;
	int num = n;
 while(n>0) {
	 rem = n % 10;
		sum = (sum * 10) + rem;
		n = n / 10;
	
 }
 
 if(sum == num) {
	 System.out.println("true");
 }
 else {
	 System.out.println("false");
 }
}
}
