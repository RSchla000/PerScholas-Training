package myArrays;

public class Step2_ArrayNames {

    static void main(String[] args) {
        String[] names={"Ivy","Leo","Nia"};
        int[] ages={1,2,3};
        for (String name:names){
            System.out.println(name+"- name");
        }
        for (int age:ages){
            System.out.println(age+ "- age");
        }
    }
}
