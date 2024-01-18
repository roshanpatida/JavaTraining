
public abstract class P61_CheckifAnArrayContainsaGivenValue {
	

	public static void main(String[] args) {
		int arr[] = { 1, 4, 2, 4, 2 };
		int n = 19;
	boolean found = false;
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i] == n) {
		found = true;
				break;
			}
			}
		if(found == true) {
			System.out.println("found value is " + n );
		}
		else {
			System.out.print("not found ");
		}
		
			
		}

	}

