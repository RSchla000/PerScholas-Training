package Banking;

import java.util.Arrays;
import java.util.Comparator;

public class Task8 {

    public static Account[] topK(Account2[] accounts, int K) {
        // (2) clone to avoid mutating original array if needed
        Account2[] copy = Arrays.copyOf(accounts, accounts.length); // (2.1)
        // (3) sort descending
        //Arrays.sort(copy, Comparator.comparingDouble(Account::getBalance).reversed()); // (3.1)
        // (4) bound K
        int resultSize = Math.min(K, copy.length); // (4.1)
        Account[] result = new Account[resultSize];
        System.arraycopy(copy, 0, result, 0, resultSize); // (4.2)
        return result;
    }

    public static void main(String[] args) {
        Account2[] accounts = new Account2[] {
                new Account2("Ana", 2200.00),
                new Account2("Bob", 4500.50),
                new Account2("Cara", 300.00),
                new Account2("Dan", 990.00)
        };

        // (5) get top 2
        Account[] top2 = topK(accounts, 2);
        System.out.println("Top 2 accounts by balance:");
        for (Account a : top2) {
            System.out.println(" - " + a);
        }
    }
}