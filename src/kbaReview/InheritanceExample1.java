package kbaReview;

class Vehicle {
    public int wheels;

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }

    public Vehicle() {

    }

    public void move() {
        System.out.println("The vehicle is moving.");
    }
}

// Child class (Subclass) that extends Vehicle
class Car extends Vehicle {
    public int doors;
    String color;

    // Constructor for Car, which calls the parent constructor using `super()`
    Car(String color, int wheels, int doors) {
        super(wheels); // Calls the Vehicle constructor
        this.color = color;
        this.doors = doors;
    }

    public Car() {
        super();
    }

    public void honk() {
        System.out.println("The car honks: Beep, beep!");
    }
}

public class InheritanceExample1 {
    public static void main(String[] args) {
        // Create an instance of the Car class
        // This will call the parameterized constructor
        Car myCar = new Car("Red", 4, 4);

        // Access properties inherited from Vehicle
        System.out.println("The car has " + myCar.wheels + " wheels.");

        // Access the Car's own properties
        System.out.println("The car has " + myCar.doors + " doors and is " + myCar.color + ".");

        // Call the inherited method from Vehicle
        myCar.move();

        // Call the method specific to the Car class
        myCar.honk();
    }
}