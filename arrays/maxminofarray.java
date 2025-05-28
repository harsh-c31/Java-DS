package practicearrays;

public class maxminofarray {
public static void main(String[] args) {
	int arr[]= {3,4,5,2,1,7,5};
	int max=arr[0];
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max=arr[i];
		}
		   if (arr[i] < min) {
			min=arr[i];
		}
	}
	System.out.println("maximum element among the array is :"+max);
	System.out.println("minimum element among the array is :"+min);
}
}
