package LambdaFunctoinInterface;

public class Example3 {
    static void main(String[] args) {
        Adder sum = (a,b) -> a+b;
        System.out.println(sum.add(4,5));
    }
}
