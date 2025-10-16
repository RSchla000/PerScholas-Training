package Composition;

public class Company {
    Employee[] employees;
    Company(Employee[] employees){
        this.employees = employees;
    }
    void displayHighSalary(){
        System.out.println("Employee earning above $50,000:");
        for (Employee e : employees){
            if (e.salary > 50000){
                System.out.printf("Name: %s, Salary: %.2f%n", e.name,e.salary);
            }
        }
    }
}
