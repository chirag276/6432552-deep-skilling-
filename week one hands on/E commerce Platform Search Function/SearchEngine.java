import java.util.Arrays;
import java.util.Scanner;

public class SearchEngine {

    // Linear Search by Product Name
    public static int linearSearch(Product[] products, String name) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].productName.equalsIgnoreCase(name)) {
                return i;
            }
        }
        return -1;
    }

    // Binary Search (assumes sorted array)
    public static int binarySearch(Product[] products, String name) {
        int left = 0, right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = products[mid].productName.compareToIgnoreCase(name);

            if (cmp == 0) return mid;
            if (cmp < 0) left = mid + 1;
            else right = mid - 1;
        }

        return -1;
    }

    // Sort Products by name (for Binary Search)
    public static void sortProducts(Product[] products) {
        Arrays.sort(products, (a, b) -> a.productName.compareToIgnoreCase(b.productName));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Product[] products = {
            new Product(101, "Laptop", "Electronics"),
            new Product(102, "Mouse", "Accessories"),
            new Product(103, "AirPods", "Electronics"),
            new Product(104, "Charger", "Accessories"),
            new Product(105, "Smartphone", "Electronics")
        };

        System.out.print("🔍 Enter product name to search: ");
        String query = scanner.nextLine();

        // Linear Search
        int linearIndex = linearSearch(products, query);
        if (linearIndex != -1)
            System.out.println("✅ Found using Linear Search: " + products[linearIndex]);
        else
            System.out.println("❌ Not found in Linear Search");

        // Binary Search
        sortProducts(products); // must sort before binary search
        int binaryIndex = binarySearch(products, query);
        if (binaryIndex != -1)
            System.out.println("✅ Found using Binary Search: " + products[binaryIndex]);
        else
            System.out.println("❌ Not found in Binary Search");

        scanner.close();
    }
}
