package Banking;

public class Account2 {
        private String customerName;
        private double balance;

        public Account2(String customerName, double balance) {
            this.customerName = customerName;
            this.balance = balance;
        }

        public String getCustomerName() {
            return customerName;
        }
    public void setBalance(double balance) {
    }
        public double getBalance() {
            return balance;
        }

    public void deposit(double amount) { if (amount > 0) balance += amount; }
    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) { balance -= amount; return true; }
        return false;
    }

    @Override
        public String toString() {
            return customerName + ": $" + String.format("%.2f", balance);
        }


    }
