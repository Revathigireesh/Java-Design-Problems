public class FoodDeliveryService {

    public double CalculateBill(Order order){

        double total=0;

        for(FoodItem item : order.getOrderedItems()){
            total += item.getPrice();
        }

        return total;
    }

    public void placeOrder(Restaurents restaurents,Order order){
        if(!restaurents.isIsopen()){
            System.out.println("Restaurent closed");
            return;
        }

        System.out.println("Order placed successfully");

        for(FoodItem foodItem: order.getOrderedItems()){
            System.out.println(foodItem.getFoodName());
        }

        System.out.println("Total Bill="+CalculateBill(order));
    }
}
