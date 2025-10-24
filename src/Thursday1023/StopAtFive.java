package Thursday1023;

public class StopAtFive {
    static void main(String[] args) {
        for (int i = 1; i <= 10 ; i++) {
            if (i%5 ==0){
                System.out.println("Found a number divisable by 5: " +i);
                break;
            }
            System.out.println("Checking: " +i);

        }
    }
}
