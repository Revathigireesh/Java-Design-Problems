public interface RideService {
    void AddDriver(Driver driver);
    void displayDrivers();
    void bookRide(Driver driver,Ride ride);
    void searchByType(String type);
    void displayRides();
    void completeRide( int driverId,int rideId);
}
