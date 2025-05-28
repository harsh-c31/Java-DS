package oops;
class Bicycle {
    public int gear;
    public int speed;

    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }

    public void applyBrake(int decrement) {
        speed -= decrement;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public String toString() {
        return "No of gears: " + gear + ", Speed of bicycle: " + speed;
    }
}

// Derived class
class MountainBike extends Bicycle {
    public int seatHeight;

    // Constructor
    public MountainBike(int gear, int speed, int seatHeight) {
        super(gear, speed); // Call base class constructor
        this.seatHeight = seatHeight;
    }

    public void setHeight(int newValue) {
        seatHeight = newValue;
    }

    @Override
    public String toString() {
        return super.toString() + ", Seat height: " + seatHeight;
    }
}

// Main class
public class inheritence {
    public static void main(String args[]) {
        MountainBike mb = new MountainBike(3, 100, 25);
        System.out.println(mb.toString());
    }
}