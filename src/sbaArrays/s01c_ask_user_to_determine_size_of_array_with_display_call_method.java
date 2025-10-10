package sbaArrays;

import java.util.Scanner;

public class s01c_ask_user_to_determine_size_of_array_with_display_call_method {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in); // (3) create Scanner object for user input

        int[] someArray; // (4) declare an array variable (no size yet)

        // (5) ask the user for array size
        System.out.println("How many elements to store?");
        int size = keyboard.nextInt(); // (6) read user input

        // (7) create an array with the given size
        someArray = new int[size];

        // (8) call the display method and give it our array
        displayTemps(someArray);

        keyboard.close(); // (9) close Scanner to clean up resources
    }

    // ********** Method to process array **********
    /*
     (10) This method receives an array (temperatureIn)
          and prints its length to show how big it is.
    */
    static void displayTemps(int[] temperatureIn) {
        System.out.println(); // (11) print a blank line for spacing
        System.out.println("*** Your Array size is *** " + temperatureIn.length); // (12) print array length
        System.out.println(); // (13) another blank line for clarity
    }
}

