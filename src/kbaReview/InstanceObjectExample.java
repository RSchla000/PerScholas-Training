package kbaReview;

public class InstanceObjectExample {
    public static void main(String[] args) {
        Car car1 = new Car();   // (1) first instance
        Car car2 = new Car();  // (2) second instance

        System.out.println("Car 1 color: " + car1.color); // Red
        System.out.println("Car 2 color: " + car2.color); // Blue
    }
}
