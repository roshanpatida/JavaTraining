
public class P31_DisplayFactorsofaNumber {
	public static void main(String[] args) {

		int n = 24;
		for (int i = 1; i <= 24; i++) {
			if (n % i == 0) {
				System.out.println(i);

			}
		}
	}

}
