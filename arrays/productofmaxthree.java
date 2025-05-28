package arrays;

import java.util.Arrays;

public class productofmaxthree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {-23,-34,10,30,20,45};
Arrays.sort(arr);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
	
	
}
System.out.println();
int productof3=1;
System.out.println("max  3 numbers among the array are : ");
for(int i=arr.length-1;i>2;i--) {

	System.out.println(arr[i]);
	productof3=productof3*arr[i];
}
System.out.println("product of max 3 numbers is"+productof3);
	}

}
