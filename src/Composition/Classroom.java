package Composition;

public class Classroom {
    Subject[] subjects;
    Classroom(Subject[] subjects){
        this.subjects = subjects;
    }

    void totalMarks(){
        int total = 0;
        for (Subject s : subjects){
            total += s.marks;
        }
        System.out.println("Total Marks: " + total);
    }
}
