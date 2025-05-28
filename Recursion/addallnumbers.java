package recursion;

public class addallnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum(5,10));
	}
	public static int sum(int start,int end) {
		if(start<end) {
			return (end+sum(start,end-1));
		}
		else {
			return end;
		}
	}

}
