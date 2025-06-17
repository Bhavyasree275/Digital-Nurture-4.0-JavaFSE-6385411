import java.util.HashMap;
import java.util.Scanner;
//using hashmaps
public class InventorySystem {
    static HashMap<String, Product> inventory = new HashMap<>();//here productId is sring and it is key ,here the product is value
    //to store products
    //to add products
    public static void addProduct(Product p) {
        inventory.put(p.productId, p);
        System.out.println("Product added.");
    }

    public static void updateProduct(String id, String name, int qty, double price) {
        Product p = inventory.get(id);
        if (p != null) {
            p.name = name;
            p.quantity = qty;
            p.price = price;
            System.out.println("Product updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void deleteProduct(String id) {
        if (inventory.remove(id) != null) {
            System.out.println("Product deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public static void viewInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            for (Product p : inventory.values()) {
                System.out.println(p);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        addProduct(new Product("P001", "Keyboard", 10, 500));
        //here it is going to call Product class
        addProduct(new Product("P002", "Mouse", 15, 300));

        updateProduct("P002", "Wireless Mouse", 12, 750);

        deleteProduct("P003");//this is  product not found case
        deleteProduct("P001");

        viewInventory();

        sc.close();
    }
}
/*
Output:
"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4.1\lib\idea_rt.jar=61306" -Dfile.encoding=UTF-8 -classpath C:\Users\narub\IdeaProjects\ds\out\production\ds InventorySystem
Product added.
Product added.
Product updated.
Product not found.
Product deleted.
P002 , Wireless Mouse , Qty: 12 , Price: 750.0

Process finished with exit code 0
*/