package arrays;

public class searchforelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {23,43,12,12,1234,2};
		int element=12;
		for(int i=0;i<arr.length;i++) {
			if(element==arr[i]) {
				System.out.print("element found at index "+i);
	
			}
		}
	}

}
