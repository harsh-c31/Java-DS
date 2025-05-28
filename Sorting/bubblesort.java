package sorting;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,23,2,44,5,2};
bybblesort(arr);
	}
	public static void bybblesort(int arr[]) {
		for(int i=0;i<=arr.length-1;i++) {
			for(int j=0;j<arr.length-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
			}
		for(int value:arr) {
			System.out.print(value+" ");}
	}

}
