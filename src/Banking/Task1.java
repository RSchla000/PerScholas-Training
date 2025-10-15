package Banking;

public class Task1 {
    static void main(String[] args) {
        Account bobsAccount = new Account();
        bobsAccount.setCustomerName("Bob Smith");
        System.out.println("Customer name: " + bobsAccount.getCustomerName());
    }
}
