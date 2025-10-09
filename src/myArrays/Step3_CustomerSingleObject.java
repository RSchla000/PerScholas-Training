package myArrays;

public class Step3_CustomerSingleObject {

    static void main(String[] args) {
        Customer c = new Customer("Ivy",6);
        Customer d = new Customer("Leo",7);
        Customer e = new Customer("Nia",8);
        Customer f = new Customer("Kim",9);

        System.out.println("Name = "+c.name +" Age = "+c.age);
        System.out.println("Name = "+d.name+"Age = "+d.age);
        System.out.println("Name = "+e.name +" Age = "+e.age);
        System.out.println("Name = "+f.name +" Age = "+f.age);
    }
}
