import java.util.ArrayList;

public class CartServiceImpl implements CartService{

    private ArrayList<Product> cartList;
    private ProductService productService;

    CartServiceImpl(ProductService productService){
        this.productService=productService;
        cartList=new ArrayList<>();
    }

    @Override
    public void AddToCart(Product product,int product_id) {
        Product product1 = productService.getProductById(product_id);
        if (product1 != null) {
            cartList.add(product);
            System.out.println(product1.getName() + " added To cart Successfully");

        } else {
            System.out.println("product not found");
        }
    }

    @Override
    public void deleteCart(int product_id) {
        for (Product product:cartList){
            if(product.getProductid()==product_id){
                cartList.remove(product);
                System.out.println(product.getName() + " deleted from cart");
                return;
            }
        }
    }

    @Override
    public void display() {
        for (Product product:cartList){
            System.out.println(product.getProductid() + " " +
                    product.getName() + " "+
                    product.getPrice());
        }
    }
}
