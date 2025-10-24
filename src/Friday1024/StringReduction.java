package Friday1024;

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class StringReduction {

    /**
     * Function to compute minimum deletions for all substrings to be distinct
     * @param s input string
     * @return minimum number of deletions required
     */
    public static int getMinDeletions(String s) {
        Set<Character> charSet = new HashSet<>();

        // Step 1: add all characters to the set (automatically keeps them distinct)
        for (char c : s.toCharArray()) {
            charSet.add(c);
        }

        // Step 2: compute minimum deletions
        int deletions = s.length() - charSet.size();
        return deletions;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input string
        String s = sc.nextLine().trim();

        // Compute minimum deletions
        int result = getMinDeletions(s);

        // Output result
        System.out.println(result);

        sc.close();
    }
}