package Tuesday1014;

public class Step5_SimpleCustomer {
    static class Customer5{
        public String name;
        public int age;

        public Customer5(String name, int age){
            this.name = name;
            this.age = age;
        }
    }
    public static void main() {
        Customer5 c = new Customer5("Ivy",6);
        System.out.println("Customer: " +c.name+ " - age " +c.age);
    }
}
