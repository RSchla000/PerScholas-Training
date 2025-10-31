package LambdaFunctoinInterface;

public class Example2 {
    static void main(String[] args) {
        Greeter g = name -> System.out.println("Hello, " +name+ "!");
        g.greet("Alex");
    }
}
