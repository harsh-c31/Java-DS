package arrays;

public class medianofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {23,34,2,2,4,21,32};
int sum=0;
int product=1;

for(int i=0;i<arr.length;i++) {
	sum=sum+arr[i];
	
}
System.out.println("sum of elements in array is : "+sum);
int median=sum/arr.length;
System.out.println("median of elements of array is :"+median);

for(int i=0;i<arr.length;i++) {
	product=product*arr[i];


}
System.out.println("product is :"+product);
	}

}
