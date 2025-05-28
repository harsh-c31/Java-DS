package arrays;

public class reverseanarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,43,12,1234,2};
		System.out.print("array before reversal : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("array after reversal : ");
		for(int i=arr.length-1;i>=0;i--) {
		System.out.print(arr[i]+" ");
	}

	}
}
