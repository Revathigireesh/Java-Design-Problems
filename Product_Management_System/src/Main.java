public class Main {
    public static void main(String[] args) {
    Customer revathi =new Customer(1,"reva","mysore","user");
    Customer john = new Customer(2,"john","mandya","admin");

    Product apple = new Product(1,"apple",true,10);
    Product guava = new Product(2,"gauva",true,20);

    System.out.println("<---------PRODUCT SERVICE-------------->");
    System.out.println(" ");

    ProductService productService = new ProductServiceIml();
    productService.AddProduct(apple);
    productService.AddProduct(guava);
    productService.displayProduct();
    productService.deleteProduct(1);
    productService.displayProduct();

    System.out.println(" ");
    System.out.println("<------------CART SERVICE------>");

   CartService cartService =new CartServiceImpl(productService);
   cartService.AddToCart(apple,1);
   cartService.AddToCart(guava,2);
   cartService.display();
   cartService.deleteCart(2);
   cartService.display();
    }
}