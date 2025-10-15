package Banking;

public class Task4 {
    public static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.setCustomerName("Bob Smith");
        bobsAccount.deposit(500);

        bobsAccount.withdraw(600);

        System.out.println("Balance after withdrawal: $" + bobsAccount.getBalance());
    }
}
