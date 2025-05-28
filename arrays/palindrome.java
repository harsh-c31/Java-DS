package arrays;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=545;
int r,sum=0;
int temp=n;
while(n>0) {
	r=n%10;
	sum=sum*10+r;
	n=n/10;
	
}
if(temp==sum) {
	System.out.println("palindrome");
}
else {
		System.out.println("not palindrome");
}
	}

}
