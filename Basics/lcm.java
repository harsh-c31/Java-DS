package Basics;

public class lcm {
	public static void main(String[] args) {
        int n1 = 72, n2 = 120;
int gcd=findgcd(n1,n2);
int lcm=(n1*n2)/gcd;
System.out.println(lcm);
}
	public static int findgcd(int a,int b) {
		if(b==0) {
			return a;
			
		}
		return findgcd(b,a%b);
	}
}