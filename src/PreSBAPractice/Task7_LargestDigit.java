package PreSBAPractice;

public class Task7_LargestDigit {
    static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int max = 0;
        while(num > 0){
            int digit = num % 10;
            if(digit > max){
                max = digit;
            }
            num /= 10;
        }
        System.out.println("Largest digit: " + max);
    }
}
