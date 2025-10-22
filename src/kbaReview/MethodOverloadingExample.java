package kbaReview;

public class MethodOverloadingExample {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // (4) create object

        System.out.println("2 + 3 = " + calc.add(2, 3)); // (5) calls first method
        System.out.println("1 + 2 + 3 = " + calc.add(1, 2, 3)); // (6) calls second method
        System.out.println("2.5 + 3.5 = " + calc.add(2.5, 3.5)); // (7) calls third method
    }
}