
	public class P99_ImplementBinarySearchAlgorithm {
	    public static int binarySearch(int[] array, int target) {
	        int low = 0;
	        int high = array.length - 1;

	        while (low <= high) {
	            int mid = low + (high - low) / 2;

	            if (array[mid] == target) {
	                return mid; 
	            } else if (array[mid] < target) {
	                low = mid + 1; 
	            } else {
	                high = mid - 1; 
	            }
	        }

	        return -1; 
	    }

	    public static void main(String[] args) {
	        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	        int target = 7;

	        int result = binarySearch(sortedArray, target);

	        if (result != -1) {
	            System.out.println("Element " + target + " found at index " + result);
	        } else {
	            System.out.println("Element " + target + " not found in the array");
	        }
	    }
	}
