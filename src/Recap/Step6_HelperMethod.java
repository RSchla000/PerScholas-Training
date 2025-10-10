package Recap;

import java.util.Scanner;

public class Step6_HelperMethod {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = readInt(sc,"Enter a number safely: ");
        System.out.println("You typed: " + number);

        sc.close();
    }
    static int readInt(Scanner sc, String prompt){
        while(true){
            System.out.print(prompt);
            String text = sc.nextLine();
            try{
                return Integer.parseInt(text);
            }
            catch (NumberFormatException e){
            }
            System.out.println("Please type a number!");
        }

    }
}
