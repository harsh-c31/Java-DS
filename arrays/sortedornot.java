package practicearrays;

public class sortedornot {
static boolean sorted(int []arr,int n) {
	if(n==0 || n==1) {
		return true;
	}
	for(int i=1;i<n;i++) {
		if(arr[i-1]>arr[i]) 
			return false;
	}
		return true;
	
	}
public static void main(String [] args) {
	int arr[]= {2,5,3,1,4};
	int n=arr.length;
if(sorted(arr,n)) {
	System.out.println("sorted");
}
else {
	System.out.println("not sorted");
}
}
}

