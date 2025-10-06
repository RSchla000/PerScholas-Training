package Monday106;

public class MathHelper {
    int addNumbers(int a, int b){
        return a+b;
    }

    static void main(String[] args) {
        MathHelper helper = new MathHelper();
        int sum = helper.addNumbers(5,10);
        System.out.println("Sum is: "+sum);
    }
}
