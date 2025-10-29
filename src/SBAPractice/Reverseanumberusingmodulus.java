package SBAPractice;

public class Reverseanumberusingmodulus {
    static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int reverse = 0;
        while(num > 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number: " + reverse);
    }
}
