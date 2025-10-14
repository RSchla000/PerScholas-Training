package HumanResources;

public class OB05_EmployeeImpl {
    static void main(String[] args) {
        Ob05_Employee empOne = new Ob05_Employee("James Smith");
        Ob05_Employee empTwo = new Ob05_Employee("Mary Anne");
         empOne.empAge(26);
         empOne.empDesignation("Senior Software Engineer");
         empOne.empSalary(1000);
         empOne.printEmployee();

         empTwo.empAge(21);
         empTwo.empDesignation("Software Engineer");
         empTwo.empSalary(500);
         empTwo.printEmployee();
    }
}
