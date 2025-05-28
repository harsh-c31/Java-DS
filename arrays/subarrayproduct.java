package arrays;

public class subarrayproduct {
	static int maxsubproduct(int arr[]) {
		int res=arr[0];
		for(int i=0;i<arr.length;i++) {
			int currprod=1;
			for(int j=i;j<arr.length;j++) {
				currprod=currprod*arr[j];
				res=Math.max(currprod, res);
			}
		}
		return res;
	}
	public static void main(String[] args) {
		int arr[]= {1,3,1,5};
		System.out.println(maxsubproduct(arr));
	}
	}

