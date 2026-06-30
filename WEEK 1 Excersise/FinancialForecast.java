import java.util.Scanner;

public class FinancialForecast {

    public static double futureValue(double amount, double rate, int years) {

        if (years == 0) {
            return amount;
        }

        return futureValue(amount, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Initial Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Growth Rate (e.g., 0.10 for 10%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter Number of Years: ");
        int years = sc.nextInt();

        double result = futureValue(amount, rate, years);

        System.out.println("Future Value after " + years + " years = " + result);

        sc.close();
    }
}