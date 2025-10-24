package Friday1024;

import java.util.Scanner;

public class JumpToFlag {

    /**
     * Calculate minimum jumps to reach the flag
     * @param flagHeight the height of the flag
     * @param bigJump the height of the big jump
     * @return minimum number of jumps needed
     */
    public static int jumps(int flagHeight, int bigJump) {
        int maxBigJumps = flagHeight / bigJump;    // number of big jumps
        int remainder = flagHeight % bigJump;     // remaining height to cover with 1-unit jumps
        return maxBigJumps + remainder;           // total minimum jumps
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int flagHeight = Integer.parseInt(sc.nextLine().trim());
        int bigJump = Integer.parseInt(sc.nextLine().trim());

        // Compute minimum jumps
        int result = jumps(flagHeight, bigJump);

        // Output result
        System.out.println(result);

        sc.close();
    }
}
