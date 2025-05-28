package recursion;

public class findnumberofzero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,1,1,1,1,0,0,0,2,0,0};
int n=arr.length;
int x=findzero(arr,n);
	if(x==-1) {
		System.out.println("count of zero is:");
	}
	else {
		System.out.println("count of zero is:");
		System.out.println(n-x);
	}
	}
	public static int findzero(int arr[],int n) {
		for(int i=0;i<n;i++) {
			if(arr[i]==0) {
				return i;
			}
		}
		return -1;
	}
	

}
