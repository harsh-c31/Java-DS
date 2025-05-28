package oops;
class prg{
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name=name;
}
public class encapsulation {

public static void main(String[] args) {
	prg p=new prg();
	p.setName("Geks");
			System.out.println("getname:"+p.getName());
}
}
}
