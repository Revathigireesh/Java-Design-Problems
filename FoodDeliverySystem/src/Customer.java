import java.util.ArrayList;

public class Customer {
    private int customerId;
    private String name;
    //constructor
    Customer(int customerId,String name){
        this.customerId=customerId;
        this.name=name;
    }

    public String getName(){
        return name;
    }
    public int getCustomerId(){
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}
