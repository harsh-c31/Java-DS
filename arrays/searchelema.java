package practicearrays;

public class searchelema {
	public static void main(String[] args) {
		
	
	int arr[]= {2,4,2,1,3,4,6};
	int key=2;
boolean found=false;
for(int i=0;i<arr.length;i++) {
	if(arr[i]==key) {
		found=true;
		break;
	}
}

if(!found) {
	System.out.println("not found");
	}
else {
	System.out.println("found");
}
}
}
