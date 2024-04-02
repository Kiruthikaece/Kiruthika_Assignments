import java.util.ArrayList;
import java.util.List;

abstract class Product {
   
    String Productname;
    String description;
    double price;

    Product(String Productname,String description,double price) {
        this.Productname=Productname;
        this.description=description;
        this.price=price;
    }

    abstract String getProductName();
    abstract String getDescription();
    abstract double getPrice();
}

class ElectronicsProduct extends Product {

    ElectronicsProduct(String Productname,String description,double price) {
        super(Productname,description,price);
    }
   
    String getProductName() {
        return Productname;
    }
    String getDescription() {
       return "The price of electroincs products"+price+"rating is high";
    }

    double getPrice() {
        return price;
    }

}


class ClothingProduct extends Product {


    ClothingProduct(String Productname,String description,double price) {
        super(Productname,description,price);
    }

    String getProductName() {
        return Productname;
    }
    String getDescription() {
        return "The price of clothing products"+price+"rating is high";
     }
 
     double getPrice() {
         return price;
     }
}


class BookProduct extends Product {

    BookProduct(String Productname,String description,double price) {
        super(Productname,description,price);
    }
    String getProductName() {
        return Productname;
    }
    String getDescription() {
        return "The price of book products"+price+"rating is high";
     }
 
     double getPrice() {
         return price;
     }
}

class ShoppingCart {
    private List<Product> products;

    public ShoppingCart() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}

// Main class
public class ProductMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        Product product1 = new ElectronicsProduct("Smartphone","null" ,799.99);
        Product product2 = new ClothingProduct("T-Shirt","null" ,29.99);
        Product product3 = new BookProduct("Java Programming", "null",49.99);

        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        System.out.println("Total Price: $" + cart.calculateTotalPrice());
    }
}
