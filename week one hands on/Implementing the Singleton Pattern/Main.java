public class Main {
    public static void main(String[] args) {
        // Get Singleton instance
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        // Try to get another instance
        Singleton obj2 = Singleton.getInstance();
        obj2.showMessage();

        // Check if both are the same instance
        System.out.println("Are both objects same? " + (obj1 == obj2));
    }
}
