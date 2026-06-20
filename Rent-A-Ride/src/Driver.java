public class Driver {
    private int driverId;
    private String driverName;
    private int vehicleNo;
    private double ratings;
    private String location;
    private String vehicleType;
    private boolean isAvailable =true;

    public Driver(int driverId, String driverName, int vehicleNo, double ratings, String location,String vehicleType) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.vehicleNo = vehicleNo;
        this.ratings = ratings;
        this.location = location;
        this.vehicleType=vehicleType;
    }

    public int getDriverId() {
        return driverId;
    }

    public void setDriverId(int driverId) {
        this.driverId = driverId;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
