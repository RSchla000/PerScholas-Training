package Monday106;

public class StudentInfo {
    void showName(String name){
        System.out.println("Student Name: " +name);
    }
    void showDetails(String name, int age){
        showName(name);
        System.out.println("Age: " +age);

    }

    static void main(String[] args) {
        StudentInfo s = new StudentInfo();
        s.showDetails("Ava", 14);
    }
}
