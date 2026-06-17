public interface ProductService {
     void AddProduct(Product product);
     void updateProduct(int product_id,String name,double price);
     void deleteProduct(int product_id);
     void displayProduct();

     Product getProductById(int product_id);

}
