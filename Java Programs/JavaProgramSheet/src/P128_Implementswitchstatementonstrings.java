
public class P128_Implementswitchstatementonstrings {
	public static void main(String[] args) {
		String str = "hello";
		switch (str) {
		case "hello":
			System.out.println("String is 'hello'");
			break;
		case "no":
			System.out.println("String is 'no'");
			break;
		case "yes":
			System.out.println("String is 'yes'");
			break;
		default:
			System.out.println("invalid String");
			break;
		}
	}
}
