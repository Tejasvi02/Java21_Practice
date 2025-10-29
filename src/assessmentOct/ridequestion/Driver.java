package assessmentOct.ridequestion;

public class Driver {
	String driverId;
	boolean available = true; 
	
	public Driver(String driverId) {
		this.driverId = driverId;
	}
	
	// synchronized to make sure only one ride can be assigned at a time
    public synchronized boolean assignRide(String passengerName) {
        if (available) {
            System.out.println("Driver " + driverId + " assigned to Passenger " + passengerName);
            available = false;
            return true;
        } else {
            System.out.println("Driver " + driverId + " is already on a ride. Passenger " + passengerName + " request denied.");
            return false;
        }
    }

    public synchronized void completeRide() {
        System.out.println("Driver " + driverId + " has completed the ride and is now available.");
        available = true;
    }

    public boolean isAvailable() {
        return available;
    }
	
}
