import java.util.Arrays;
import java.util.Scanner;

public class EcommerceSearch {

    public static int binarySearch(String[] products, String target) {
        int left = 0;
        int right = products.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            int compare = products[mid].compareToIgnoreCase(target);

            if (compare == 0) {
                return mid; // Product found
            } else if (compare < 0) {
                left = mid + 1; // Search right half
            } else {
                right = mid - 1; // Search left half
            }
        }

        return -1; // Product not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {
            "AirPods", "Camera", "Charger", "Headphones", "Keyboard",
            "Laptop", "Monitor", "Mouse", "Smartphone", "Speaker"
        };

        // Sort the product list
        Arrays.sort(products);

        System.out.println("📦 Available Products: " + Arrays.toString(products));
        System.out.print("🔍 Enter product to search: ");
        String input = scanner.nextLine();

        int result = binarySearch(products, input);

        if (result != -1) {
            System.out.println("✅ Product found at position: " + result);
        } else {
            System.out.println("❌ Product not found.");
        }

        scanner.close();
    }
}
