package Banking;

import java.util.Arrays;
import java.util.Comparator;

public class Task6 {
    public static void main(String[] args) {
        // (2) create an array of Account objects
        Account2[] accounts = new Account2[] {
                new Account2("Zoe", 2500.00),
                new Account2("Adam", 1200.50),
                new Account2("Maya", 980.75),
                new Account2("Bella", 3050.00)
        };

        // (3) compute total and average
        double total = 0.0; // (3.1)
        for (int i = 0; i < accounts.length; i++) {
            total += accounts[i].getBalance(); // (3.2)
        }
        double average = total / accounts.length; // (3.3)

        // (4) sort by customer name
        Arrays.sort(accounts, Comparator.comparing(Account2::getCustomerName)); // (4.1)

        // (5) output results
        System.out.println("Total balance across accounts: " + String.format("%.2f", total)); // (5.1)
        System.out.println("Average balance: " + String.format("%.2f", average)); // (5.2)
        System.out.println("Accounts (sorted by name):"); // (5.3)
        for (Account2 a : accounts) {
            System.out.println(" - " + a);
        }
    }
}
