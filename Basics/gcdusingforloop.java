package Basics;

public class gcdusingforloop {
public static void main(String[] args) {
	

int n1=21;
int n2=63;
int gcd=1;
for(int i=1;i<n1 && i<n2;i++) {
	if(n1%i==0 && n2%i==0) {
		gcd=i;
	}

}
System.out.println(gcd);
}
}