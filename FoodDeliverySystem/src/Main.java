public class Main {
    public static void main(String[] args) {

        //FoodItem class
        FoodItem pizza = new FoodItem("Pizza",250);
        FoodItem burger = new FoodItem("burger",120);

        //Restaurents class
        Restaurents restaurents=new Restaurents("Food hub",true);
        restaurents.addFoodItem(pizza);
        restaurents.addFoodItem(burger);

        //Customer class
        Customer customer=new Customer("Revathi");

        //Order class
        Order order = new Order(customer);
        order.addItem(pizza);
        order.addItem(burger);

        //Food delivery service class
        FoodDeliveryService service=new FoodDeliveryService();
        service.placeOrder(restaurents,order);
    }
}