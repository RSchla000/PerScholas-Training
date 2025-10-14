package Tuesday1014;

public class Step3_ReturnValue {
    static void main(String[] args) {
        int s = sum (5,6);
        System.out.println("Sum returned: " +s);
    }
    public static int sum (int a , int b){
        return a+b;
    }
}
