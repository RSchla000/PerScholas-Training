package myArrays;

import javax.xml.namespace.QName;

public class Customer {

    String name;
    int age;

    Customer(String name, int age){
        this.name=name;
        this.age=age;

    }
    @Override
    public String toString(){
        return name + " - age "+ age;
    }
}
