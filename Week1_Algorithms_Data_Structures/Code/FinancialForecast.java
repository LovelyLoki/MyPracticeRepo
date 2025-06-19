import java.util.*;

public class FinancialForecast {
    public static List<Double> forecastRevenue(int[] revenues, int k) {
        List<Double> forecast = new ArrayList<>();
        double sum = 0.0;
        for (int revenue : revenues) {
            sum += revenue;
        }
        double average = sum / revenues.length;

        for (int i = 0; i < k; i++) {
            forecast.add(average);
        }

        return forecast;
    }

    public static void main(String[] args) {
        int[] revenues = {100, 200, 150, 300, 250};
        int k = 3;

        List<Double> forecast = forecastRevenue(revenues, k);
        System.out.println("Forecasted Revenue for next " + k + " days: " + forecast);
    }
}
