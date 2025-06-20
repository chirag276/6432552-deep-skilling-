public class Singleton {
    // Step 1: Create a private static instance
    private static Singleton instance;

    // Step 2: Make constructor private so it cannot be called from outside
    private Singleton() {
        System.out.println("Singleton Instance Created");
    }

    // Step 3: Provide public method to return the instance
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton(); // Lazy Initialization
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
