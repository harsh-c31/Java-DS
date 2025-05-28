package practicearrays;

public class movezerostoenddupli {
public static void main(String[] args) {
	int arr[]= {32,4,1,0,4,0,5,2};
	mztoend(arr);
}
static void mztoend(int []arr) {
	int count=0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=0) {
			arr[count++]=arr[i];
		}
	}
	while(count<arr.length) {
		arr[count++]=0;
	}
	for(int num:arr) {
		System.out.print(num+" ");
	}
}
}
