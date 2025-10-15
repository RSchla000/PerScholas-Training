package Banking;

import java.util.Arrays;

public class Task9 {
    public static Account2[] consolidate(Account2[] input) {
        Account2[] temp = new Account2[input.length];
        int uniqueCount = 0;

        for (int i = 0; i < input.length; i++) {
            String name = input[i].getCustomerName();
            double bal = input[i].getBalance();

            // (2) search for name in temp[0..uniqueCount-1]
            int found = -1;
            for (int j = 0; j < uniqueCount; j++) {
                if (temp[j].getCustomerName().equals(name)) {
                    found = j;
                    break;
                }
            }

            if (found != -1) {
                // (3) merge balances
                temp[found].setBalance(temp[found].getBalance() + bal);
            } else {
                // (4) add new unique account
                temp[uniqueCount++] = new Account2(name, bal);
            }
        }

        // (5) trim to uniqueCount
        return Arrays.copyOf(temp, uniqueCount);
    }

    public static void main(String[] args) {
        Account2[] input = new Account2[] {
                new Account2("Alex", 100.0),
                new Account2("Ben", 200.0),
                new Account2("Alex", 300.0),
                new Account2("Cleo", 50.0),
                new Account2("Ben", 100.0)
        };

        Account2[] consolidated = consolidate(input);
        System.out.println("Consolidated accounts:");
        for (Account2 a : consolidated) System.out.println(" - " + a);
    }
}
