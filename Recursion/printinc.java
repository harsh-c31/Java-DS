package recursion;

public class printinc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
printincreasing(9);
	}
	public static void printincreasing(int n) {
		if(n==0) {
			return;
		}
		
		printincreasing(n-1);
	
	System.out.println(n);
	}

}
