public class Product {
    //declaring my variables according to given question
    String productId;
    String name;
    int quantity;
    double price;
    //creating a constructor the variables i hhave declared above
    public Product(String productId, String name, int quantity, double price) {
        this.productId = productId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    //to print
    public String toString() {
        return productId + " , " + name + " , Qty: " + quantity + " , Price: " + price;
    }
}
