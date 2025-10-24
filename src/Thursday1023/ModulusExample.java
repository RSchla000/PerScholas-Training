package Thursday1023;

public class ModulusExample {
    static void main(String[] args) {
        for (int i = 0; i <= 10 ; i++) {
            if(i % 3 == 0){
                continue;
            }
            if(i == 8){
                break;
            }
            System.out.println(i);
        }
    }
}
