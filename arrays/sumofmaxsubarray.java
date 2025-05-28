package arrays;

public class sumofmaxsubarray {
static int maxsubsum(int arr[]) {
	int res=arr[0];
	for(int i=0;i<arr.length;i++) {
		int currsum=0;
		for(int j=i;j<arr.length;j++) {
			currsum=currsum+arr[i];
			res=Math.max(currsum, res);
		}
	}
	return res;
}
public static void main(String[] args) {
	int arr[]= {1,3,1,5};
	System.out.println(maxsubsum(arr));
}
}
