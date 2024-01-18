
public class P34_SumofNaturalNumbersusingRecursion {
public int sum(int num) {
	if(num==0) {
		return 0;
		
	}
	return num +sum(num -1);
}
public static void main(String[] args) {
	P34_SumofNaturalNumbersusingRecursion s = new P34_SumofNaturalNumbersusingRecursion();
	 System.out.println(s.sum(4));
}
}
