package Recap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class CustomerD {
    String name; int age;
    CustomerD(String name, int age) { this.name = name; this.age = age; }
    @Override public String toString() { return name + " - age " + age; }
}

public class Step5_InputSingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);      // (1) create scanner to read typing
        List<CustomerD> list = new ArrayList<>(); // (2) create list to hold customers

        System.out.print("Enter customer name: "); // (3)
        String name = sc.nextLine().trim();        // (4) read name typed by kid

        System.out.print("Enter age: ");           // (5)
        int age = Integer.parseInt(sc.nextLine().trim()); // (6) read age

        list.add(new CustomerD(name, age));        // (7) add to list

        System.out.println("\nCustomer entered:"); // (8)
        for (CustomerD c : list) {                 // (9)
            System.out.println(c);                 // (10)
        }

    }
}