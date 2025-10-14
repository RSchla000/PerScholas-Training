package HumanResources;

public class Task4 {
    static void main(String[] args) {
        Ob05_Employee e1= new Ob05_Employee("Noah");
        Ob05_Employee e2= new Ob05_Employee("Olivia");
        e1.empSalary(70000);
        e2.empSalary(85000);
        if (e1.salary > e2.salary){
            System.out.println(e1.name + "has a higher salary");
        }else{
            System.out.println(e2.name + " has the higher salary");
        }

    }
}
