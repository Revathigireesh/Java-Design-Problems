import com.sun.source.tree.ProvidesTree;

public interface CartService {
void AddToCart(Product product,int product_id);
void deleteCart(int product_id);
void display();
}

