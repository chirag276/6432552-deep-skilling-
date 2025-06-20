public class ProductFactory {

    // Factory Method
    public Product createProduct(String type) {
        if (type.equalsIgnoreCase("basic")) {
            return new BasicProduct();
        }
        // Open/Closed Principle: easy to add new types
        System.out.println("⚠️ Unknown product type: " + type);
        return null;
    }
}
