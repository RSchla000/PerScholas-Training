package Composition;

public class School {
    Student[] students;
    School(Student[] students){
        this.students = students;
    }
    void displayStudents(){
        System.out.println("Students List:");
        for (Student s : students){
            System.out.printf("Name: %s, Grade: %d%n", s.name, s.grade);
        }
    }
}
