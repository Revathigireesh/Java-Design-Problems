import java.util.ArrayList;

public class Order {

    private Customer customer;
    private ArrayList<FoodItem> orderedItems;

    public Order(Customer customer) {
        this.customer = customer;
        orderedItems = new ArrayList<>();
    }

    public void addItem(FoodItem foodItem){
        orderedItems.add(foodItem);
    }

    public ArrayList<FoodItem> getOrderedItems(){
        return orderedItems;
    }

    public Customer getCustomer(){
        return customer;
    }

}
