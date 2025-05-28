package Basics;

public class gcdusingwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n1=81,n2=153;
while(n1!=n2) {
	if(n1>n2) {
		n1=n1-n2;
	}
	else {
		n2=n2-n1;
	}
}
System.out.println(n1);
	}

}
