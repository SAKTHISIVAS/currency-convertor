import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define conversion rates
        double usdToEurRate = 0.85;
        double eurToUsdRate = 1.18;

        System.out.println("Currency Converter");
        System.out.println("1: USD to EUR");
        System.out.println("2: EUR to USD");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        double amount;
        double convertedAmount;

        switch (choice) {
            case 1:
                System.out.print("Enter amount in USD: ");
                amount = scanner.nextDouble();
                convertedAmount = amount * usdToEurRate;
                System.out.printf("%.2f USD is %.2f EUR\n", amount, convertedAmount);
                break;
            case 2:
                System.out.print("Enter amount in EUR: ");
                amount = scanner.nextDouble();
                convertedAmount = amount * eurToUsdRate;
                System.out.printf("%.2f EUR is %.2f USD\n", amount, convertedAmount);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }

        scanner.close();
    }
}