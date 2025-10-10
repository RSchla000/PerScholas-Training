package Recap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_3 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i=0;i<3; i++){
            System.out.println("Enter a number " + (i+1)+":");
            try {
                numbers[i] = scanner.nextInt();
            } catch (InputMismatchException e){
                System.out.println("Invalid input");
                numbers[i] = 0;
                scanner.next();

            }
        }
        System.out.println("Numbers entered:");
        for (int i = 0; i<numbers.length; i++){
            System.out.println("Number" + (i+1)+":" + numbers[i]);
            scanner.close();
        }
    }

}
