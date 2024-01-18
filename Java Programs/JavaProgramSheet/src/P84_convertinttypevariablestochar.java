import java.util.Scanner;

public class P84_convertinttypevariablestochar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter integer value in single digit");
		int n = sc.nextInt();
		char ch = (char) (n + '0');
		System.out.println(ch);

	}
}