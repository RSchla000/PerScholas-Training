package myArrays;

public class Step4_CustomerArrayHardcoded {

    static void main(String[] args) {

        Customer[] customers={
                new Customer("Ivy",6),
                new Customer("Leo",7),
                new Customer("Nia",8),
                new Customer("Kim",9)
        };

        for (Customer customer:customers){
            System.out.println("Student Name = "+customer.name+" Age = "+customer.age);
        }

    }
}
