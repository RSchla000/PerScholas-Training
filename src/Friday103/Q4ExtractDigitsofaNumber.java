package Friday103;

import java.util.Scanner;

public class Q4ExtractDigitsofaNumber {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num == 0) {
            System.out.println(0);
        } else {
            while (num != 0) {
                int digit = num % 10;
                System.out.println(digit);
                num = num / 10;
            }
        }
        scanner.close();
    }
}
