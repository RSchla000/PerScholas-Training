package Composition;

public class CompositionDemo {
    static void main(String[] args) {
        Address addr = new Address("123 Main St","New York","10001");
        Address addr2 = new Address("522 Sentner St","Philadelphia","19120");

        Person p = new Person("Alice",25,addr);
        p.displayPerson();
// Task 7.1 included in the 7.0 work here
        Person q = new Person("Rob",40,addr2);
        q.displayPerson();
    }
}
