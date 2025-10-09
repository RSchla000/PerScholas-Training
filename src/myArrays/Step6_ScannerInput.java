package myArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Step6_ScannerInput {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Customer> list = new ArrayList<>();
        System.out.println("How many customers will you enter?");
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++){
            System.out.printf("Customer %d name: ",i +1);
            String name = sc.nextLine().trim();
            System.out.print("age: ");
            int age = Integer.parseInt(sc.nextLine().trim());

            list.add(new Customer(name,age));
        }
        System.out.println("\nYou entered:");
        for (Customer c : list){
            System.out.println(c);
        }
        sc.close();
    }
}
