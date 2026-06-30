public class LinearSearch {

    public static void linearSearch(Product[] products, int key) {

        for (int i = 0; i < products.length; i++) {
            if (products[i].productId == key) {
                System.out.println("Product Found: " + products[i].productName);
                return;
            }
        }

        System.out.println("Product Not Found");
    }

    public static void main(String[] args) {

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mobile", "Electronics"),
            new Product(103, "Shoes", "Fashion"),
            new Product(104, "Watch", "Accessories")
        };

        linearSearch(products, 103);
    }
}