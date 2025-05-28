package oops;

abstract class Geeks{
	abstract void turnOn();
	abstract void turnOff();
}

class TVRemote extends Geeks{
	@Override
	void turnOn() {
		System.out.println("turened on");
	}
	@Override
	void turnOff() {
		System.out.println("turned off");
	}
}

public class abstraction {
public static void main(String[] args) {
	Geeks remote=new TVRemote();
	remote.turnOn();
	remote.turnOff();
}
}
