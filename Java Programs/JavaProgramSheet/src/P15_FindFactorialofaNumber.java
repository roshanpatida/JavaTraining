
public class P15_FindFactorialofaNumber {
	public static void main(String[] args) {
		int n = 5, sum = 1;
		
		for (int i = 1; i <= n; i++) {
			sum *= i;
		}
		System.out.println(sum);
	}
}
