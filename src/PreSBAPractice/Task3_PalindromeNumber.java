package PreSBAPractice;

public class Task3_PalindromeNumber {
    static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in); //(1) Scanner

        System.out.print("Enter a number: ");
        int num = sc.nextInt();   //(2) Read Input
        int original = num;      //(3) Store original number
        int reverse = 0;      //(4) Initialize reverse

        while(num > 0){         //(5) Reverse the number
            int digit = num % 10;   //(6) Get last digit
            reverse = reverse * 10 + digit; //(7) Build reverse
            num /= 10;          //(8) Remove last digit
        }
        if(reverse == original) {
            System.out.println(original + " is a palindrome"); //(10)
        }else{
            System.out.println(original + "is not a palindrome"); //(11)
        }

    }
}
