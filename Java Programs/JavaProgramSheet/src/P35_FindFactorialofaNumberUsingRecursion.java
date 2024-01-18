
public class P35_FindFactorialofaNumberUsingRecursion {

	public int fact(int n) {
		if (n == 0) {
			return 1;
		}

		return n * fact(n - 1);
	}

	public static void main(String[] args) {
		P35_FindFactorialofaNumberUsingRecursion s = new P35_FindFactorialofaNumberUsingRecursion();
		System.out.println(s.fact(5));
	}
}
