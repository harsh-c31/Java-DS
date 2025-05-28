package recursion;

public class printarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {10,20,30,40,50};
printarr(arr,0);
	}
	public static void printarr(int arr[],int idx) {
		if(idx==arr.length) {
			return;
		}
		System.out.println(arr[idx]);
		printarr(arr,idx+1);
	}

}
