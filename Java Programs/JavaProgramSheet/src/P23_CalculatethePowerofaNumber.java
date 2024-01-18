
public class P23_CalculatethePowerofaNumber {
	public static void main(String[] args) {
		int n = 16;
		int pow = 2, cal = 1;

		for (int i = 0; i < pow; i++) {
			cal = cal * n;
		}
		System.out.println(cal);
	}
}
