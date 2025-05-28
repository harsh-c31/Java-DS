package practicearrays;

import java.util.Arrays;

public class movezerostoend {
public static void main(String[] args) {
	int arr[]= {4,0,2,0,0,1,5,6};
	/*Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
*/
	
int n=arr.length;
move(arr,n);
	}
static void move(int arr[],int n) {
	Arrays.sort(arr);
	for(int i=n-1;i>0;i--) {
	System.out.print(arr[i]+" ");
}
}
}