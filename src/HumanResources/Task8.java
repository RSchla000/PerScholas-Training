package HumanResources;

public class Task8 {
    static class OB05_Employee{
        String name;
        int age;
        String designation;
        double salary;

        public OB05_Employee(String name){this.name = name;}
        public void empAge(int empAge) {age=empAge;}
        public void empDesignation(String empDesig){designation = empDesig;}
        public void empSalary(double empSalary){salary = empSalary;}
        public void printEmployee(){
            System.out.println("Name: " + name + " ,Age " + age + ", Designation: " + designation + ", Salary " +salary);
        }
    }
    static OB05_Employee findbyDesignation(OB05_Employee[] arr, String desig){
        for (OB05_Employee e: arr){
            if (e.designation != null && e.designation.equalsIgnoreCase(desig)){
                return e;
            }
        }
        return null;
    }
    static void main(String[] args) {
     OB05_Employee[] emps = new OB05_Employee[3];
     emps[0] = new OB05_Employee("Liam");
     emps[0].empDesignation("Developer");
     emps[1] = new OB05_Employee("Mia");
     emps[1].empDesignation("Manager");
     emps[2] = new OB05_Employee("Lucas");
     emps[2].empDesignation("Tester");

     String need = "Manager";
     OB05_Employee found = findbyDesignation(emps, need);
     if (found != null) {
         System.out.println("Found employee for designation \"" + need + "\":");
         found.printEmployee();
     }else{
         System.out.println("No employee found with designation \"" +need + "\".");
     }
    }
}
