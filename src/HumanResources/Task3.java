package HumanResources;

import java.util.Scanner;

public class Task3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee name:");
        String name = sc.nextLine();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter designation:");
        String desig = sc.nextLine();
        System.out.println("Enter salary:");
        double salary = sc.nextDouble();
        Ob05_Employee emp = new Ob05_Employee(name);
        emp.empAge(age);
        emp.empDesignation(desig);
        emp.empSalary(salary);
        emp.printEmployee();
        sc.close();

    }
}
