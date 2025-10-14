package HumanResources;

public class Task9 {
    static class EmployeeSafe{
        private String name;
        private int age;
        private String designation;
        private double salary;

        public EmployeeSafe(String name){
            this.name = name;
        }
        public String getName(){return name;}
        public int getAge(){return age;}
        public String getDesignation(){ return designation;}
        public double getSalary(){return salary;}

        public void setAge(int age){this.age = age;}
        public void setDesignation(String designation){this.designation = designation;}
        public void setSalary(double salary){this.salary = salary;}

        public void printEmployee(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Designation: " + designation);
            System.out.println("Salary: " + salary);
        }
    }
    static void main(String[] args) {
     EmployeeSafe e = new EmployeeSafe("Sophia");
     e.setAge(29);
     e.setDesignation("Designer");
     e.setSalary(72000.0);
     System.out.println(e.getName() + "-" + e.getDesignation() + "-$" + e.getSalary());
     System.out.println("\n Full details:");
     e.printEmployee();

    }
}
