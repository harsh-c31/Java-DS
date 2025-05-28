package sorting;

public class insertionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {234,34,2,1,45};
for(int i=1;i<arr.length;i++) {
int current=arr[i];
int j=i-1;
while(j>=0 && arr[j]>current) {
	arr[j+1]=arr[j];
	j--;
	
}
arr[j+1]=current;
}
printarray(arr);

}
public static void printarray(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]+" ");
	}
	System.out.println();
}
}

