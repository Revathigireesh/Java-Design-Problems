public class Product {
    private int productid;
    private String name;
    private boolean isAvailable=true;
    private double price;

    Product(int productid,String name,Boolean isAvailable,double price){
       this.productid=productid;
       this.name=name;
       this.isAvailable=isAvailable;
       this.price=price;
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
