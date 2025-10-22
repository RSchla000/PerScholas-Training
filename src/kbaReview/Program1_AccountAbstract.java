package kbaReview;

import java.util.ArrayList;
import java.util.List;

public class Program1_AccountAbstract {
    static abstract class Account {
        protected int accountId;
        protected double balance;

        public Account(int accountId, double initial) {
            this.accountId = accountId;
            this.balance = initial;
        }

        public void deposit(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Deposit must be > 0");
            balance += amount;
            System.out.printf("Account %d: depostied %.2f, new balance %.2f%n", accountId, amount, balance);
        }

        public void withdraw(double amount) {
            if (amount <= 0) throw new IllegalArgumentException("Withdraw must be > 0");
            if (amount > balance) throw new IllegalArgumentException("Insufficiant funds");
            balance -= amount;
            System.out.printf("Account %d: withdrew %.2f, new balance %.2f%n", accountId, amount, balance);
        }

        public abstract double calculateIntrest();
    }

    static abstract class SavingsAccount extends Account {
        private double annualRate;

        public SavingsAccount(int id, double initial, double annualRate) {
            super(id, initial);
            this.annualRate = annualRate;
        }
    }
}