package PreSBAPractice;

public class Task2_ReverseNumber {
    static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);  //(1) Scanner input
        System.out.print("Enter a number: ");
        int num = sc.nextInt();      //(2) Read number

        int reverse = 0;           //(3) Initialize reverse

        while(num > 0) {            //(4) Loop until number is 0
            int digit = num % 10;   //(5) Extract last digit
            reverse = reverse * 10 + digit;    //(6) Append digit to reverse
            num /= 10;            //(7) Remove last digit
        }
        System.out.println("Reversed number: " + reverse);
    }
}
