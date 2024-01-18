
public class P13_CheckWhetheraCharacterisAlphabetorNot {
	public static void main(String[] args) {
		char c = '9';

		if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z') {
			System.out.println("is alphabate");
		} else {
			System.out.println("not alphabate");
		}
	}
}
