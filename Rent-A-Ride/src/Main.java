public class Main {
    public static void main(String[] args) {

Customer reva=new Customer(1,"reva");

Driver john = new Driver(1,"john",2345,5,"mysore","auto");
Driver merry = new Driver(2,"mery",4567,4.1,"banglore","car");

Ride ride = new Ride(1,"mysore","banglore",8);

        RideService rideService = new RideServiceImpl();
        rideService.AddDriver(john);
        rideService.AddDriver(merry);
        rideService.searchByType("car");
        System.out.println();

        System.out.println("AVAILABLE DRIVERS");
        System.out.println("---------------------------------------------");
        rideService.displayDrivers();
        System.out.println("---------------------------------------------");
        System.out.println();

        rideService.bookRide(john,ride);
        rideService.bookRide(merry,ride);
        rideService.bookRide(john,ride);

        System.out.println();
        System.out.println("RIDE HISTORY");
        System.out.println("---------------------------------------------");
        rideService.displayRides();
        System.out.println("---------------------------------------------");
        
    }
}