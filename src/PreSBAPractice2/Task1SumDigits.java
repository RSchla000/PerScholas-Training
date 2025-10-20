package PreSBAPractice2;

import java.util.Scanner;

public class Task1SumDigits {
    static void main(String[] args) {
        java.util.Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number");
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0){
            int digit = num %10;
            sum += digit;
            num /= 10;

            System.out.println("Sum of digits: " + sum);
        }

    }
}
