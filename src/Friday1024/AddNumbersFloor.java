package Friday1024;

import java.util.Scanner;
import java.lang.Math;

/**
 * Program: Add two floating-point numbers and find the floor of their sum
 * Constraint: 0.1 < a, b < 10^6, with up to 8 decimal places
 */
public class AddNumbersFloor {

    /**
     * Function to add two numbers and return the floor of their sum
     * @param a first floating-point number
     * @param b second floating-point number
     * @return floor of (a + b)
     */
    public static long addNumbers(double a, double b) {
        // Step 1: Compute the sum
        double sum = a + b;

        // Step 2: Apply floor function and return as long integer
        return (long) Math.floor(sum);
    }

    public static void main(String[] args) {
        // Create scanner for input
        Scanner sc = new Scanner(System.in);

        // Step 1: Read two floating-point values
        double a = Double.parseDouble(sc.nextLine().trim());
        double b = Double.parseDouble(sc.nextLine().trim());

        // Step 2: Call the function
        long result = addNumbers(a, b);

        // Step 3: Display the result
        System.out.println(result);

        // Close scanner
        sc.close();
    }
}
