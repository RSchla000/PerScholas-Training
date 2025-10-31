package LambdaFunctoinInterface;

public class Example1 {
    static void main(String[] args) {
        Greeter g = new Greeter(){
        @Override
        public void greet(String name){
            System.out.println("Hello, " +name+ "!");
        }
        };
        g.greet("Alex");
    }
    }

