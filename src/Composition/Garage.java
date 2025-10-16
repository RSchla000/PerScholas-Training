package Composition;

public class Garage {
    Car[] cars;
    Garage(Car[] cars){
        this.cars = cars;
    }
    void mostExpensiveCar(){
        if (cars.length==0) return;
        Car max = cars[0];
        for(Car c : cars){
            if (c.price > max.price){
                max = c;
            }
        }
        System.out.printf("Most expensive car: %s, Price: %.2f%n", max.brand,max.price);
    }
}
