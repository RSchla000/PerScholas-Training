package Composition;

public class Task3 {
    static void main(String[] args) {
        Employee[] empArr = {
                new Employee("Alice",60000),
                new Employee("Bob",45000),
                new Employee("Charlie",70000)
        };
        Company comp = new Company(empArr);
        comp.displayHighSalary();
    }
}
