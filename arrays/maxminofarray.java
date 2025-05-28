package arrays;

public class maxminofarray {
	  public static void maxmin(int arr[]) {
	        int max = arr[0];
	        int min = arr[0];
	        for (int i = 1; i < arr.length; i++) { // Start from 1 since we already initialized max and min with arr[0]
	            if (arr[i] > max) {
	                max = arr[i];
	            } else if (arr[i] < min) { // This condition checks for minimum value
	                min = arr[i];
	            }
	        }
	        System.out.println("Max: " + max);
	        System.out.println("Min: " + min);
	    }

	    public static void main(String[] args) {
	        int arr[] = {2, 4, 5, 2, 1};
	        maxmin(arr); // Just call the method without System.out.println
	    }
	}