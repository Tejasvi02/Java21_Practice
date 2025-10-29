package assessmentOct.ridequestion;

public class Ride implements Runnable {
    private Passenger passenger;
    private Driver driver;

    public Ride(Passenger passenger, Driver driver) {
        this.passenger = passenger;
        this.driver = driver;
    }

    @Override
    public void run() {
        if (driver.assignRide(passenger.getName())) {
            try {
                Thread.sleep(2000); // ride duration hardcoded
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.completeRide();
        }
    }
}