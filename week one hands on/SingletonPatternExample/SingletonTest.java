// File: SingletonTest.java
public class SingletonTest {

    public static void main(String[] args) {
        // Step 4: Get Logger instance
        Logger logger1 = Logger.getInstance();
        logger1.log("Application Started");

        // Step 4: Get Logger instance again
        Logger logger2 = Logger.getInstance();
        logger2.log("Performing Logging Task");

        // Step 4: Validate if both are same instance
        if (logger1 == logger2) {
            System.out.println("✅ Singleton Confirmed: Both loggers are same instance.");
        } else {
            System.out.println("❌ Singleton Failed: Different instances found.");
        }
    }
}
