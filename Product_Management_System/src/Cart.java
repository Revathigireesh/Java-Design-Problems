import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private int cartId;
    private int productId;
    private int customerId;
    private Product product;

    public Cart(int productId, int cartId, int customerId) {
        this.productId = productId;
        this.cartId = cartId;
        this.customerId = customerId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
