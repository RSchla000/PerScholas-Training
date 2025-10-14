package HumanResources;

public class Task5 {
    static void main(String[] args) {
        Ob05_Employee[] emps = new Ob05_Employee[3];
        emps[0] = new Ob05_Employee("Mia");
        emps[0].empAge(24);
        emps[0].empDesignation("Intern");
        emps[0].empSalary(30000);
        emps[1] = new Ob05_Employee("Lucas");
        emps[1].empAge(30);
        emps[1].empDesignation("Developer");
        emps[1].empSalary(65000);
        emps[2] = new Ob05_Employee("Sophia");
        emps[2].empAge(40);
        emps[2].empDesignation("Team Lead");
        emps[2].empSalary(90000);
        for (int i = 0; i < emps.length; i++) {
            System.out.println("----Employee " + (i+1)+ "----");
            emps[i].printEmployee();

        }

    }
}
