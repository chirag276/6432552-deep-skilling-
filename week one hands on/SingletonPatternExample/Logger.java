// File: Logger.java
public class Logger {

    // Step 2: Private static instance of Logger
    private static Logger instance;

    // Step 2: Private constructor to prevent instantiation
    private Logger() {
        System.out.println("Logger Initialized");
    }

    // Step 2: Public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // only creates once
        }
        return instance;
    }

    // Step 3: Logging method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
}
