import java.util.Scanner;

public class FinancialForecast {

    // Forecast using simple moving average
    public static double forecastNextMonth(double[] revenues, int windowSize) {
        if (revenues.length < windowSize) {
            System.out.println("❌ Not enough data to forecast.");
            return -1;
        }

        double sum = 0;
        for (int i = revenues.length - windowSize; i < revenues.length; i++) {
            sum += revenues[i];
        }

        return sum / windowSize;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("📅 Enter number of months of data: ");
        int n = scanner.nextInt();

        double[] revenues = new double[n];
        System.out.println("💰 Enter revenue for each month:");
        for (int i = 0; i < n; i++) {
            System.out.print("Month " + (i + 1) + ": ");
            revenues[i] = scanner.nextDouble();
        }

        System.out.print("🔁 Enter window size for moving average (e.g., 3): ");
        int window = scanner.nextInt();

        double forecast = forecastNextMonth(revenues, window);
        if (forecast != -1) {
            System.out.printf("📊 Forecasted revenue for next month: ₹%.2f\n", forecast);
        }

        scanner.close();
    }
}
