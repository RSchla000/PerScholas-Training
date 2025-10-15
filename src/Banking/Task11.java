package Banking;

import java.util.ArrayList;

public class Task11 {
    public static void main(String[] args) {
        ArrayList<Account2> accounts = new ArrayList<>();

        // Dynamically adding accounts
        accounts.add(new Account2("Emma", 1800.50));
        accounts.add(new Account2("Liam", 2200.00));
        accounts.add(new Account2("Sophia", 500.75));

        double annualRate = 4.0; // annual interest
        int months = 24; // project 2 years

        System.out.println("Projected balances after " + months + " months at " + annualRate + "%:");

        for (Account2 acc : accounts) {
            double factor = Math.pow(1.0 + annualRate / 1200.0, months);
            double projected = acc.getBalance() * factor;
            System.out.println(acc.getCustomerName() + " -> " + String.format("%.2f", projected));
        }
    }
}