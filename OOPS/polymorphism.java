package oops;

class person{
	void role() {
		System.out.println("I am a person");
	}
}

class father extends person{
	@Override
	void role() {
		System.out.println("I am a father");
	}
}


public class polymorphism {
public static void main(String[] args) {
	person p=new father();
	p.role();
}
}
