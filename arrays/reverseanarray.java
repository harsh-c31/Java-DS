package practicearrays;

import java.util.Arrays;

public class reverseanarray {
public static void main(String[] args) {
	int arr[]= {1,4,2,2,5,6};
	int start=0;
int end=arr.length-1;
while(end>start) {
	int temp=arr[start];
	arr[start]=arr[end];
	arr[end]=temp;
	start++;
	end--;
}
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
}
}
