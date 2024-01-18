
public class P45_AddTwoMatrixUsingMultidimensionalArrays {
public static void main(String[] args) {
	int arr1[][] = {{23,34},{23,43}};
	int arr2[][] = {{32,45},{42,45}};
	int arr3[][] = new int[2][2];
	for(int i = 0;i<arr1.length-1;i++) {
		for(int j = 0;i<arr2.length-1;i++) {
			arr3[i][j] = arr1[i][j] + arr2[i][j];
			
		}



	
  }
}


}
