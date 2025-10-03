package Friday103;

import java.util.Scanner;

public class Q3DivisbleBy5 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = input.nextInt();

        if (number % 5 == 0) {
            System.out.println(number + " is divisable by 5");
        } else {
            System.out.println(number + " is not divisable by 5");
        }
        input.close();
    }

}
