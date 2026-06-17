public class Customer {
    private int custmerid;
    private String name;
    private String location;
    private String role;


    public Customer(int custmerid, String name, String location,String role) {
        this.custmerid = custmerid;
        this.name = name;
        this.location = location;
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getCustmerid() {
        return custmerid;
    }

    public void setCustmerid(int custmerid) {
        this.custmerid = custmerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
