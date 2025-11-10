package test_Nov10;

public class Bus extends Vehicle {

	public void driveonly() {
		System.out.println("Bus driving");
	}
	
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Bus b = new Bus();
		v.driveonly(); //Vehicle driving
		b.driveonly(); //bus driving
		
		v = b; //this is equivalent to Vehicle v = new Bus();
		v.driveonly(); //bus driving
	}
}

class Vehicle{
	public void driveonly() {
		System.out.println("Vechicle driving");
	}
}
