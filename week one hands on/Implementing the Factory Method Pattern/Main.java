import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ProductFactory factory = new ProductFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.print("🔍 Enter product type (e.g., basic): ");
        String type = scanner.nextLine();

        Product product = factory.createProduct(type);
        if (product != null) {
            product.displayInfo();
        } else {
            System.out.println("❌ Product creation failed.");
        }

        scanner.close();
    }
}
