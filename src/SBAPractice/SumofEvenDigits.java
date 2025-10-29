package SBAPractice;

import java.util.Scanner;

public class SumofEvenDigits {
    static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0){
            int digit = num % 10;
            if(digit % 2 == 0){
                sum += digit;
            }
            num /= 10;
        }
    System.out.println("Sum of even digits: " + sum);

        sc.close();
    }
}
