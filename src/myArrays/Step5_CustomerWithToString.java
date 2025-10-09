package myArrays;

public class Step5_CustomerWithToString {

    static void main(String[] args) {

        Customer[] customers02= {
                new Customer("Rob", 40),
                new Customer("Sue", 40),
                new Customer("Dom", 24),
                new Customer("Jamie", 36)
        };
                for (Customer customer:customers02){
                    System.out.println(customer);
                }
        }

    }
