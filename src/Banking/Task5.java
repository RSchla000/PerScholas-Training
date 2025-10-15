package Banking;

public class Task5 {
    static void main(String[] args) {
        Account bob = new Account();
        bob.setCustomerName("Bob");
        bob.deposit(500);

        Account alice = new Account();
        alice.setCustomerName("Alice");

        bob.transferTo(alice,200);

        System.out.println("Bob's balance: $" + bob.getBalance());
        System.out.println("Alice's balance: $" +alice.getBalance());
    }
}
