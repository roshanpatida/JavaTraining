import java.util.Arrays;

public class P97_ImplementQuickSortAlgorithm {
 public static int partition(int[] arr,int lowerBound, int upperBound) {
	 
	 int pivot= arr[lowerBound];
	 int start = lowerBound;
	 int end = upperBound;
	 
	 while(start<end) {
		 while(arr[start]<=pivot) {
			 start++;
		 }
		 while(arr[end]>pivot){
			 end--;
		 }
		 if(start<end) {
			 swap(arr, start, end);
		 }
	 }
	 swap(arr, lowerBound, end);
	 return end;
 }
 
 public static void sort(int[] arr,int lowerBound,int upperBound) {
	if(lowerBound < upperBound) {
		int location  = partition(arr,lowerBound,upperBound);
		
		sort(arr,lowerBound,location -1);
		sort(arr,location+1,upperBound);
	}
 }
 
 
 public static void swap(int[] arr,int s,int e) {
	int temp = arr[s];
	arr[s] = arr[e];
	arr[e] = temp;
 }
 public static void main(String[] args) {
int[] arr = {23,53,53,23,34,232};
 sort(arr, 0, arr.length-1);
 System.out.println(Arrays.toString(arr));
}
}
