package Composition;

public class Task4 {
    static void main(String[] args) {
        Subject[] subArr = {
                new Subject("Math",85),
                new Subject("Science",90),
                new Subject("English",80)
        };
        Classroom cls = new Classroom(subArr);
                cls.totalMarks();
    }
}
