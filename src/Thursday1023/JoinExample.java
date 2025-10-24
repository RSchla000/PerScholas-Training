package Thursday1023;

public class JoinExample {
    static void main(String[] args) {
        String[] fruits = {"Apple","Banana","Cherry"};
        String result = String.join(",",fruits);
        System.out.println("Fruits: "+result);
    }
}
