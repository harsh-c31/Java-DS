package practicearrays;

public class missingnumberfrom1ton {
public static void main(String[] args) {
	int arr[]= {3,2,4,5,6,7};
	int n=7;
	int sum=n*(n+1)/2;
	int sum_array=0;
	for(int i=0;i<arr.length;i++) {
		sum_array=sum_array+arr[i];
	}
	int missing=sum-sum_array;
	System.out.println(missing);
}
}
