import java.util.Arrays;
import java.util.Scanner;

public class EcommerceSearch {
    public static void main(String[] args) {
        // List of product names (sorted)
        String[] products = {
            "Air Conditioner", "Bluetooth Speaker", "Camera", "Charger",
            "Earphones", "Keyboard", "Laptop", "Mobile", "Monitor",
            "Mouse", "Printer", "Smart Watch", "Tablet", "TV", "Webcam"
        };

        // Sort the product list
        Arrays.sort(products);

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("🔎 Enter product to search: ");
        String query = scanner.nextLine();
        scanner.close(); // ✅ Avoid resource leak

        // Perform binary search
        int result = Arrays.binarySearch(products, query);

        if (result >= 0) {
            System.out.println("✅ Product found: " + products[result]);
        } else {
            System.out.println("❌ Product not found.");
        }
    }
}