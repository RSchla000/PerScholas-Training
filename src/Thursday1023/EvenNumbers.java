package Thursday1023;

public class EvenNumbers {
    static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++) {
            if(i%2 != 0){
                continue;
            }
            System.out.println(i);
        }
    }
}
