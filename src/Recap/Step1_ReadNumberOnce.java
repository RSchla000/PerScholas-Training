package Recap;

import java.util.Scanner;

public class Step1_ReadNumberOnce {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any number: ");
        String text = sc.nextLine();
        try
        {int num = Integer.parseInt(text);
        System.out.println("Good you typed " + num);}
        catch (NumberFormatException e){
            System.out.println("Oops not a number");
        }

        sc.close();
    }
}
