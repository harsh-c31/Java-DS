package practicearrays;

public class twosum {

	
		// TODO Auto-generated method stub
static int [] twosum(int arr[],int target) {
	int len=arr.length;
	int [] res=new int[2];
	for(int i=0;i<len;i++) {
		for(int j=i+1;j<len;j++) {
			if(arr[i]+arr[j]==target) {
				res[0]=i;
				res[1]=j;
				
			}
		}
	}
	return res;
}
public static void main(String[] args) {
	int arr[]= {2,4,6,1,7,9};
	int target=9;
	int []res=twosum(arr,target);
	System.out.println(res[0]+" "+res[1]);
	}

}
