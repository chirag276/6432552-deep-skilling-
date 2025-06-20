import java.util.Scanner;

public class FinancialForecast {

    // Recursive method to calculate forecasted value
    public static double forecast(double[] revenue, int monthsToPredict) {
        if (monthsToPredict == 0) {
            return revenue[revenue.length - 1];
        }

        // Calculate growth rate from last two months
        double last = revenue[revenue.length - 1];
        double secondLast = revenue[revenue.length - 2];
        double growthRate = (last - secondLast) / secondLast;

        // Forecast next value
        double nextValue = last + (last * growthRate);

        // Create new array with updated revenue
        double[] newRevenue = new double[revenue.length + 1];
        System.arraycopy(revenue, 0, newRevenue, 0, revenue.length);
        newRevenue[newRevenue.length - 1] = nextValue;

        return forecast(newRevenue, monthsToPredict - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("📅 Enter number of past months of data: ");
        int n = scanner.nextInt();
        double[] revenue = new double[n];

        System.out.println("💰 Enter monthly revenue:");
        for (int i = 0; i < n; i++) {
            revenue[i] = scanner.nextDouble();
        }

        System.out.print("🔮 Enter number of months to forecast: ");
        int m = scanner.nextInt();

        double forecasted = forecast(revenue, m);
        System.out.printf("📈 Forecasted revenue after %d months: ₹%.2f\n", m, forecasted);

        scanner.close();
    }
}
