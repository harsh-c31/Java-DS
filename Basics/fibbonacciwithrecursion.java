package Basics;

public class fibbonacciwithrecursion {

	static int a=0,b=1,c;
	static void printfibonacci(int count) {
		if(count>0) {
			c=a+b;
			a=b;
			b=c;
			System.out.print(" "+c);
			printfibonacci(count-1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int count=10;
System.out.print(a+" "+b);
printfibonacci(count-2);
	}

}
