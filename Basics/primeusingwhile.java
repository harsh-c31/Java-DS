package Basics;

public class primeusingwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number=23;
boolean flag=false;

int i=2;

if(number==0 || number==1) {
	flag=true;
	
}
while(i<number/2){
	if(number%i==0) {
		flag=false;
	}
	++i;
}
if(!flag) {
	System.out.println("prime");
}
else {
	System.out.println("not prime");
}
	}

}
