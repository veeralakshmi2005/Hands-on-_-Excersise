public class BinarySearch {

    public static void binarySearch(Product[] products, int key) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].productId == key) {
                System.out.println("Product Found: " + products[mid].productName);
                return;
            }

            if (key < products[mid].productId) {
                high = mid - 1;
            } else {
                low = mid + 1;
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

        binarySearch(products, 104);
    }
}