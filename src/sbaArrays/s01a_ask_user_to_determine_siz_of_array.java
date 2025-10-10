package sbaArrays;

import java.util.Scanner;

public class s01a_ask_user_to_determine_siz_of_array {
    static void main(String[] args) {


        Scanner keyboard = new Scanner(System.in);
        int[] someArray;
        System.out.println("How many elements to store?");
        int size = keyboard.nextInt();
        someArray = new int[size];
        System.out.println("You created an array of this size: " + size);
        keyboard.close();
    }
}
