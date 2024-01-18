
public class P28_DisplayArmstrongNumberBetweenTwoIntervals {

	public static int power(int rem, int count) {
		int num = 1;
		for (int i = 0; i < count; i++) {
			num = num * rem;

		}
		return num;
	}

	public static void main(String[] args) {
		int a = 2, b = 1343;

		for (int i = a; i <= b; i++) {
			int rem = 0, sum = 0;
			int n = i;
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

			if (sum == n) {
				System.out.println(sum);
			}
		}
	}
}