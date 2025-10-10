package Recap;

import java.util.ArrayList;
import java.util.List;

class CustomerC{
    String name; int age;
    CustomerC(String name, int age){this.name=name; this.age = age;}
    @Override public String toString() {return name + " - age " + age;}
}

public class Step4_MultipleHardcoded {

    static void main(String[] args) {
        List<CustomerC> list = new ArrayList<>();
        list.add(new CustomerC("Ivy",6));
        list.add(new CustomerC("Leo",12));
        list.add(new CustomerC("Nia",10));

        for (CustomerC c : list){
            System.out.println(c);
        }
    }
}
