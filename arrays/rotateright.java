package practicearrays;

public class rotateright {
	static void rotateright(int arr[],int d) {
		int n=arr.length;
		
		for(int i=0;i<d;i++) {
			int last=arr[n-1];
			for(int j=n-1;j>0;j--) {
				arr[j]=arr[j-1];
			}
			arr[0]=last;
		}
	}
	public static void main(String[] args) {
		int arr[]= {2,1,4,5};
		int d=1;
		rotateright(arr,d);
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
	}
	}
