package Recap;

import java.util.Scanner;

public class Step3_RepeatUntilValid {



    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String text = sc.nextLine();
while(true) {

    try {
        int num = Integer.parseInt(text);
        System.out.println("You typed " + num);
        break;
    }
    catch (NumberFormatException e) {
        System.out.println("Please type a number! Try again.\n");
    }
    sc.close();
}
    }
}
