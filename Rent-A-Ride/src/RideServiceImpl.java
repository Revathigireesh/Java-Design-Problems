import java.util.ArrayList;

public class RideServiceImpl implements RideService{

    private ArrayList<Ride> rides;
    private ArrayList<Driver> drivers;

    public RideServiceImpl() {
        this.rides = new ArrayList<>();
        this.drivers = new ArrayList<>();
    }

    @Override
    public void AddDriver(Driver driver) {
        drivers.add(driver);
        //System.out.println("Driver added successfully");
    }

    @Override
    public void displayDrivers() {
        System.out.println("Name" + " "+ "VehicleNo" + " " + " Ratings" + " " + "Location" +" " +  " Type");
        System.out.println("---------------------------------------------");
        for (Driver driver:drivers){
            System.out.println(driver.getDriverName() + "   "
            + driver.getVehicleNo() + "      "
            + driver.getRatings() + "     "
            +driver.getLocation() + "   "
            + driver.getVehicleType());
        }
    }

    @Override
    public void searchByType(String type){
        for (Driver driver:drivers){
            if(driver.getVehicleType().equalsIgnoreCase(type)){
                System.out.println(driver.getDriverName() + " "
                        + driver.getIsAvailable() + " "
                        + driver.getRatings() + " "
                        + driver.getVehicleNo());
            }
        }
    }

    @Override
    public void bookRide(Driver driver,Ride ride) {
//        System.out.println(
//                "Driver : " + driver.getDriverName()
//                        + " Available : " + driver.getIsAvailable()
//        );
        if (driver.getRatings() > 4.0 && driver.getIsAvailable()) {
            driver.setAvailable(false);
            ride.setFare(ride.getDistance() * 8);
            rides.add(ride);
            System.out.println("Ride Booked successfully");
            System.out.println("amount: " + ride.getFare());
        }else{
            System.out.println("sorry! choose other cab");
        }
    }

    @Override
    public void completeRide(int driverId, int rideId) {
        for (Driver driver:drivers){
            if(driver.getDriverId() == driverId && rides.contains(rideId)){
                driver.setAvailable(true);
            }
        }
    }

    @Override
    public void displayRides() {
        System.out.println("Fare" + " "+ "PickUpLocation" + " " + " DropLocation");
        System.out.println("---------------------------------------------");
        for (Ride ride1:rides){
            System.out.println(ride1.getFare() + "    "
            + ride1.getPickupLocatiob() + "      "
            +ride1.getDropLocation());
        }
    }
}
