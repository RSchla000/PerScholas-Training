package Recap;

// File: Step2_TinyCustomer.java
class CustomerA
{
    String name; // (1) stores name
    int age;     // (2) stores age

    // (3) constructor: creates a new customer with name and age
    CustomerA(String name, int age)
    {
        this.name = name; // (3a)
        this.age = age;   // (3b)
    }

    // (4) make printing nicer
    @Override
    public String toString()
    {
        return name + " - age " + age; // (4)
    }
}




public class Step2_TinyCustomer
{
    public static void main(String[] args)
    {
        // (5) make one Customer and show it
        CustomerA c = new CustomerA("Ivy", 6); // (5)
        System.out.println(c);                 // (6)
    }
}

