
public class P27_CheckArmstrongNumber {

	public static int power(int rem, int count) {
		int num = 1;
		for (int i = 0; i < count; i++) {
			num = num * rem;

		}
		return num;
	}

	public static void main(String[] args) {

		int n = 153, rem = 0, sum = 0;
		int temp = n, count = 0;
		while (temp > 0) {
			temp = temp / 10;
			count++;
		}
		temp = n;
		while (temp > 0) {
			rem = temp % 10;
			sum += power(rem, count);
			temp = temp / 10;

		}
		System.out.println(sum);
		System.out.println(n);
		if (sum == n) {
			System.out.println("amstrong number");
		} else {
			System.out.println("not armstrong number");
		}
	}
}