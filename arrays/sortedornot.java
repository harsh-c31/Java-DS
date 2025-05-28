package arrays;

public class sortedornot {

	static boolean sorted(int arr[],int n) {
		if(n==1 || n==0) 
			return true;
		
		for(int i=1;i<n;i++) 
			if(arr[i-1]>arr[i]) 
				return false;
			
			return true;
			
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,4,2,1,445};
int n=arr.length;
if(sorted(arr,n)) {
	System.out.println("sorted");
}
else {
	System.out.println("not sorted or not");
}
	}
}

