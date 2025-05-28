package arrays;

import java.util.Arrays;

public class largestelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int arr[]= {23,43,12,1234,2};
int n=arr.length;
System.out.print("unsorted array : ");
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
System.out.println();
		Arrays.sort(arr);
		
		System.out.print("sorted array : ");
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	
	
		
	}
		
		
	}

}
