package Recap;

import java.util.Scanner;

public class Step4_SafeThreeNumbers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < numbers.length; i++) {
            while(true){
                System.out.println("Enter Number "+(i+1)+":");
                String input = sc.nextLine();
                try{
                    int num = Integer.parseInt(input);
                    numbers[i] = num;
                    break;
                }
                catch (NumberFormatException e){
                    System.out.println("Invalid input! Please type a number.");
                }
            }

            System.out.println("\nYou entered:");
            for (int j = 0; j <numbers.length ; i++) {
                System.out.println("numbers["+i+"]=" +numbers[i]);
            }
            sc.close();
        }
    }
}
