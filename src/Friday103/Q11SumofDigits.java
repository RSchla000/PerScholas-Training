package Friday103;

import java.util.Scanner;

public class Q11SumofDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int originalNumber = number;
        int sum = 0;
        int step = 1;

        System.out.println("\nStep-by-step calculation:");

        if (number < 0) {
            number = Math.abs(number);
            System.out.println("Processing absolute value of the number: " + number);
        }

        if (number == 0) {
            System.out.println("Step " + step + ": The number is 0. Sum of digits is 0.");
        } else {
            while (number > 0) {
                int digit = number % 10;
                System.out.println("Step " + step + ": Current number = " + number + ", extracted digit = " + digit);
                sum += digit;
                System.out.println("        Current sum = " + sum);
                number /= 10;
                step++;
            }
        }
    }
}
