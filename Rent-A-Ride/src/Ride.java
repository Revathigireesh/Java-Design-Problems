public class Ride {
    private int rideId;
    private String pickupLocatiob;
    private String dropLocation;
    private double fare;
    private double distance;
    //Driver driver;

    public Ride(int rideId, String pickupLocatiob, String dropLocation,double distance) {
        //this.driver=driver;
        this.rideId = rideId;
        this.pickupLocatiob = pickupLocatiob;
        this.dropLocation = dropLocation;
        this.distance=distance;

    }

    public int getRideId() {
        return rideId;
    }

    public void setRideId(int rideId) {
        this.rideId = rideId;
    }

    public String getPickupLocatiob() {
        return pickupLocatiob;
    }

    public void setPickupLocatiob(String pickupLocatiob) {
        this.pickupLocatiob = pickupLocatiob;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }
}
