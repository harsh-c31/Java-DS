package practicearrays;

public class searchelem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,4,3,1,6};
int key=2;
for(int i=0;i<arr.length;i++) {
	if(arr[i]==key) {
		System.out.println("found at index "+i);
		break;
	}
	else {
		System.out.println("can't find element");
	}
}
	}

}
