package Composition;

public class Person {
    String name;
    int age;
    Address address;

    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }
        public void displayPerson(){
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Address: ");
            address.displayAddress();
        }
    }
