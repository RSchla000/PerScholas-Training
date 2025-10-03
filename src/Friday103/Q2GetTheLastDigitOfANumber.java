package Friday103;

import java.util.Scanner;

public class Q2GetTheLastDigitOfANumber {
    static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = inputNumber.nextInt();
        int lastDigit = number %10;

        System.out.println("The last digit of "+number+ " is: " +lastDigit);
        inputNumber.close();

    }
}
