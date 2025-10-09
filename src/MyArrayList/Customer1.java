package MyArrayList;

import java.util.ArrayList;
import java.util.List;

public class Customer1 {
    String name;
    int age;
    Customer1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name + " - age " + age;
    }

        static void main(String[] args) {
            List<Customer1> list = new ArrayList<>();
            list.add(new Customer1("Ivy", 6));
            list.add(new Customer1("Leo",12));
            list.add(new Customer1("Nia",10));
            for (Customer1 c : list) {
                if(c.age >= 10)
                  System.out.println(c);

            }
        }
    }
