
public class P125_CapitalizethefirstcharacterofeachwordinaString {
public static void main(String[] args) {
	String  str = "my name is rohan kumar";
	
	char[]  arr = str.toCharArray();
	boolean foundSpace = true;
	
	for(int i=0;i<arr.length;i++) {
		if(Character.isLetter(arr[i])) {
			if(foundSpace) {
				arr[i] = Character.toUpperCase(arr[i]);
				foundSpace = false;
			}
		}
		else {
			foundSpace = true;
		}
	}
	
	String CapitalizeString = String.valueOf(arr);
	System.out.println(CapitalizeString);
}
}
