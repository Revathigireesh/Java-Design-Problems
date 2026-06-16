public class Customer {
    private int customerId;
    private String CustomerName;
    private String email;
    private String role;

    Customer(int customerId,String name,String email,String role){
        this.customerId=customerId;
        this.CustomerName=name;
        this.email=email;
        this.role=role;
    }

    public int getCustomerId(){
        return customerId;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setName(String name) {
        this.CustomerName = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole(){
        return role;
    }

    @Override
    public String toString() {

        return "Customer ID : " + customerId +
                ", Name : " + CustomerName +
                ", Email : " + email +
                ", Role : " + role;
    }

}
