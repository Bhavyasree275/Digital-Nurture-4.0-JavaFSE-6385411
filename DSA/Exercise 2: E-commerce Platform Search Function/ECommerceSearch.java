// this is the class used to declare all the products
class Product {
    String productId;
    String productName;
    String category;
//it is the constructor for product class
    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return productId + " , " + productName + " , " + category ;
    }
}

//using linearsearch where it checks  element by element
class LinearSearchProduct {
    //here the return type i used is Product as i want to return all the things related to that product
    //like Id,Name,Category
    public static Product linearSearch(Product[] products, String name) {
        for (Product product : products) {//used for each loop for(type variable:array) ,for each loop is mostly used for arrays
            if (product.productName.equalsIgnoreCase(name)) {//as the name is of type string we cant use ==
                return product;
            }
        }
        return null;
    }
}

// using binary search
class BinarySearchProduct {

    // before performing binary search the array should be sorted
    public static void sortByName(Product[] products) {
        int n = products.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                //swapping largest elements to end
                if (products[j].productName.compareToIgnoreCase(products[j + 1].productName) > 0) {
                    //here checking that if product[j]>product[j+1] then we swap
                    //to swap
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }

    // Binary search
    public static Product binarySearch(Product[] products, String name) {
        int low = 0;
        int high = products.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0)//we found the product
                return products[mid];
            else if (cmp < 0)//when the product which we are searching is larger than mid value we are making low as mid+1
                //so that we are searching from mid+1 value to end
                low = mid + 1;
            else//when the product we are searching is less than mid value
                high = mid - 1;
        }

        return null;
    }
}


public class ECommerceSearch {
    public static void main(String[] args) {
        Product[] items = {
                new Product("P003", "Watch", "Accessories"),
                new Product("P001", "Headphones", "Electronics"),
                new Product("P002", "Notebook", "Stationery"),
                new Product("P004", "Shoes", "Footwear"),
                new Product("P005","Laptop","Electronics")
        };

        System.out.println("Linear Search");
        String Target = "Shoes";
        Product Result = LinearSearchProduct.linearSearch(items, Target);
        if (Result != null)
            System.out.println("Found: " + Result);
        else
            System.out.println("Product not found");

        System.out.println("Binary Search");
        BinarySearchProduct.sortByName(items);
        String binaryTarget = "Notebook";
        Product binaryResult = BinarySearchProduct.binarySearch(items, binaryTarget);
        if (binaryResult != null)
            System.out.println("Found: " + binaryResult);
        else
            System.out.println("Product not found");
    }
}
/*"C:\Program Files\Java\jdk-17\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2024.3.4.1\lib\idea_rt.jar=65089" -Dfile.encoding=UTF-8 -classpath C:\Users\narub\IdeaProjects\ds-exercise2\out\production\ds-exercise2 ECommerceSearch
Linear Search
Found: P004 , Shoes , Footwear
Binary Search
Found: P002 , Notebook , Stationery

Process finished with exit code 0
*/
