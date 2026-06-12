public class FoodItem {
    private String name;
    private double price;

    FoodItem(String FoodName,double price){
        this.name=FoodName;
        this.price=price;
    }

    public String getFoodName(){
        return name;
    }
    public double getPrice() {
        return price;
    }
}
