package Banking;

public class Task10 {
    public static double[] projectBalances(Account2[] accounts, double annualRatePercent, int months) {
        // (2) compute monthly rate
        double monthlyRate = annualRatePercent / 1200.0; // percent -> fraction per month

        double[] projection = new double[accounts.length]; // (3)
        for (int i = 0; i < accounts.length; i++) {
            double bal = accounts[i].getBalance();
            // (4) compound monthly using Math.pow for precision
            double factor = Math.pow(1.0 + monthlyRate, months); // (4.1)
            projection[i] = bal * factor; // (4.2)
        }
        return projection;
    }

    public static void main(String[] args) {
        Account2[] accounts = new Account2[] {
                new Account2("Mason", 1000.00),
                new Account2("Olivia", 2500.00),
                new Account2("Ravi", 350.25)
        };

        double annualRate = 3.6; // 3.6% per year
        int months = 12; // project 12 months

        double[] projected = projectBalances(accounts, annualRate, months);
        System.out.println("Projected balances after " + months + " months at " + annualRate + "%:");
        for (int i = 0; i < accounts.length; i++) {
            System.out.println(accounts[i].getCustomerName() + " -> " + String.format("%.2f", projected[i]));
        }
    }
}