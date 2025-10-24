package Friday1024;

import java.util.*;

public class DoubleOnMatch {
    public static long doubleSize(long[] arr, long num) {
        Arrays.sort(arr); // Step 1: Sort the array

        for (long x : arr) { // Step 2: Iterate over array
            if (x == num) {
                num *= 2; // Double when matched
            }
        }

        return num; // Step 3: Return final value
    }

    public static void main(String[] args) {
        long[] arr = {1, 2, 4, 11, 12, 8};
        long num = 2;

        long result = doubleSize(arr, num);
        System.out.println("Maximum possible value of num = " + result);
    }
}
