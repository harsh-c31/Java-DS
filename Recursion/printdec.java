package recursion;

public class printdec {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
printdecreasing(9);
	}
	public static void printdecreasing(int n) {
		if(n==0) {
			return;
		}
		System.out.println(n);
		printdecreasing(n-1);
	

	}

}
