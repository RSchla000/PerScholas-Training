package kbaReview;

class Employee{
    protected String name;
    public Employee(String name){this.name = name;}
    public double calculateSalary(){return 0;}
}
class Manager extends Employee{
    private double bonus;
    public Manager(String name, double bonus) {super(name);
    this.bonus = bonus;}
    @Override
    public double calculateSalary(){return 5000 + bonus;}
}
class Developer extends Employee{
    private double overtime;
    public Developer(String name, double overtime){ super(name);
    this.overtime=overtime;}
    @Override
    public double calculateSalary(){return 4000 + overtime;}
}
public class Polymorphism3 {
    static void main(String[] args) {

        Employee[] employees = {
                new Manager("Alice", 1000),
                new Developer("Bob", 500)
        };
        for (Employee e : employees) {
            System.out.println(e.name + "salary" + e.calculateSalary());
        }
    }
}