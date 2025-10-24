package Friday1024;

import java.util.Scanner;

public class LastAndSecondLast {

    /**
     * Function to return last two characters reversed, separated by space
     * @param word the input string
     * @return string containing last two characters reversed
     */
    public static String lastLetters(String word) {
        int n = word.length();
        char lastChar = word.charAt(n - 1);        // last character
        char secondLastChar = word.charAt(n - 2);  // second-to-last character

        return lastChar + " " + secondLastChar;    // reversed with space
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input string
        String word = sc.nextLine().trim();

        // Compute last two characters reversed
        String result = lastLetters(word);

        // Output result
        System.out.println(result);

        sc.close();
    }
}