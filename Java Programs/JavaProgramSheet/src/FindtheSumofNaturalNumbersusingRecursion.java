
public class FindtheSumofNaturalNumbersusingRecursion {

	public int sum(int num) {
		if (num == 0) {
			return num;
		}
		return num + sum(num - 1);
	}

	public static void main(String[] args) {
		FindtheSumofNaturalNumbersusingRecursion s = new FindtheSumofNaturalNumbersusingRecursion();

		System.out.println(s.sum(0));
	}
}
