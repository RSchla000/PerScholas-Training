package Recap;


import java.util.ArrayList;
import java.util.List;

class CustomerB{
    String name;
    int age;
    CustomerB(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override public String toString(){
        return name + " -age " + age;
    }
}

public class Step3_ArrayListSingle {
    static void main(String[] args) {
        List<CustomerB> list = new ArrayList<>();
        list.add(new CustomerB("Ivy",6));
        for (CustomerB c : list){
            System.out.println(c);
        }
    }
}
