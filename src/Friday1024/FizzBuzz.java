package Friday1024;

import java.util.Scanner;

public class FizzBuzz {

    public static void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");  // divisible by both 3 and 5
            } else if (i % 3 == 0) {
                System.out.println("Fizz");      // divisible by 3 only
            } else if (i % 5 == 0) {
                System.out.println("Buzz");      // divisible by 5 only
            } else {
                System.out.println(i);           // not divisible by 3 or 5
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int n = Integer.parseInt(sc.nextLine().trim());

        // Call FizzBuzz function
        fizzBuzz(n);

        sc.close();
    }
}
