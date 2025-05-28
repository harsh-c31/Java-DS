package Basics;

public class factusingrecursion {

	public static int factorial(int number) {
		if(number==0) {
			return 1;
		}
		return number*factorial(number-1);
	}
	public static void main(String[] args) {
		int number=5;
		int fact=factorial(number);
		System.out.println(fact);
	}
}
