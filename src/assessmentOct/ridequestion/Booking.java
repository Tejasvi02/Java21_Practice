package assessmentOct.ridequestion;

public class Booking {

	public static void main(String[] args) {
		
        Driver driver = new Driver("D1");

        Passenger passenger1 = new Passenger("P1", "Alice");
        Passenger passenger2 = new Passenger("P2", "Bob");

        Ride ride1 = new Ride(passenger1, driver);
        Ride ride2 = new Ride(passenger2, driver);

        Thread t1 = new Thread(ride1);
        Thread t2 = new Thread(ride2);

        t1.start();
        t2.start();
    }
}
