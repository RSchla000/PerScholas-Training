package PreSBAPractice2;

public class Task7Findthelargestnumber {
    static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter number");
        int num = sc.nextInt();
        int max = 0;
        while(num > 0 ){
            int digit = num % 10;
            if(digit > max){
                max = digit;
            }
            num /= 10;
        }
        System.out.println("Largest digit: " + max);

    }
}
