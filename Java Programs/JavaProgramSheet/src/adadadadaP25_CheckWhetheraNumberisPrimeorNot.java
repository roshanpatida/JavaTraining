
public class adadadadaP25_CheckWhetheraNumberisPrimeorNot {
public static void main(String[] args) {
	

	int n = 9;
	boolean flag = false;
	if(n ==0 || n ==1) {
		System.out.println("not prime");
	}else {
		for(int i =2;i<=n/2; i++) {
		if(n%i == 0) {
			System.out.println(i+"not prime");
			flag = true;
			break;
		}
		if(flag = false) {
			System.out.println("prime");
		}
		else {
			System.out.println("not prime");
		}
		
		
	}
	}}}
