package Banking;

public class Account {
    private double balance;

    public void deposit(double amount){
        this.balance += amount;
    }
    public double getBalance(){
        return this.balance;
    }
    public void withdraw(double amount) {
        if (amount <= this.balance) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance for " + this.customerName);
        }
    }
    public void transferTo(Account other,double amount){
        if (amount <= this.balance){
            this.withdraw(amount);
            other.deposit(amount);
        }else{
            System.out.println("Transfer failed: Insufficient balance in: " +this.customerName+"'s account");
        }
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerName() {
        return customerName;
    }

    private String customerName;

}

