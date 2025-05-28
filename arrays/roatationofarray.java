package arrays;

public class roatationofarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {23,34,45,2,21};
int d=2;
rotatearr(arr,d);
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i]+" ");
}
	}

	static void rotatearr(int arr[],int d) {
		int n=arr.length;
		
		for(int i=0;i<d;i++) {
			
			int first=arr[0];
			for(int j=0;j<n-1;j++) {
				arr[j]=arr[j+1];
				
			}
			arr[n-1]=first;
		}
	}
}
