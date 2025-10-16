package Composition;

public class Task2 {
    static void main(String[] args) {
        Student[]stArr = {
                new Student("John",90),
                new Student("Emma",85),
                new Student("Liam",78)
        };
        School school = new School(stArr);
        school.displayStudents();
    }
}
