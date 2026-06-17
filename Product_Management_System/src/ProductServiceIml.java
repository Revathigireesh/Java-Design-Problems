import java.util.ArrayList;

public class ProductServiceIml implements ProductService{

    private ArrayList<Product> products;
    ProductServiceIml(){
        products=new ArrayList<>();
    }
    @Override
    public void AddProduct(Product product) {
        products.add(product);
        System.out.println(product.getName() + " product added successfully");
    }
    @Override
    public void updateProduct(int id,String name,double price){
        for (Product product:products){
            if(product.getProductid() == id){
                product.setName(name);
                product.setPrice(price);
                System.out.println(product.getName() + " product updated successfully");
                return ;
            }
        }
    }

    @Override
    public void deleteProduct(int product_id) {
        for (Product product:products){
            if(product.getProductid()==product_id){
                products.remove(product);
                System.out.println(product.getName() + " deleted successfully");
                return;
            }
        }
    }

    @Override
    public void displayProduct() {
        for (Product product:products){
            System.out.println(product.getProductid() + " " +
                    product.getName() + " " +
                    product.getPrice());
        }
    }

    @Override
    public Product getProductById(int product_id) {
        for(Product product:products){
            if(product.getProductid()==product_id){
                return product;
            }
        }
        return null;
    }
}
