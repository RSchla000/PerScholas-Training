package Monday106;

public class CustomerSimple {

    String name;
    int age;
    public CustomerSimple(String name,int age){
            this.name=name;
            this.age=age;
    }
    static void main(String[] args) {

        CustomerSimple c = new CustomerSimple("Ava",10);
        CustomerSimple b = new CustomerSimple("Sharif",4);
        CustomerSimple a = new CustomerSimple("Mike", 13);


        System.out.println("Customer: " +a.name+"    age "+a.age);
        System.out.println("Customer: " +c.name+"    age "+c.age);
        System.out.println("Customer: " +b.name+"    age "+b.age);



    }
}
