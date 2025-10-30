package Thursday1030;

public class Throwexample1 {
    public static void main(String[] args){
        int a = 10, b = 10;
        if(b==0){
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println(a/b);
    }
}
