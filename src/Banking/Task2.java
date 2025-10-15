package Banking;

public class Task2 {
    static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.setCustomerName("Bob Smith");
        bobsAccount.deposit(500);
        System.out.println ("Balance: $ " + bobsAccount.getBalance());
    }
}
