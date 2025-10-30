package Thursday1030;

public class Example1 {
    static void main(String[] args) {
        int a = 10;
        int b = 0;
        try{
            int c = a / b;
            System.out.println("Result: " +c);
        }catch (ArithmeticException e){
            System.out.println("Cannot divide by zero!");
        }
        System.out.println("Program continues.");
    }
}
