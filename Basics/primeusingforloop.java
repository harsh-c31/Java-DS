package Basics;

public class primeusingforloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=29;

boolean flag=false;
if(number==0||number==1) {
	flag= true;
}
for(int i=2;i<=number/2;i++) {
	if(number%i==0) {
		flag=true;
		break;
	}
	
}
if(!flag) {
	System.out.println("prime");
}

else {
	System.out.println("not prime");
}
	}
}

